package com.toyProject.pubManager.model.repository;

import com.toyProject.pubManager.model.entity.MenuCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuCategoryRepository extends JpaRepository<MenuCategoryEntity, Integer> {
}
