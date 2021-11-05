package com.acyuta.rf.configuration.service;

import com.acyuta.rf.configuration.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    List<Users> findByIdIn(List<Long> ids);
}
