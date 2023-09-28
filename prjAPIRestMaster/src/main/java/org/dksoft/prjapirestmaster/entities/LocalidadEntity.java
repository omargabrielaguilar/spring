package org.dksoft.prjapirestmaster.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "localidad")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocalidadEntity extends  BaseEntity{
    @Column(name = "name")
    private String name;
}
