package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Borrower {

    private Long id;
    private String bid;
    private String name;
    private String contact;
    private String address;
    private String nic;

}


