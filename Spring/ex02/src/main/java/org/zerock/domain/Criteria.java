package org.zerock.domain;


import lombok.Data;
import lombok.ToString;
@Data
@ToString
public class Criteria {
    private String type;
    private String keyword;

    public String[] getTypeArr(){
        return type == null? new String[]{}:type.split("");
    }
}
