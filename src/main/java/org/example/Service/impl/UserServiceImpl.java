package org.example.Service.impl;

import org.example.Dao.UsersDao;
import org.example.Domain.Users;
import org.example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    UsersDao usersDao;
    @Bean
    public List <Users> selectAll() {return usersDao.selectAll();

    }
}
