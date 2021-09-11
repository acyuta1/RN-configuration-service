package com.acyuta.rf.configuration.controller;

import com.acyuta.rf.configuration.service.UserService;
import com.acyuta.rf.rafantasyShared.dto.config.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

}
