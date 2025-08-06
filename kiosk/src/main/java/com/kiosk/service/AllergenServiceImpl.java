package com.kiosk.service;

import com.kiosk.dto.AllergenDTO;
import com.kiosk.dto.IngredientDTO;
import com.kiosk.dto.mapper.AllergenMapper;
import com.kiosk.dto.mapper.IngredientMapper;
import com.kiosk.entity.AllergenEntity;
import com.kiosk.entity.IngredientEntity;
import com.kiosk.entity.repository.AllergenRepository;
import com.kiosk.entity.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AllergenServiceImpl implements AllergenService {

    @Autowired
    private AllergenMapper allergenMapper;

    @Autowired
    private AllergenRepository allergenRepository;

    @Override
    public List<AllergenDTO> getAll() {
        return allergenRepository.findAll().stream()
                .map(allergenMapper::toDTO)
                .collect(Collectors.toList());
    }

    public AllergenDTO addAllergen(AllergenDTO allergenDTO) {
        AllergenEntity entity = allergenMapper.toEntity(allergenDTO);
        entity = allergenRepository.save(entity);

        return allergenMapper.toDTO(entity);
    }

}