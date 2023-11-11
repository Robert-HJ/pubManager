package com.toyProject.pubManager.model.repository;

import com.toyProject.pubManager.model.menu.MenuInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuInfoRepository extends JpaRepository<MenuInfoEntity, Long> {
}
