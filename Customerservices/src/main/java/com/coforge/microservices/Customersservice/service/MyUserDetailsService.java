package com.coforge.microservices.Customersservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.coforge.microservices.Customersservice.model.MyUserDetails;
import com.coforge.microservices.Customersservice.model.User;
import com.coforge.microservices.Customersservice.repo.UserRepository;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    	
    	Optional<User> user = userRepository.findByUserName(userName);
        System.out.println(user);
        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

        return user.map(MyUserDetails::new).get();
    }
}

//UserDetails 
