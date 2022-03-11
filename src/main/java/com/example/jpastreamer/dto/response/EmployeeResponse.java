package com.example.jpastreamer.dto.response;

import lombok.Data;

@Data
public class EmployeeResponse {

    private Long id;
    private String name;
    private String surname;
    private Double salary;
}
