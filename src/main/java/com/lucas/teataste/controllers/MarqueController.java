package com.lucas.teataste.controllers;

import com.lucas.teataste.entities.MarqueEntity;
import com.lucas.teataste.entities.PaysEntity;
import com.lucas.teataste.repository.MarqueRepository;
import com.lucas.teataste.repository.PaysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class MarqueController {

    @Autowired
    private MarqueRepository marqueRepository;

    @GetMapping("/marques")
    public List<MarqueEntity> getMarques(){
        return this.marqueRepository.findAll();
    }
}
