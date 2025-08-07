package com.kiosk.service;

import com.kiosk.dto.OptionalIngredientDTO;

import java.util.List;

public interface OptionalIngredientService {
    List<OptionalIngredientDTO> getAll();
    OptionalIngredientDTO addOptionalIngredient(OptionalIngredientDTO optionalIngredientDTO);
}