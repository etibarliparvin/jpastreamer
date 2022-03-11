package com.example.jpastreamer.dto.request;

import lombok.Data;

@Data
public class EmployeeRequest {

    private String name;
    private String surname;
    private Double salary;
}
