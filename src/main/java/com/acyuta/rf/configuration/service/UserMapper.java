package com.acyuta.rf.configuration.service;

import com.acyuta.rf.configuration.model.Users;
import org.apache.catalina.User;
import org.mapstruct.Mapper;
import  com.acyuta.rf.rafantasyShared.dto.config.UserDto;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper
public abstract class UserMapper {

   public abstract UserDto toDto(Users user);

   @Mapping(target = "token", ignore = true)
   @Mapping(target = "updatedAt", ignore = true)
   public abstract Users fromDto(UserDto userDto);

   public abstract List<UserDto> userDtos(List<Users> users);

   public abstract List<Users> usersList(List<UserDto> users);
}
