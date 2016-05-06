package com.mymock.webproxy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArestController {

    private static final String BASE_MAPPING = "/api/{r}";
    
	@RequestMapping(value = BASE_MAPPING, method = RequestMethod.OPTIONS)
//	@RequestMapping(value = BASE_MAPPING, method = RequestMethod.HEAD)
//	@RequestMapping(value = BASE_MAPPING, method = RequestMethod.GET)
//
//	@RequestMapping(value = BASE_MAPPING, method = RequestMethod.GET,
//			produces = { "application/x-spring-data-compact+json", "text/uri-list" })
//	
//	@RequestMapping(value = BASE_MAPPING, method = RequestMethod.POST)
//	@RequestMapping(value = BASE_MAPPING + "/{id}", method = RequestMethod.OPTIONS)
//	@RequestMapping(value = BASE_MAPPING + "/{id}", method = RequestMethod.HEAD)
//	@RequestMapping(value = BASE_MAPPING + "/{id}", method = RequestMethod.GET)
//	@RequestMapping(value = BASE_MAPPING + "/{id}", method = RequestMethod.PUT)
//	@RequestMapping(value = BASE_MAPPING + "/{id}", method = RequestMethod.PATCH)
//	@RequestMapping(value = BASE_MAPPING + "/{id}", method = RequestMethod.DELETE)
	
	public String allPossibles() {
	    return null;
	}
}
