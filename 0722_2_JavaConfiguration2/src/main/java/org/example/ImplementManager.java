package org.example;

import java.util.ArrayList;
import java.util.List;

public class ImplementManager implements Manager {
    private List<Employee> employees = new ArrayList<>();
    @Override
    public void pay() {
        for (Employee employee:employees) {
            System.out.println(employee.getName()+", "+employee.getType()+", "+employee.pay());
        }
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
