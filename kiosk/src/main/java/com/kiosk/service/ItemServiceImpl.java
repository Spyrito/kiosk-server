package com.kiosk.service;

import com.kiosk.dto.CategoryDTO;
import com.kiosk.dto.ItemDTO;
import com.kiosk.dto.ItemIngredientDTO;
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
        entity.setAvailableQuantity(itemDTO.getAvailableQuantity() != null ? itemDTO.getAvailableQuantity() : 100);

        // Kategorie
        CategoryEntity category = categoryRepository.findById(itemDTO.getCategoryId())
                .orElseThrow(() -> new IllegalArgumentException("Category not found"));
        entity.setCategory(category);

        // Ingredience s množstvím
        if (itemDTO.getIngredients() != null && !itemDTO.getIngredients().isEmpty()) {
            Set<ItemIngredientEntity> itemIngredients = new HashSet<>();

            for (ItemIngredientDTO ingDto : itemDTO.getIngredients()) {
                IngredientEntity ingredient = ingredientRepository.findById(ingDto.getIngredientId())
                        .orElseThrow(() -> new IllegalArgumentException("Ingredient not found: " + ingDto.getIngredientId()));

                ItemIngredientEntity itemIngredient = new ItemIngredientEntity();
                itemIngredient.setItem(entity);
                itemIngredient.setIngredient(ingredient);
                itemIngredient.setQuantity(ingDto.getQuantity());

                itemIngredients.add(itemIngredient);
            }

            entity.setItemIngredients(itemIngredients);
        }

        // Alergeny
        if (itemDTO.getAllergenIds() != null && !itemDTO.getAllergenIds().isEmpty()) {
            Set<AllergenEntity> allergens = new HashSet<>(allergenRepository.findAllById(itemDTO.getAllergenIds()));
            entity.setAllergens(allergens);
        }

        // Volitelné ingredience
        if (itemDTO.getOptionalIngredientIds() != null && !itemDTO.getOptionalIngredientIds().isEmpty()) {
            Set<OptionalIngredientEntity> optionalIngredients = new HashSet<>(optionalIngredientRepository.findAllById(itemDTO.getOptionalIngredientIds()));
            entity.setOptionalIngredients(optionalIngredients);
        }

        ItemEntity saved = itemRepository.save(entity);
        return itemMapper.toDTO(saved);
    }







}
