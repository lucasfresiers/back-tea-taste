package com.lucas.teataste.controllers;

import com.lucas.teataste.entities.DegustationEntity;
import com.lucas.teataste.entities.VarieteEntity;
import com.lucas.teataste.repository.DegustationRepository;
import com.lucas.teataste.repository.VarieteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class DegustationController {

    @Autowired
    private DegustationRepository degustationRepository;

    @GetMapping("/degustations")
    public List<DegustationEntity> getDegustations(){
        return this.degustationRepository.findAll();
    }
}
