package com.projectnike.nike.domain;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class ImportVO {
    private int import_num;
    private int item_num;//
    private Date import_date;//
    private int import_quantity;//
    private int supply_price;
    private int vat;
    private String division;
}
