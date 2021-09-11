package com.acyuta.rf.configuration.service;

import com.acyuta.rf.rafantasyShared.dto.config.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

public interface UserService {

    UserDto fetchUserById(Long id);

    UserDto addUser(UserDto userDto);
}
