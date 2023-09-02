package com.daw2.bidireccional.one_to_one;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "bi_Employee_one_to_one")
@Table(name = "bi_Employee_one_to_one")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "parkingSpot_id")
    private ParkingSpot parkingSpot;
}
