package com.kiosk.service;

import com.kiosk.dto.CategoryDTO;
import com.kiosk.dto.IngredientDTO;
import com.kiosk.dto.mapper.CategoryMapper;
import com.kiosk.dto.mapper.IngredientMapper;
import com.kiosk.entity.CategoryEntity;
import com.kiosk.entity.IngredientEntity;
import com.kiosk.entity.repository.CategoryRepository;
import com.kiosk.entity.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientMapper ingredientMapper;

    @Autowired
    private IngredientRepository ingredientRepository;

    @Override
    public List<IngredientDTO> getAll() {
        return ingredientRepository.findAll().stream()
                .map(ingredientMapper::toDTO)
                .collect(Collectors.toList());
    }

    public IngredientDTO addIngredient(IngredientDTO ingredientDTO) {
        IngredientEntity entity = ingredientMapper.toEntity(ingredientDTO);
        entity = ingredientRepository.save(entity);

        return ingredientMapper.toDTO(entity);
    }

}