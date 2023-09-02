package com.daw2.unidireccional.one_to_one;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "uni_Employee_one_to_one")
@Table(name = "uni_Employee_one_to_one")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name ="parkingSpot_id")
    private ParkingSpot name;
    private String lastname;

    /*
     * - Atributos y Metodos
     *
     *
     *
     * - Funciones -> devolver un resultado (return)
     * - Procedimientos -> no devuelve nada, solo ejecuta  (void usualmente)
     *
     * - Constructor -> construir un objetos -> nombre class + atributos
     *
     * - Propiedades -> set/get de los atributos
     *
     * */
}
