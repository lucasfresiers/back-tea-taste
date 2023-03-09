package com.lucas.teataste.repository;

import com.lucas.teataste.entities.PaysEntity;
import com.lucas.teataste.entities.UserEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PaysRepository extends Repository<PaysEntity, Integer> {

    List<PaysEntity> findAll();
}
