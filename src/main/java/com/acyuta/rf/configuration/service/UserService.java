package com.acyuta.rf.configuration.service;

import com.acyuta.rf.rafantasyShared.dto.config.UserDto;
import com.acyuta.rf.rafantasyShared.dto.config.UserListRequestDto;
import com.acyuta.rf.rafantasyShared.dto.config.UserTotalUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    UserDto fetchUserById(Long id);

    UserDto addUser(UserDto userDto);

    List<UserDto> fetchMultipleUsers(UserListRequestDto userListRequestDto);

    List<UserDto> saveMultipleUsers(List<UserDto> userDtos);

    void updateTotalPoints(UserTotalUpdateDto userTotalUpdateDto);
}
