package com.lucas.teataste.repository;

import com.lucas.teataste.entities.MarqueEntity;
import com.lucas.teataste.entities.VarieteEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface MarqueRepository extends Repository<MarqueEntity, Integer> {

    List<MarqueEntity> findAll();
}
