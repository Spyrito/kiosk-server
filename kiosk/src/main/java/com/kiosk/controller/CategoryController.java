package com.kiosk.controller;

import com.kiosk.dto.CategoryDTO;
import com.kiosk.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<CategoryDTO> getCategories() {
        return categoryService.getAll();
    }
    @PostMapping("/categories")
    public CategoryDTO addCategory(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.addCategory(categoryDTO);
    }



}
