package com.kiosk.service;

import com.kiosk.dto.CategoryDTO;
import com.kiosk.dto.IngredientDTO;

import java.util.List;

public interface IngredientService {
    List<IngredientDTO> getAll();
    IngredientDTO addIngredient(IngredientDTO ingredientDTO);
}