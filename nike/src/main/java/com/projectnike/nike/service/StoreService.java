package com.projectnike.nike.service;

import com.projectnike.nike.domain.ProductsVO;

import java.util.List;

public interface StoreService {
    public List<ProductsVO> getList(String search);
}
