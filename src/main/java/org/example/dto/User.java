package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String fistName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String country;
    private String phoneNumber;

}
