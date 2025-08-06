package com.kiosk.entity.repository;

import com.kiosk.entity.AllergenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AllergenRepository extends JpaRepository<AllergenEntity, Long>, JpaSpecificationExecutor<AllergenEntity> {

}
