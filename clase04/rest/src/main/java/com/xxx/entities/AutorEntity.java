package com.xxx.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb_autor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AutorEntity extends BaseEntity {
    private String name;
    private String lastName;
    private String biography;
}
