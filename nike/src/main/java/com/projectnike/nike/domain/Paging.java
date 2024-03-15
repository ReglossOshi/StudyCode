package com.projectnike.nike.domain;

import lombok.Data;

@Data
public class Paging {
    private int pageNum;
    private int pageSize;
    private String search;


    public Paging(){this("",1,10);}
    public Paging(String search, int pageNum, int pageSize){
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.search=search;
    }
}
