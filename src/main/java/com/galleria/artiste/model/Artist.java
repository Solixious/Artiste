package com.galleria.artiste.model;

import com.galleria.artiste.model.common.BaseEntity;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.Collection;

@Data
@Entity
public class Artist extends BaseEntity implements UserDetails {

    private String email;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String displayPicture;

    @Transient
    private Collection<? extends GrantedAuthority> authorities;

    public Artist(String username, String password,
        Collection<? extends GrantedAuthority> authorities) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
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
