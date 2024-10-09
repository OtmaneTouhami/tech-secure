package com.api.tech_secure.service;


import com.api.tech_secure.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserById(Long id);
    UserDto getUserByUsername(String username);
    List<UserDto> getUsers();
    UserDto updateUser(Long id, UserDto userDto);
    void deleteUser(Long id);
    UserDto getUserByEmail(String email);
}
