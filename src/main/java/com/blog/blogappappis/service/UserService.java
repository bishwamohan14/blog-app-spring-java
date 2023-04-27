package com.blog.blogappappis.service;

import com.blog.blogappappis.entity.User;
import com.blog.blogappappis.payloads.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    UserDto createUser(UserDto userDto);
    UserDto updateUser(UserDto user,Integer userId);
    UserDto getUserById(Integer userId);
    List<UserDto> getAllUsers();
    void deleteUser(Integer userId);
}
