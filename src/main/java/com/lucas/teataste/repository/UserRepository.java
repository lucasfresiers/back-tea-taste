package com.lucas.teataste.repository;

import com.lucas.teataste.entities.UserEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository<UserEntity, Integer> {

    List<UserEntity> findAll();

    UserEntity save(UserEntity user);
}
