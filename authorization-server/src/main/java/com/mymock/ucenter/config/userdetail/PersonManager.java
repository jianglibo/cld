package com.mymock.ucenter.config.userdetail;

import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Component;

import com.mymock.ucenter.domain.Person;
import com.mymock.ucenter.domain.Role;
import com.mymock.ucenter.repository.PersonRepository;
import com.mymock.ucenter.repository.RoleRepository;
import com.mymock.ucenter.utils.CommonRoleNames;
import com.mymock.ucenter.utils.OneTwo;
import com.mymock.ucenter.vo.PersonVo;

@Component
public class PersonManager implements UserDetailsManager {
	
	private static final String ROLE_PREFIX = "ROLE_";
	
    private static Pattern mobilePtn = Pattern.compile("^[0-9+-]+$");
    
    private static Logger logger = LoggerFactory.getLogger(PersonManager.class);
    
    private PersonRepository personRepo;
    
    private RoleRepository roleRepo;
    
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    public PersonManager(PersonRepository personRepo, RoleRepository roleRepo) {
        this.personRepo = personRepo;
        this.roleRepo = roleRepo;
    }

    @Override
    public PersonVo loadUserByUsername(String emailOrMobile) throws UsernameNotFoundException {
        Person person;
        
        if (emailOrMobile.indexOf('@') != -1) {
            person = personRepo.findByEmail(emailOrMobile);
        } else if(mobilePtn.matcher(emailOrMobile).find()) {
            person = personRepo.findByMobile(emailOrMobile);
        } else {
            person = personRepo.findByName(emailOrMobile); 
        }
        if (person == null) {
            throw new UsernameNotFoundException(emailOrMobile);
        }
        return new PersonVo(person);
    }

    @Override
    public void createUser(UserDetails user) {
       PersonVo personVo = (PersonVo) user;
       
      // @formatter:off
       Set<Role> roleset = personVo.getAuthorities().stream()
    		   .map(ga -> ga.getAuthority())
    		   .map(gn -> gn.startsWith(ROLE_PREFIX) ? gn : ROLE_PREFIX + gn)
    		   .map(rn -> new OneTwo<String, Role>(rn, roleRepo.findByName(rn)))
    		   .map(ot -> {
    			   if (ot.getTwo() == null ) {
    				   Role r = new Role(ot.getOne());
    				   return roleRepo.save(r);
    			   } else {
    				   return ot.getTwo();
    			   }
    		   }).collect(Collectors.toSet());
       // @formatter:on
       
	   if (!roleset.stream().anyMatch(r -> CommonRoleNames.ROLE_USER.equals(r.getName()))) {
		   roleset.add(getOrCreateDefaultRole());
	   }
       
       Person person = new Person(personVo, passwordEncoder.encode(personVo.getPassword()));
       person.getRoles().addAll(roleset);
       if (person.getName() == null) {
           person.setName(UUID.randomUUID().toString().replaceAll("-", ""));
       }
       personRepo.save(person);
    }
    
    private Role getOrCreateDefaultRole() {
    	Role r = roleRepo.findByName("ROLE_USER");
    	if (r != null) {
    		return r;
    	} else {
    		return roleRepo.save(new Role("ROLE_USER"));
    	}
    }

    @Override
    public void updateUser(UserDetails user) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteUser(String username) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {
		Authentication currentUser = SecurityContextHolder.getContext()
				.getAuthentication();

		if (currentUser == null) {
			// This would indicate bad coding somewhere
			throw new AccessDeniedException(
					"Can't change password as no Authentication object found in context "
							+ "for current user.");
		}

		String username = currentUser.getName();
		// If an authentication manager has been set, re-authenticate the user with the
		// supplied password.
		if (authenticationManager != null) {
			logger.debug("Reauthenticating user '" + username
					+ "' for password change request.");
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					username, oldPassword));
		}
		else {
			logger.debug("No authentication manager set. Password won't be re-checked.");
		}

		logger.debug("Changing password for user '" + username + "'");
		PersonVo pvo = (PersonVo)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Person p = personRepo.findOne(pvo.getId());		
		p.setPassword(passwordEncoder.encode(newPassword));		
		personRepo.save(p);
		SecurityContextHolder.getContext().setAuthentication(
				createNewAuthentication(currentUser, newPassword));
