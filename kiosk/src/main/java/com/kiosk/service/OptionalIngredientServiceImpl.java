package com.kiosk.service;

import com.kiosk.dto.AllergenDTO;
import com.kiosk.dto.OptionalIngredientDTO;
import com.kiosk.dto.mapper.AllergenMapper;
import com.kiosk.dto.mapper.OptionalIngredientMapper;
import com.kiosk.entity.AllergenEntity;
import com.kiosk.entity.OptionalIngredientEntity;
import com.kiosk.entity.repository.AllergenRepository;
import com.kiosk.entity.repository.OptionalIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OptionalIngredientServiceImpl implements OptionalIngredientService {

    @Autowired
    private OptionalIngredientMapper optionalIngredientMapper;

    @Autowired
    private OptionalIngredientRepository optionalIngredientRepository;

    @Override
    public List<OptionalIngredientDTO> getAll() {
        return optionalIngredientRepository.findAll().stream()
                .map(optionalIngredientMapper::toDTO)
                .collect(Collectors.toList());
    }

    public OptionalIngredientDTO addOptionalIngredient(OptionalIngredientDTO optionalIngredientDTO) {
        OptionalIngredientEntity entity = optionalIngredientMapper.toEntity(optionalIngredientDTO);
        entity = optionalIngredientRepository.save(entity);

        return optionalIngredientMapper.toDTO(entity);
    }

}