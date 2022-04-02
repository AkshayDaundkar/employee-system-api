package com.akshay.com.Employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private long id;
    private String firstname;
    private String lastname;
    private String emailId;
}
