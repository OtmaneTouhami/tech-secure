package com.api.tech_secure.service.impl;

import com.api.tech_secure.dto.UserDto;
import com.api.tech_secure.mapper.UserMapper;
import com.api.tech_secure.model.User;
import com.api.tech_secure.repository.UserRepository;
import com.api.tech_secure.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;


    @Override
    public UserDto createUser(UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        User savedUser = userRepository.save(user);
        return userMapper.toDto(savedUser);
    }

    @Override
    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User not found")
        );
        return userMapper.toDto(user);
    }

    @Override
    public UserDto getUserByUsername(String username) {
        User user = userRepository.findByUsername(username).orElseThrow(
                () -> new RuntimeException("User not found")
        );
        return userMapper.toDto(user);
    }

    @Override
    public List<UserDto> getUsers() {
        List<User> users = userRepository.findAll();
        return userMapper.toDto(users);
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDto) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User not found")
        );
        User updatedUser = userRepository.save(userMapper.partialUpdate(userDto, user));
        return userMapper.toDto(updatedUser);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDto getUserByEmail(String email) {
        User user = userRepository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("User not found")
        );
        return userMapper.toDto(user);
    }
}
