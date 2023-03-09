package com.lucas.teataste.controllers;

import com.lucas.teataste.entities.PaysEntity;
import com.lucas.teataste.entities.UserEntity;
import com.lucas.teataste.repository.PaysRepository;
import com.lucas.teataste.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class PaysController {

    @Autowired
    private PaysRepository paysRepository;

    @GetMapping("/pays")
    public List<PaysEntity> getPays(){
        return this.paysRepository.findAll();
    }
}
