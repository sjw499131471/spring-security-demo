package com.example.securingweb.model;

import org.springframework.security.core.GrantedAuthority;

public class MyRole implements GrantedAuthority {
    @Override
    public String getAuthority() {
        return "ROLE_USER";
    }
}
