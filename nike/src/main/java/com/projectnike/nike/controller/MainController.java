package com.projectnike.nike.controller;

import com.projectnike.nike.domain.ImportVO;
import com.projectnike.nike.service.MainService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Log4j
@Controller
@AllArgsConstructor
public class MainController {

    private MainService mainService;
    @GetMapping("header")
    public String header(){
        log.info("header 호출");
        return "/includes/header";
    }

    @GetMapping("main")
    public String main(Model model){
        int year1=Integer.parseInt(mainService.mainyear());
        LocalDate now = LocalDate.now();
        int year2 = now.getYear();
        List<Integer> yearlist = new ArrayList<Integer>();
        while(year1<=year2){
            yearlist.add(year1);
            year1++;
        }

        List<ImportVO> importvo = mainService.monthSum("2024");

        model.addAttribute("monthsum",importvo);
        model.addAttribute("year",yearlist);
        return "/page/main";
    }

    @GetMapping("store")
    public String store(){
        log.info("header 호출");
        return "/page/store";
    }

    @GetMapping("inventory")
    public String inventory(){
        log.info("header 호출");
        return "/page/inventory";
    }
}
