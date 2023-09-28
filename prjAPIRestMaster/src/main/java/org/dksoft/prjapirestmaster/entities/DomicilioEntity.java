package org.dksoft.prjapirestmaster.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "domicilio")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DomicilioEntity extends BaseEntity{
    @Column(name = "calle")
    private String street;
    @Column(name = "number")
    private int number;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private LocalidadEntity localidad;
}
