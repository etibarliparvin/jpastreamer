package com.example.jpastreamer.service;

import com.example.jpastreamer.dto.request.EmployeeRequest;
import com.example.jpastreamer.dto.response.EmployeeResponse;
import com.example.jpastreamer.entity.Employee;
import com.example.jpastreamer.entity.Employee$;
import com.example.jpastreamer.mapper.EmployeeMapper;
import com.example.jpastreamer.repository.EmployeeRepository;
import com.speedment.jpastreamer.application.JPAStreamer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;
    private final EmployeeMapper mapper;
    private final JPAStreamer jpaStreamer;

    @Override
    public EmployeeResponse create(EmployeeRequest request) {
        return null;
    }

    @Override
    public EmployeeResponse findById(Long id) {
        return null;
    }

    @Override
    public List<EmployeeResponse> findAll(Integer page, Integer size) {
//        List<Employee> collect = streamer.stream(Employee.class)
//                .sorted(Employee$.name)
//                .skip(page)
//                .limit(size)
//                .collect(Collectors.toList());
//        return collect.stream().map(mapper::toResponse).collect(Collectors.toList());
        return null;
    }
}
