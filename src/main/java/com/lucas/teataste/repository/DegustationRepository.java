package com.lucas.teataste.repository;

import com.lucas.teataste.entities.DegustationEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface DegustationRepository extends Repository<DegustationEntity, Integer> {

    List<DegustationEntity> findAll();
}
