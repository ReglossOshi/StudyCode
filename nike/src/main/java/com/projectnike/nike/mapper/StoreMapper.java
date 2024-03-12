package com.projectnike.nike.mapper;

import com.projectnike.nike.domain.ProductsVO;

import java.util.List;

public interface StoreMapper {
    public List<ProductsVO> searchItems(String search);
}
