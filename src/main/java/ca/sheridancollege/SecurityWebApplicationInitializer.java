package ca.sheridancollege;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import ca.sheridancollege.security.SecurityConfig;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
	


public SecurityWebApplicationInitializer() {

super(SecurityConfig.class);

}
}