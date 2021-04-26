package com.geekbrains.geekmarket.services;

import com.geekbrains.geekmarket.entites.SystemUser;
import com.geekbrains.geekmarket.entites.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUserName(String userName);
    boolean save(SystemUser systemUser);
}
