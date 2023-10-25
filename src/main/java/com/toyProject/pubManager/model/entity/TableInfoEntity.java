package com.toyProject.pubManager.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="table_info")
public class TableInfoEntity {

    @Id
    @Column(length = 20, nullable = false)
    private long table_number;

}
