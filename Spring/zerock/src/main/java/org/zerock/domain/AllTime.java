package org.zerock.domain;

import lombok.Data;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Data
public class AllTime {
    private  String name;
    private int age;
    private List<ContactNumbers> contactNumbers;
    private String spouse;
    private List<String> favoriteSports;
}
