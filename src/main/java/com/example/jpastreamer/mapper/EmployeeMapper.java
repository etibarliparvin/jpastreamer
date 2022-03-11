package com.example.jpastreamer.mapper;

import com.example.jpastreamer.dto.request.EmployeeRequest;
import com.example.jpastreamer.dto.response.EmployeeResponse;
import com.example.jpastreamer.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    Employee toEntity(EmployeeRequest request);

    EmployeeResponse toResponse(Employee employee);
}
