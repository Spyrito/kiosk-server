package com.kiosk.entity.repository;

import com.kiosk.entity.ItemEntity;
import com.kiosk.entity.OptionalIngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OptionalIngredientRepository extends JpaRepository<OptionalIngredientEntity, Long>, JpaSpecificationExecutor<OptionalIngredientEntity> {
}

