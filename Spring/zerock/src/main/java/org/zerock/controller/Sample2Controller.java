package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class Sample2Controller {
    @RequestMapping(value = {"/nhis/index.do"})
    public void basic(){
        System.out.println("실행됨");
    }
    //@RequestMapping(value = {"/npbs/indexr.jsp"})
    @PostMapping("/npbs/indexr.jsp")
    public void basic2(){
        System.out.println("공단으로감");
    }

    @GetMapping("/ex01")
    public String ex01(SampleDTO dto){
        System.out.println("sampledto: "+dto);
        return "ex01";
    }

    @GetMapping("/ex02")
    public String ex02(@RequestParam("name") String name, @RequestParam("age") int age){
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        return "ex02";
    }

    @GetMapping("/ex03")
    public String ex03(@RequestParam("ids") ArrayList<String> ids){
        System.out.println("ids : "+ids);
        return "ex03";
    }

    @GetMapping("/ex04")
    public String ex04(@RequestParam("ids") String[] ids){
        System.out.println("ids : "+ Arrays.toString(ids));
        return "ex04";
    }

    @GetMapping("/ex05")
    public String ex05(SampleDTOList list){
        System.out.println("ids : "+ list);
        return "ex05";
    }

//    중복되는 주소로 실행시 오류뜸
//    @RequestMapping(value = {"/sample/*"})
//    public void basic3(){
//        System.out.println("이끾끼");
//    }
}
