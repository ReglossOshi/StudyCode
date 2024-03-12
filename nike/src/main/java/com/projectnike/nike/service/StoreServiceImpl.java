package com.projectnike.nike.service;

import com.projectnike.nike.domain.ProductsVO;
import com.projectnike.nike.mapper.StoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService{
    @Autowired
    private StoreMapper mapper;

    @Override
    public List<ProductsVO> getList(String search){
        return mapper.searchItems(search);
    }
}
