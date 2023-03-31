package com.creativeslash;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

    private Long id;
    private String firstname;
    private String lastname;
    private String email;
}
