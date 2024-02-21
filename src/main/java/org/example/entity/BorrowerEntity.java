package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@NoArgsConstructor
@Data
@Setter
@Getter
@Entity
public class BorrowerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String bid;
    private String name;
    private String contact;
    private String address;
    private String nic;


    public BorrowerEntity(Long id, String bid, String name, String contact, String address, String nic) {
        this.id = id;
        this.bid = bid;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.nic = nic;
    }
}


