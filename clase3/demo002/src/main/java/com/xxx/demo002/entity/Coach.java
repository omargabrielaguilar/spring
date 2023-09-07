package com.xxx.demo002.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_Coach")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coach {
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


/*@RequiredArgsConstructorgenera un constructor con 1 parámetro para cada campo que requiere un manejo especial.
Todos los campos no inicializados finalobtienen un parámetro, así como cualquier campo marcado como
@NonNullno inicializado donde se declara. Para aquellos campos marcados con @NonNull, también se genera una verificación nula explícita.
El constructor arrojará un NullPointerExceptionsi alguno de los parámetros destinados a los campos marcados con @NonNullcontiene null.
El orden de los parámetros coincide con el orden en que aparecen los campos en su clase.*/