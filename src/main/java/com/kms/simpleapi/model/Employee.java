package com.kms.simpleapi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
public class Employee implements Serializable {
    private String firstName;
    private String lastName;
    private String title;
    private Integer salary;
}
