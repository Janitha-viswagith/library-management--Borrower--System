package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class BorrowerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Bid;
    private String name;
    private String contact;
    private String address;
    private String nic;
}


