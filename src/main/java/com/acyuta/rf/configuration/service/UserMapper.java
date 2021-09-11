package com.acyuta.rf.configuration.service;

import com.acyuta.rf.configuration.model.Users;
import org.mapstruct.Mapper;
import  com.acyuta.rf.rafantasyShared.dto.config.UserDto;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class UserMapper {
   public abstract UserDto toDto(Users user);

   public abstract Users fromDto(UserDto userDto);
}
