package com.kiosk.controller;

import com.kiosk.dto.IngredientDTO;

import com.kiosk.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping("/ingredients")
    public List<IngredientDTO> getIngredient() {
        return ingredientService.getAll();
    }
    @PostMapping("/ingredients")
    public IngredientDTO addIngredient(@RequestBody IngredientDTO ingredientDTO) {
        return ingredientService.addIngredient(ingredientDTO);
    }



}

