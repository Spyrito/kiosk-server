package com.kiosk.entity.repository;

import com.kiosk.entity.IngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IngredientRepository extends JpaRepository<IngredientEntity, Long>, JpaSpecificationExecutor<IngredientEntity> {

}
