package com.acyuta.rf.configuration.controller;

import com.acyuta.rf.configuration.service.UserService;
import com.acyuta.rf.rafantasyShared.dto.config.UserDto;
import com.acyuta.rf.rafantasyShared.dto.config.UserListRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/config/users")
public class ConfigController {

    private final UserService userService;

    @GetMapping("/{id}")
    public UserDto fetchById(@PathVariable("id") Long id) {

        return userService.fetchUserById(id);
    }

    @PostMapping()
    public UserDto add(@RequestBody UserDto userDto) {
        return userService.addUser(userDto);
    }

    @PostMapping("/multiple-ids")
    public List<UserDto> fetchMultipleUsers(@RequestBody UserListRequestDto userListRequestDto) {
        return userService.fetchMultipleUsers(userListRequestDto);
    }

    @PutMapping("/save-users")
    public List<UserDto> saveMultipleUsers(@RequestBody List<UserDto> userDtos) {
        return userService.saveMultipleUsers(userDtos);
    }
}
