package com.projectnike.nike.service;

import com.projectnike.nike.domain.Paging;
import com.projectnike.nike.domain.ProductsVO;

import java.util.List;

public interface InventoryService {
    public List<String> getSize();

    public List<ProductsVO> getList(ProductsVO pd, Paging pg);
}
