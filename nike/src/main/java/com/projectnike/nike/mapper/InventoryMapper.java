package com.projectnike.nike.mapper;

import com.projectnike.nike.domain.Paging;
import com.projectnike.nike.domain.ProductsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InventoryMapper {
    public List<String> getSize();

    public List<ProductsVO> managementList(
            @Param("pd") ProductsVO pd,
            @Param("pg")Paging pg
    );


}
