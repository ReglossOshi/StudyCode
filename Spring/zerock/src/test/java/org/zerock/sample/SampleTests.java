package org.zerock.sample;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.RootConfig;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class SampleTests {
    @Setter(onMethod_ = {@Autowired})
    private Restaurant restaurant;

    @Test
    public void testExists(){
        assertNotNull(restaurant);
        restaurant.getChef();

        System.out.println("sout"+restaurant);
        System.out.println();
        System.out.println(restaurant.getChef());
    }

    @Test
    public void testExists2(){
        Restaurant rest1 = new Restaurant();
        rest1.getChef();

    }
}