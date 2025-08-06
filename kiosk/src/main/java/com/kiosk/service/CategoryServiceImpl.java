package com.kiosk.service;

import com.kiosk.dto.CategoryDTO;
import com.kiosk.dto.mapper.CategoryMapper;
import com.kiosk.entity.CategoryEntity;
import com.kiosk.entity.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryDTO> getAll() {
        return categoryRepository.findAll().stream()
                .map(categoryMapper::toDTO)
                .collect(Collectors.toList());
    }

    public CategoryDTO addCategory(CategoryDTO categoryDTO) {
        CategoryEntity entity = categoryMapper.toEntity(categoryDTO);
        entity = categoryRepository.save(entity);

        return categoryMapper.toDTO(entity);
    }

}
