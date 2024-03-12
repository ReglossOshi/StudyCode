package com.projectnike.nike.mapper;

import com.projectnike.nike.config.DBConfig;
import com.projectnike.nike.domain.ProductsVO;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {DBConfig.class})
@Log4j
public class StoreMapperTests {
    @Autowired
    private StoreMapper mapper;

    @Test
    public void searchTest(){
        String search="";
        List<ProductsVO> vo = mapper.searchItems(search);
    }
}
