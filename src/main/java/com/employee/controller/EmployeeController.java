package com.employee.controller;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employee")
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        log.debug("inside method");
        Employee result = employeeService.addEmployee(employee);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