//		userCache.removeUserFromCache(username);
    }
    
	protected Authentication createNewAuthentication(Authentication currentAuth,
			String newPassword) {
		UserDetails user = loadUserByUsername(currentAuth.getName());
		UsernamePasswordAuthenticationToken newAuthentication = new UsernamePasswordAuthenticationToken(
				user, null, user.getAuthorities());
		newAuthentication.setDetails(currentAuth.getDetails());
		return newAuthentication;
	}

    public boolean userExists(String emailOrUsernameOrMobile,String tag) {
    	Person person;
    	switch(tag){
    	case "username":
            person = personRepo.findByName(emailOrUsernameOrMobile);
            break;
    	case "email":
            person = personRepo.findByEmail(emailOrUsernameOrMobile);
            break;
    	case "mobile":
            person = personRepo.findByMobile(emailOrUsernameOrMobile);
            break; 
        default:
            	person = null;
    	}
    	if(person == null){
            return false;
    	}else{
    		return true;
    	}
    }
    
    public Person findByName(String username){
    	return personRepo.findByName(username);
    }
    
	@Override
	public boolean userExists(String username) {
		// TODO Auto-generated method stub
		return false;
	}
    
    //~ UserDetailsManager implementation ==============================================================================

//    public void createUser(final UserDetails user) {
//        validateUserDetails(user);
//        getJdbcTemplate().update(createUserSql, new PreparedStatementSetter() {
//            public void setValues(PreparedStatement ps) throws SQLException {
//                ps.setString(1, user.getUsername());
//                ps.setString(2, user.getPassword());
//                ps.setBoolean(3, user.isEnabled());
//            }
//
//        });
//
//        if (getEnableAuthorities()) {
//            insertUserAuthorities(user);
//        }
//    }
//
//    public void updateUser(final UserDetails user) {
//        validateUserDetails(user);
//        getJdbcTemplate().update(updateUserSql, new PreparedStatementSetter() {
//            public void setValues(PreparedStatement ps) throws SQLException {
//                ps.setString(1, user.getPassword());
//                ps.setBoolean(2, user.isEnabled());
//                ps.setString(3, user.getUsername());
//            }
//        });
//
//        if (getEnableAuthorities()) {
//            deleteUserAuthorities(user.getUsername());
//            insertUserAuthorities(user);
//        }
//
//        userCache.removeUserFromCache(user.getUsername());
//    }
//
//    private void insertUserAuthorities(UserDetails user) {
//        for (GrantedAuthority auth : user.getAuthorities()) {
//            getJdbcTemplate().update(createAuthoritySql, user.getUsername(), auth.getAuthority());
//        }
//    }
//
//    public void deleteUser(String username) {
//        if (getEnableAuthorities()) {
//            deleteUserAuthorities(username);
//        }
//        getJdbcTemplate().update(deleteUserSql, username);
//        userCache.removeUserFromCache(username);
//    }
//
//    private void deleteUserAuthorities(String username) {
//        getJdbcTemplate().update(deleteUserAuthoritiesSql, username);
//    }
//
//    public void changePassword(String oldPassword, String newPassword) throws AuthenticationException {
//        Authentication currentUser = SecurityContextHolder.getContext().getAuthentication();
//
//        if (currentUser == null) {
//            // This would indicate bad coding somewhere
//            throw new AccessDeniedException("Can't change password as no Authentication object found in context " +
//                    "for current user.");
//        }
//
//        String username = currentUser.getName();
//
//        // If an authentication manager has been set, re-authenticate the user with the supplied password.
//        if (authenticationManager != null) {
//            logger.debug("Reauthenticating user '"+ username + "' for password change request.");
//
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, oldPassword));
//        } else {
//            logger.debug("No authentication manager set. Password won't be re-checked.");
//        }
//
//        logger.debug("Changing password for user '"+ username + "'");
//
//        getJdbcTemplate().update(changePasswordSql, newPassword, username);
//
//        SecurityContextHolder.getContext().setAuthentication(createNewAuthentication(currentUser, newPassword));
//
//        userCache.removeUserFromCache(username);
//    }
//
//    protected Authentication createNewAuthentication(Authentication currentAuth, String newPassword) {
//        UserDetails user = loadUserByUsername(currentAuth.getName());
//
//        UsernamePasswordAuthenticationToken newAuthentication =
//                new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
//        newAuthentication.setDetails(currentAuth.getDetails());
//
//        return newAuthentication;
//    }
//
//    public boolean userExists(String username) {
//        List<String> users = getJdbcTemplate().queryForList(userExistsSql, new String[] {username}, String.class);
//
//        if (users.size() > 1) {
//            throw new IncorrectResultSizeDataAccessException("More than one user found with name '" + username + "'", 1);
//        }
//
//        return users.size() == 1;
//    }


}
