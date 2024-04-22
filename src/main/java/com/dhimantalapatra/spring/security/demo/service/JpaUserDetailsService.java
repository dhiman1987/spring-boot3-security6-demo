package com.dhimantalapatra.spring.security.demo.service;

import com.dhimantalapatra.spring.security.demo.SecureUser;
import com.dhimantalapatra.spring.security.demo.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JpaUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public JpaUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository
                .findByUsername(username)
                .map(SecureUser::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
