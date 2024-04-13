//package com.archy.repsur.security;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
////@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//
////	@Autowired
////	private UserDetailsServiceImpl userDetailsImpl;
////	
////	@Bean
////	public BCryptPasswordEncoder passwordEncoder() {
////		return new BCryptPasswordEncoder();
////	}
////	
////	@Override
////	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////		auth.userDetailsService(userDetailsImpl).passwordEncoder(passwordEncoder());
////	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		
//		
////		http.authorizeRequests().antMatchers("/","/public/**","/login/**","/assets/**").permitAll().anyRequest().authenticated()
////		.and()
////		.formLogin().loginPage("/login/login").defaultSuccessUrl("/private/principal",true).failureUrl("/login/login?error=true")
////		.loginProcessingUrl("/login/login-post").permitAll()
////		.and()
////		.logout().logoutUrl("/logout").logoutSuccessUrl("/public/inicio");
//		
////		http.authorizeRequests().antMatchers("/public/**","/login/**","/assets/**").permitAll().anyRequest().authenticated()
////		.and()
////		.formLogin().loginPage("/login/login").defaultSuccessUrl("/private/principal",true).failureUrl("/login/login?error=true")
////		.loginProcessingUrl("/login/login-post").permitAll()
////		.and()
////		.logout().logoutUrl("/logout").logoutSuccessUrl("/public/inicio");
////		http.authorizeRequests().antMatchers("/","/public/**","/login/**","/assets/**").permitAll().anyRequest().authenticated()
//		
//		
//		
//		http
//		.csrf().disable()
//		.authorizeRequests()
//		.antMatchers("/**","/inicio/**","/publico/**","/login/**","/assets/**").permitAll()
//		.anyRequest().authenticated()		
//		.and()
//		.formLogin().loginPage("/publico/login").defaultSuccessUrl("/private/principal",true).failureUrl("/publico/login?error=true")
//		.loginProcessingUrl("/publico/login-post").permitAll()
//		.and()
//		.logout().logoutUrl("/logout").logoutSuccessUrl("/");
//	}
//
//
//}
