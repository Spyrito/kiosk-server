package com.kiosk.controller;

import com.kiosk.dto.AllergenDTO;
import com.kiosk.dto.CategoryDTO;
import com.kiosk.service.AllergenService;
import com.kiosk.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AllergenController {

    @Autowired
    private AllergenService allergenService;

    @GetMapping("/allergens")
    public List<AllergenDTO> getAllergens() {
        return allergenService.getAll();
    }
    @PostMapping("/allergens")
    public AllergenDTO addAllergen(@RequestBody AllergenDTO allergenDTO) {
        return allergenService.addAllergen(allergenDTO);
    }



}
