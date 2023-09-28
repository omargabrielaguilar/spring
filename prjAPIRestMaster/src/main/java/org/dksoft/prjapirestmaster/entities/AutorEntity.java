package org.dksoft.prjapirestmaster.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "autor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AutorEntity extends BaseEntity{
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "biography", length = 1500)
    private String biography;
}
