package com.projectnike.nike.controller;

import com.projectnike.nike.domain.Paging;
import com.projectnike.nike.domain.ProductsVO;
import com.projectnike.nike.service.InventoryService;
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
public class ListController {
    private InventoryService service;

    @GetMapping(value = "/search/{category}/{itemname}/{itemsize}/page/{page}/pagesize/{pagesize}"
            ,produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<ProductsVO>> getList(@PathVariable("page")int page,
                                                    @PathVariable("pagesize")int pagesize,
                                                    @PathVariable("category")String category,
                                                    @PathVariable("itemname")String itemName,
                                                    @PathVariable("itemsize")String itemSize){
        if(category.equals("010")){
            category="";
        }
        if(itemName.equals("010")){
            itemName="";
        }
        if(itemSize.equals("010")){
            itemSize="";
        }
        ProductsVO pd = new ProductsVO();
        pd.setCategory(category);
        pd.setItem_name(itemName);
        pd.setItem_size(itemSize);
        Paging pg = new Paging();
        pg.setPageNum(page);
        pg.setPageSize(pagesize);

        return new ResponseEntity<>(service.getList(pd,pg), HttpStatus.OK);
    }
}
