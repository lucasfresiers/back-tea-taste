package com.lucas.teataste.repository;

import com.lucas.teataste.entities.UserEntity;
import com.lucas.teataste.entities.VarieteEntity;
import org.aspectj.weaver.ast.Var;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface VarieteRepository extends Repository<VarieteEntity, Integer> {

    List<VarieteEntity> findAll();
}
