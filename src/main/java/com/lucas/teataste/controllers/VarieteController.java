package com.lucas.teataste.controllers;

import com.lucas.teataste.entities.PaysEntity;
import com.lucas.teataste.entities.VarieteEntity;
import com.lucas.teataste.repository.PaysRepository;
import com.lucas.teataste.repository.VarieteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class VarieteController {

    @Autowired
    private VarieteRepository varieteRepository;

    @GetMapping("/varietes")
    public List<VarieteEntity> getVarietes(){
        return this.varieteRepository.findAll();
    }
}
