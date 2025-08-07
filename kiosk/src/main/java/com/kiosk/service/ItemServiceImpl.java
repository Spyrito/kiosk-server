package com.kiosk.service;

import com.kiosk.dto.CategoryDTO;
import com.kiosk.dto.ItemDTO;
import com.kiosk.dto.mapper.CategoryMapper;
import com.kiosk.dto.mapper.ItemMapper;
import com.kiosk.entity.*;
import com.kiosk.entity.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
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

    public ItemDTO addItem(ItemDTO itemDTO) {
        ItemEntity entity = new ItemEntity();

        entity.setName(itemDTO.getName());
        entity.setDescription(itemDTO.getDescription());
        entity.setPrice(itemDTO.getPrice());
        entity.setImageUrl(itemDTO.getImageUrl());
        entity.setAvailableQuantity(100); // nastav dle potřeby

        // Kategorie
        CategoryEntity category = categoryRepository.findById(itemDTO.getCategoryId())
                .orElseThrow(() -> new IllegalArgumentException("Category not found"));
        entity.setCategory(category);

        // Ingredience
        if (itemDTO.getIngredientIds() != null && !itemDTO.getIngredientIds().isEmpty()) {
            Set<IngredientEntity> ingredients = new HashSet<>(ingredientRepository.findAllById(itemDTO.getIngredientIds()));
            ingredients.forEach(ingredient -> ingredient.setItem(entity));
            entity.setIngredients(ingredients);
        }

        // Alergeny
        if (itemDTO.getAllergenIds() != null && !itemDTO.getAllergenIds().isEmpty()) {
            Set<AllergenEntity> allergens = new HashSet<>(allergenRepository.findAllById(itemDTO.getAllergenIds()));
            allergens.forEach(allergen -> allergen.setItem(entity));
            entity.setAllergens(allergens);
        }

        // Volitelné ingredience
        if (itemDTO.getOptionalIngredientIds() != null && !itemDTO.getOptionalIngredientIds().isEmpty()) {
            Set<OptionalIngredientEntity> optionalIngredients = new HashSet<>(optionalIngredientRepository.findAllById(itemDTO.getOptionalIngredientIds()));
            optionalIngredients.forEach(opt -> opt.setItem(entity));
            entity.setOptionalIngredients(optionalIngredients);
        }

        ItemEntity saved = itemRepository.save(entity);
        return itemMapper.toDTO(saved);
    }






}
