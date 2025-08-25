package com.example.demo.services;

import com.example.demo.models.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<UserDto> getUsers() {
        List<UserDto> users = new ArrayList<>();
        users.add(new UserDto("user1", 30L));
        users.add(new UserDto("user2", 40L));
        users.add(new UserDto("user3", 50L));
        return users;
    }
}
