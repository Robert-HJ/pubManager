package com.toyProject.pubManager.tables;

import com.toyProject.pubManager.framework.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="tables")
public class TablesEntity extends BaseEntity {



}
