package org.springframework.guides.payroll.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    private final EmployeeRepository repository;

    @Autowired
    public SearchService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee findByNameContaining(String name) {
        return repository.findByNameContaining(name);
    }
}