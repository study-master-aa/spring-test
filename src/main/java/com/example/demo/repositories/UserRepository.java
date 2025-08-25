package com.example.demo.repositories;

import com.example.demo.models.UserDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public List<UserDto> findAll() {
        List<UserDto> users = new ArrayList<>();
        users.add(new UserDto("user1", 30L));
        users.add(new UserDto("user2", 40L));
        users.add(new UserDto("user3", 50L));
        return users;
    }
}
