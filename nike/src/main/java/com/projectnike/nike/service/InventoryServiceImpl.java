package com.projectnike.nike.service;

import com.projectnike.nike.domain.Paging;
import com.projectnike.nike.domain.ProductsVO;
import com.projectnike.nike.mapper.InventoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService{
    @Autowired
    private InventoryMapper mapper;

    @Override
    public List<String> getSize(){
        return mapper.getSize();
    }

    @Override
    public List<ProductsVO> getList(ProductsVO pd, Paging pg){
        return mapper.managementList(pd,pg);
    }
}
