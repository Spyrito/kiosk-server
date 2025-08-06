package com.kiosk.service;

import com.kiosk.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    List<ItemDTO> getAll();
    //ItemDTO addItem(ItemDTO itemDTO);

}
