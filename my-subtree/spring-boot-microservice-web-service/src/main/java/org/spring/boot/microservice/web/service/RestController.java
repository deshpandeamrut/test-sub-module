package org.spring.boot.microservice.web.service;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	 @RequestMapping("/hello")
	  public String handler() {
	     /* Authentication auth = SecurityContextHolder.getContext()
	                                                 .getAuthentication();
	      System.out.println("user: "+ auth.getName());
	      System.out.println("roles: "+ auth.getAuthorities());*/
	      return "hello!";
	  }
}
