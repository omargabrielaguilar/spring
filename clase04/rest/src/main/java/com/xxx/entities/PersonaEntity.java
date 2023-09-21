package com.xxx.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_persona")
public class PersonaEntity extends BaseEntity {
    @Column(name="name")
    private String name;
    @Column(name="lastname")
    private String lastName;
    @Column(name="dni")
    private String dni;

    @OneToOne(cascade = CascadeType.ALL)
    private DomicilioEntity domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name="personal_libro",
            joinColumns = @JoinColumn(name="persona_id"),
            inverseJoinColumns =  @JoinColumn()

    )
    private List<LibroEntity> libros = new ArrayList<LibroEntity>();
}
