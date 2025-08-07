package com.kiosk.service;

import com.kiosk.dto.CategoryDTO;
import com.kiosk.dto.ItemDTO;
import com.kiosk.dto.mapper.CategoryMapper;
import com.kiosk.dto.mapper.ItemMapper;
import com.kiosk.entity.*;
import com.kiosk.entity.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private AllergenRepository allergenRepository;

    @Autowired
    private OptionalIngredientRepository optionalIngredientRepository;

    @Override
    public List<ItemDTO> getAll() {
        return itemRepository.findAll().stream()
                .map(itemMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ItemDTO addItem(ItemDTO itemDTO) {
        ItemEntity entity = new ItemEntity();

        entity.setName(itemDTO.getName());
        entity.setDescription(itemDTO.getDescription());
        entity.setPrice(itemDTO.getPrice());
        entity.setImageUrl(itemDTO.getImageUrl());
        entity.setAvailableQuantity(itemDTO.getAvailableQuantity()); // nastav dle potřeby

        CategoryEntity category = categoryRepository.findById(itemDTO.getCategoryId())
                .orElseThrow(() -> new IllegalArgumentException("Category not found"));
        entity.setCategory(category);

        // Ingredience
        List<IngredientEntity> ingredients = new ArrayList<>();
        if (itemDTO.getIngredientIds() != null && !itemDTO.getIngredientIds().isEmpty()) {
            ingredients = ingredientRepository.findAllById(itemDTO.getIngredientIds());
        }
        ingredients.forEach(ingredient -> ingredient.setItem(entity));
        entity.setIngredients(ingredients);

        // Alergeny
        List<AllergenEntity> allergens = new ArrayList<>();
        if (itemDTO.getAllergenIds() != null && !itemDTO.getAllergenIds().isEmpty()) {
            allergens = allergenRepository.findAllById(itemDTO.getAllergenIds());
        }
        allergens.forEach(allergen -> allergen.setItem(entity));
        entity.setAllergens(allergens);

        // Volitelné ingredience
        List<OptionalIngredientEntity> optionalIngredients = new ArrayList<>();
        if (itemDTO.getOptionalIngredientIds() != null && !itemDTO.getOptionalIngredientIds().isEmpty()) {
            optionalIngredients = optionalIngredientRepository.findAllById(itemDTO.getOptionalIngredientIds());
        }
        optionalIngredients.forEach(opt -> opt.setItem(entity));
        entity.setOptionalIngredients(optionalIngredients);

        ItemEntity saved = itemRepository.save(entity);
        return itemMapper.toDTO(saved);
    }


}
