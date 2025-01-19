/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devsibre.ConfigWebSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private ImplementsUserDetaisService userDetailsServer;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
				.authorizeRequests()
				.antMatchers(HttpMethod.GET,"/").permitAll()
		        .antMatchers(HttpMethod.GET, "/agendas_User").permitAll()
				.antMatchers(HttpMethod.GET, "/agendas_User/{id}").permitAll()
				.antMatchers(HttpMethod.POST, "/agendas_User").permitAll()
				.antMatchers(HttpMethod.GET, "/newagenda").hasRole("ADMIN")
				.antMatchers(HttpMethod.POST, "/newagenda").hasRole("ADMIN")
				.antMatchers(HttpMethod.POST, "/agendas").hasRole("ADMIN")
				.antMatchers(HttpMethod.GET, "/agendas").permitAll()
				.antMatchers(HttpMethod.GET,"/listarcadastro").hasRole("ADMIN")
				.antMatchers(HttpMethod.POST,"/listarcadastro").hasRole("ADMIN")
				.antMatchers(HttpMethod.GET,"/lista_patrimonio").hasRole("ADMIN")
				.antMatchers(HttpMethod.GET,"/listacantina").hasRole("ADMIN")
				.antMatchers(HttpMethod.POST,"/listacantina").hasRole("ADMIN")
				.antMatchers(HttpMethod.POST,"/editsave").permitAll()
				.antMatchers(HttpMethod.GET,"/familia").permitAll()

				//.antMatchers(HttpMethod.POST,"/listacantina").hasRole("USER")
				.antMatchers("/images/**").permitAll()
				.anyRequest().authenticated()
				.and().formLogin()
				.loginPage("/entrar")  // Página de login personalizada
				.defaultSuccessUrl("/bem_vindo", true)  // Página para redirecionar após login bem-sucedido
				.permitAll()
				.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/entrar"); // página padrão após fazer o logout

	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsServer).passwordEncoder(new BCryptPasswordEncoder());
	}
}
