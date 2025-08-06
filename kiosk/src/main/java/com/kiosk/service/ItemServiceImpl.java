package com.kiosk.service;

import com.kiosk.dto.CategoryDTO;
import com.kiosk.dto.ItemDTO;
import com.kiosk.dto.mapper.CategoryMapper;
import com.kiosk.dto.mapper.ItemMapper;
import com.kiosk.entity.CategoryEntity;
import com.kiosk.entity.ItemEntity;
import com.kiosk.entity.repository.CategoryRepository;
import com.kiosk.entity.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<ItemDTO> getAll() {
        return itemRepository.findAll().stream()
                .map(itemMapper::toDTO)
                .collect(Collectors.toList());
    }

    /*
    @Override
    public ItemDTO addItem(ItemDTO itemDTO) {
        // Načteme kategorii, musí existovat
        CategoryEntity category = categoryRepository.findById(UUID.fromString(itemDTO.getCategoryId().toString()))
                .orElseThrow(() -> new IllegalArgumentException("Category not found"));

        // Vytvoříme item entity
        ItemEntity item = new ItemEntity();
        item.setName(itemDTO.getName());
        item.setDescription(itemDTO.getDescription());
        item.setPrice(itemDTO.getPrice());
        item.setCategory(category);

        // Ingredience
        if (itemDTO.getIngredients() != null) {
            List<IngredientEntity> ingredients = itemDTO.getIngredients().stream()
                    .map(dto -> {
                        IngredientEntity ingredient = new IngredientEntity();
                        ingredient.setName(dto.getName());
                        ingredient.setItem(item);
                        return ingredient;
                    }).collect(Collectors.toList());
            item.setIngredients(ingredients);
        } else {
            item.setIngredients(Collections.emptyList());
        }

        // Alergeny
        if (itemDTO.getAllergens() != null) {
            List<AllergenEntity> allergens = itemDTO.getAllergens().stream()
                    .map(dto -> {
                        AllergenEntity allergen = new AllergenEntity();
                        allergen.setName(dto.getName());
                        allergen.setItem(item);
                        return allergen;
                    }).collect(Collectors.toList());
            item.setAllergens(allergens);
        } else {
            item.setAllergens(Collections.emptyList());
        }

        // Volitelné ingredience (optionalIngredients) - pokud chceš, obdobně jako výše (není v entitách, uprav dle potřeby)
        // ...

        // Uložíme položku (cascade uloží i ingredience a alergeny)
        ItemEntity saved = itemRepository.save(item);

        // Převod zpět na DTO (lze udělat mapperem)
        return mapToDTO(saved);
    }

     */

}
