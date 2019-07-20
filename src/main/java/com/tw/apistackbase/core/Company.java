package com.tw.apistackbase.core;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "company_table")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "company_id")
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="Company_ID",referencedColumnName = "id")
    private List<Employee> employeeList=new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public Company(Long id, String name, List<Employee> employeeList) {
        this.id = id;
        this.name = name;
        this.employeeList = employeeList;
    }
}
