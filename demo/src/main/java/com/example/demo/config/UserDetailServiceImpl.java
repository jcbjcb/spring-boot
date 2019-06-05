package com.example.demo.config;

import com.example.demo.serivce.UserService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author jcb
 * @version : UserDetailServiceImpl, v 0.1 2019/6/4 14:07 jcb Exp$
 * @Description:
 */
@Component
public class UserDetailServiceImpl implements UserDetailsService {
    /**
     * 用户校验
     * @param s
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Collection<GrantedAuthority> collection = new ArrayList<>();//权限集合
        String password = new BCryptPasswordEncoder().encode("123456");
        User user = new User(s,password,collection);

        return user;
    }

}
