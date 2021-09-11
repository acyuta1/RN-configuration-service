package com.acyuta.rf.configuration.service;

import com.acyuta.rf.rafantasyShared.dto.config.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDto fetchUserById(Long id) {
        var user = userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "user.not.found"));
        return userMapper.toDto(user);
    }

    @Override
    public UserDto addUser(UserDto userDto) {
        var user = userMapper.fromDto(userDto);
        return userMapper.toDto(userRepository.save(user));
    }
}
