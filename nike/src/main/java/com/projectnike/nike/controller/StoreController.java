package com.projectnike.nike.controller;

import com.projectnike.nike.domain.ProductsVO;
import com.projectnike.nike.service.StoreService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class StoreController {
    private StoreService service;

    @GetMapping(value="/board/{search}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<ProductsVO>>getList(@PathVariable("search")String search){
        if(search.equals("010")){
            search="";
        }
        return new ResponseEntity<>(service.getList(search), HttpStatus.OK);
    }
}
