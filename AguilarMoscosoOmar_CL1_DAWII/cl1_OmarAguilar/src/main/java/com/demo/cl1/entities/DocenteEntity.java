package com.demo.cl1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@Table(name = "docente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocenteEntity extends BaseEntity{
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "dni")
    private String dni;
    @Column(name = "fechaNacimiento")
    private Date fechaNacimiento;
    @Column(name ="sueldo")
    private double sueldo;
    @Column(name = "email")
    private String email;
    @Column(name = "sexo")
    private String sexo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_categoria")
    private CategoriaEntity categoria;

}

