package com.kiosk.controller;

import com.kiosk.dto.CategoryDTO;
import com.kiosk.dto.ItemDTO;
import com.kiosk.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public List<ItemDTO> getItems() {
        return itemService.getAll();
    }
    /*
    @PostMapping
    public ItemDTO addItem(@RequestBody ItemDTO itemDTO) {
        return itemService.addItem(itemDTO);
    }
     */

}
