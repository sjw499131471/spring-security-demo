package com.example.securingweb.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class User implements UserDetails {
    public User() {
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        MyRole role = new MyRole();
        authorities.add(role);
        return authorities;
    }

    @Override
    public String getPassword() {
        return "$2a$10$qpnCQ0wkqWaEV0/9MIYyoOAS9wCcQNo3dj3ycE2UexQxHZHSgeOKa";
//        return "123456";
    }

    @Override
    public String getUsername() {
        return "test";
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
