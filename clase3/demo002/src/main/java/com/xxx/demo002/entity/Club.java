package com.xxx.demo002.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_Club")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "businessname", columnDefinition = "VARCHAR(50)")
    private String businessName;
}
