package com.xxx.demo002.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_Player")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "firstname", length = 20, nullable = false, unique = true)
    private String name;
    @Column(name = "lastname", columnDefinition = "VARCHAR(50)")
    private String lastName;
    private Integer age;
    private String nationality;
}
