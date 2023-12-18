package com.kms.simpleapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kms.simpleapi.model.Employee;

import javax.ejb.EJB;


public class EmployeeService {
    public String getEmployee() throws Exception{
        Employee employee = Employee.builder().firstName("Tam")
                .lastName("Nguyen")
                .title("Manager")
                .salary(10000000).build();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(employee);
    }
}
