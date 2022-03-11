package com.example.jpastreamer.service;

import com.example.jpastreamer.dto.request.EmployeeRequest;
import com.example.jpastreamer.dto.response.EmployeeResponse;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface EmployeeService {

    EmployeeResponse create(EmployeeRequest request);

    EmployeeResponse findById(Long id);

    List<EmployeeResponse> findAll(Integer page, Integer size);
}
