package com.toyProject.pubManager.api.test;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name="test_table")
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_id", unique = true, nullable = false)
    private long id;

    @Column(length = 20, nullable = false)
    private String contents;

}
