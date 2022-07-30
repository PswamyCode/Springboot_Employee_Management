package com.employee.service.controller;


import com.employee.service.model.Employee;
import com.employee.service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/getEmployeeDetails", method = RequestMethod.POST)

    private List<Employee> getEmployeeDetails(){

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList = (ArrayList<Employee>) employeeService.getEmployeeInfo();
        return employeeList;

    }



}
