package org.dksoft.prjapirestmaster.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "libro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibroEntity extends BaseEntity{
    @Column(name="name")
    private String name;

    @Column(name="genre")
    private String genre;

    @Column(name="pages")
    private int pages;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<AutorEntity> autores;
}
