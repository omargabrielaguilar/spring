package com.xxx.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_localidad")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocalidadEntity extends BaseEntity {
    private String name;
}
