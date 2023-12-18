package com.kms.simpleapi.controller;


import com.kms.simpleapi.service.EmployeeService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class SimpleController {

    EmployeeService service = new EmployeeService();
    @GET
    @Path("hello")
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

    @GET
    @Path("employee")
    @Produces("application/json")
    public String simpleAPI1() throws Exception {
       return service.getEmployee();
    }
}