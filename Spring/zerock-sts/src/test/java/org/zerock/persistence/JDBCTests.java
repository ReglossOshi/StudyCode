package org.zerock.persistence;


import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.jupiter.api.Assertions.fail;

public class JDBCTests {
    static {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection(){
        System.out.println("실행");

        try(Connection con =
                    DriverManager.getConnection(
                            "jdbc:oracle:thin:@1.220.247.78:1522:orcl",
                            "jsp",
                            "123456")){
            System.out.println("con: "+con);
        }catch (Exception e){
            fail(e.getMessage());
        }
    }
}
