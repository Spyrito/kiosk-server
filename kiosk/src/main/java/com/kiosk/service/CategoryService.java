package com.kiosk.service;

import com.kiosk.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAll();
    CategoryDTO addCategory(CategoryDTO categoryDTO);
}
