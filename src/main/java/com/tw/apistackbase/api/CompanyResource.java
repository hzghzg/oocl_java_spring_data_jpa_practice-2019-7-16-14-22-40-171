package com.tw.apistackbase.api;

import com.tw.apistackbase.core.Company;
import com.tw.apistackbase.repository.CompanyRepository;
import com.tw.apistackbase.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyResource {
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping(produces = {"application/json"})
    public Iterable<Company> list() {
        return companyRepository.findAll();
    }

    @PostMapping(produces = {"application/json"})
    public Company add(@RequestBody Company company) {
        return companyRepository.save(company);
    }
    @DeleteMapping(produces = {"application/json"})
    public void delete() {
        companyRepository.deleteAll();
    }
}
