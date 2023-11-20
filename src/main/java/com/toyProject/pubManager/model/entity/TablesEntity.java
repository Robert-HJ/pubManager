package com.toyProject.pubManager.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tables")
public class TablesEntity extends BaseEntity{

}
