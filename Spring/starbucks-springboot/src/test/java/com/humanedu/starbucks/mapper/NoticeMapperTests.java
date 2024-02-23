package com.humanedu.starbucks.mapper;

import com.humanedu.starbucks.config.DBConfig;
import com.humanedu.starbucks.domain.NoticeVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DBConfig.class})
@Log4j
public class NoticeMapperTests {
    @Setter(onMethod_ = @Autowired)
    private NoticeMapper mapper;

    @Test
    public void testRead(){
        NoticeVO test1 = new NoticeVO();
        mapper.noticeList(test1);
    }
}
