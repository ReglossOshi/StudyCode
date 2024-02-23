package org.zerock.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CompanyDTO {
    private List<EmployeeDTO> employees;
    private String companyName;
    private  String address;
    private Student classes;
}
