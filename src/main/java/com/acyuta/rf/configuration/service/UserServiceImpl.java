package com.acyuta.rf.configuration.service;

import com.acyuta.rf.rafantasyShared.dto.config.UserDto;
import com.acyuta.rf.rafantasyShared.dto.config.UserListRequestDto;
import com.acyuta.rf.rafantasyShared.dto.config.UserTotalUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

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

    @Override
    public List<UserDto> fetchMultipleUsers(UserListRequestDto userListRequestDto) {
        return userMapper.userDtos(userRepository.findByIdIn(userListRequestDto.getUserIds()));
    }

    @Override
    public List<UserDto> saveMultipleUsers(List<UserDto> userDtos) {
        return userMapper.userDtos(userRepository.saveAll(userMapper.usersList(userDtos)));
    }

    @Override
    public void updateTotalPoints(UserTotalUpdateDto userTotalUpdateDto) {
        var userDto = fetchUserById(userTotalUpdateDto.getUserId());

        userDto.setTotalPoints(userTotalUpdateDto.getTotalPoints());
        userRepository.save(userMapper.fromDto(userDto));
    }
}
