package com.kiosk.service;

import com.kiosk.dto.AllergenDTO;

import java.util.List;

public interface AllergenService {
    List<AllergenDTO> getAll();
    AllergenDTO addAllergen(AllergenDTO ingredientDTO);
}
