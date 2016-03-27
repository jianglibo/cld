package com.mymock.ucenter.utils;

import java.util.stream.Stream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.mymock.ucenter.domain.Person;
import com.mymock.ucenter.repository.PersonRepository;
import com.mymock.ucenter.vo.PersonVo;
import com.mymock.ucenter.vo.ThirdPartLoginAuthenticationToken;

@Component
public class UcSecurityUtil {

    @Autowired
    private PersonRepository personRepo;

    private AuthenticationTrustResolver trustResolver = new AuthenticationTrustResolverImpl();

    public boolean isAuthenticated() {
        Authentication au = SecurityContextHolder.getContext().getAuthentication();
        return au.isAuthenticated();
    }

    public boolean isAnonymous() {
        Authentication au = SecurityContextHolder.getContext().getAuthentication();
        return trustResolver.isAnonymous(au);
    }

    public PersonVo principle() {
        Authentication au = SecurityContextHolder.getContext().getAuthentication();
        if (au.isAuthenticated() && au.getPrincipal() instanceof PersonVo) {
            return (PersonVo) au.getPrincipal();
        }
        return null;
    }

    public Person loginedPerson() {
        Authentication au = SecurityContextHolder.getContext().getAuthentication();
        if (au.isAuthenticated() && au.getPrincipal() instanceof PersonVo) {
            String email = ((PersonVo) au.getPrincipal()).getEmail();
            return personRepo.findByEmail(email);
        }
        return null;
    }

    public boolean hasAnyRole(String... rns) {
        if (principle() == null) {
            return false;
        }
        return Stream.of(rns).map(rn -> rn.startsWith("ROLE_") ? rn : "ROLE_" + rn)
                .anyMatch(rn -> principle().getAuthorities().stream().anyMatch(au -> au.getAuthority().equals(rn)));
    }

    public void doLogin(Person person) {
        PersonVo personVo = new PersonVo(person);
        personVo.eraseCredentials();
        ThirdPartLoginAuthenticationToken tpla = new ThirdPartLoginAuthenticationToken(personVo);
        tpla.setAuthenticated(true);
        SecurityContextHolder.getContext().setAuthentication(tpla);
    }

    public void clearLogin(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        SecurityContext context = SecurityContextHolder.getContext();
        context.setAuthentication(null);
		SecurityContextHolder.clearContext();
    }

}
