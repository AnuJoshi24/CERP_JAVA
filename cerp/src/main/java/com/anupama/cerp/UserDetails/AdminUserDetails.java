package com.anupama.cerp.UserDetails;

import com.anupama.cerp.entities.Admin;
import com.anupama.cerp.repository.AdminRepository;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
@NoArgsConstructor
public class AdminUserDetails implements UserDetails {

    private String email;
    private String password;

    public AdminUserDetails(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public AdminUserDetails(Admin admin){
        this.email= admin.getEmail();
        this.password=admin.getPassword();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ADMIN"));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
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
