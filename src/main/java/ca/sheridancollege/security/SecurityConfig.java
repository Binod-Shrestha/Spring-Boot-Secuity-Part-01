package ca.sheridancollege.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig {
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication() // stored here

				.passwordEncoder(NoOpPasswordEncoder.getInstance()) // is how we encrpt the password.

				.withUser("binod").password("binod").roles("ADMIN", "PICKLE").and().withUser("puja").password("puja")
				.roles("User");
	}

}
