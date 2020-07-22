package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("manager")
public class ImplementedManager implements Manager {
    private List<Employee> employees ;
//    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void pay() {
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
