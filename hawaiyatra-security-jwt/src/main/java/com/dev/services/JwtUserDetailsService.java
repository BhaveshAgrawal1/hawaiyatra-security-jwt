package com.dev.services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dev.models.AdminDetails;
import com.dev.repositories.AdminRepositorie;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private AdminRepositorie repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if("admin".equals(username)) {
			Set<SimpleGrantedAuthority> authorities = new HashSet<>();
	        authorities.add(new SimpleGrantedAuthority("ROLE_" + "ADMIN"));
	        
	        Optional<AdminDetails>  details = repo.findById("admin");
	        

	        return new User("admin", details.get().getPassword(), authorities);
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}
