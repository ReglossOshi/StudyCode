package org.zerock.controller;

import lombok.Data;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.AllTime;
import org.zerock.domain.ContactNumbers;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.TodoDTO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/sample/*")
public class SampleController {
//    @InitBinder
//    public void initBinder(WebDataBinder binder){
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
//        binder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat,false));
//    }

    @RequestMapping(value = "")
    public void basic() {
        System.out.println("basic......");
    }

    @RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})
    public void basicGet() {
        System.out.println("basic get......");
    }

    @RequestMapping(value = "/basicOnlyGet", method = {RequestMethod.GET})
    public void basicGet2() {
        System.out.println("basic get only get......");
    }
    @RequestMapping(value = "/basicOnlyPost", method = {RequestMethod.POST})
    public void basicPost() {
        System.out.println("basic post only......");
    }

    @GetMapping("/ex10")
    public String ex10(TodoDTO todo) {
        System.out.println("todo: "+todo);
        return "ex10";
    }

    @GetMapping("/test1")
    public String test1(TodoDTO todo) {
        System.out.println("todo: "+todo);
        return "test/test1";
    }

    @GetMapping("/test/test1.do")
    public String test2(TodoDTO todo) {
        System.out.println("todo: "+todo);
        return "test/test2";
    }

    @GetMapping("/ex04")
    public String ex04(SampleDTO dto,@ModelAttribute("page") int page1, @ModelAttribute("bbb") String bbb) {
        System.out.println("dto: "+dto);
        System.out.println("page1: "+page1);
        return "sample/ex04";
    }

    @GetMapping("/ex04-1")
    public String ex04_1() {
        return "ex04-1";
    }
    @GetMapping("/ex04-2")
    public String ex04_2(RedirectAttributes rttr) {
        return "redirect:/sample/ex04-1";
    }

    @GetMapping("/ex05")
    public void ex05() {

    }

    @ResponseBody
    @GetMapping("/ex06")
    public List<SampleDTO> ex06() {
        System.out.println("/ex06..........");
        List<SampleDTO> list = new ArrayList<>();
        SampleDTO dto = new SampleDTO();
        dto.setAge(10);
        dto.setName("홍길동");

        SampleDTO dto2 = new SampleDTO();
        dto2.setAge(10);
        dto2.setName("홍길동");

        list.add(dto);
        list.add(dto2);
        return list;
    }

    @ResponseBody
    @GetMapping("/ex07")
    public AllTime ex07() {
        AllTime allTime = new AllTime();
        allTime.setName("Jack");
        allTime.setAge(30);

        ContactNumbers con1 = new ContactNumbers();
        con1.setType("Home");
        con1.setNumber("123-123-123");
        ContactNumbers con2 = new ContactNumbers();
        con2.setType("Office");
        con2.setNumber("321-321-321");
        List<ContactNumbers> contactNumbers = new ArrayList<>();
        contactNumbers.add(con1);
        contactNumbers.add(con2);

        allTime.setSpouse("스폰서");

        List<String> listFS = Arrays.asList("Football", "Cricket");

        allTime.setContactNumbers(contactNumbers);
        allTime.setFavoriteSports(listFS);

        return allTime;
    }

    @ResponseBody
    @GetMapping("/ex08")
    public AllTime ex08() {
        AllTime allTime = new AllTime();

        allTime.setName("홍길동");
        allTime.setAge(20);

        ContactNumbers con1 = new ContactNumbers();
        con1.setType("집");
        con1.setNumber("000-0000-0000");
        ContactNumbers con2 = new ContactNumbers();
        con2.setType("학교");
        con2.setNumber("111-0000-0000");

        List<ContactNumbers> listCon =new ArrayList<>();
        listCon.add(con1);
        listCon.add(con2);

        allTime.setSpouse("키키");

        List<String> sports = Arrays.asList("축구","야구");

        allTime.setContactNumbers(listCon);
        allTime.setFavoriteSports(sports);

        return allTime;
    }

    @GetMapping("/ex09")
    public ResponseEntity<String> ex09(){
        System.out.println("/ex09............");

        //String msg = "{\"name\":\"홍길동\"}";

        String msg = """
                {"name":"홍길동"}
                """;

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type","application/json;charset=UTF-8");
        return new ResponseEntity<>(msg, httpHeaders, HttpStatus.OK);
    }

    @GetMapping("/exUpload")
    public void exUpload() {
        System.out.println("/exUpload.........");
    }

    @PostMapping
    public void exUploadPost(ArrayList<MultipartFile> files) {
        files.forEach(file -> {
            System.out.println("-------------------");
            System.out.println("name: " + file.getOriginalFilename());
            System.out.println("size: " + file.getSize());  // byte
        });
    }


}
