package com.kiosk.controller;

import com.kiosk.dto.IngredientDTO;
import com.kiosk.dto.OptionalIngredientDTO;
import com.kiosk.service.IngredientService;
import com.kiosk.service.OptionalIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OptionalIngredientController {

    @Autowired
    private OptionalIngredientService optionalIngredientService;

    @GetMapping("/optionalingredients")
    public List<OptionalIngredientDTO> getOptionalIngredient() {
        return optionalIngredientService.getAll();
    }
    @PostMapping("/optionalingredients")
    public OptionalIngredientDTO addOptionalIngredient(@RequestBody OptionalIngredientDTO optionalIngredientDTO) {
        return optionalIngredientService.addOptionalIngredient(optionalIngredientDTO);
    }



}

