package com.newer.spring;

import com.newer.spring.mapper.DepartsMapper;
import com.newer.spring.mapper.EmpMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Spring0809ApplicationTests {

    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private DepartsMapper departsMapper;

    @Test
    public void find1(){
        departsMapper.findAll().forEach(departs -> {
            System.out.println(departs.getDname());
        });
    }


    @Test
    public void find(){
        empMapper.findAll().forEach(emp->{
            System.out.println(emp.getEname()+","+emp.getEmpno());
        });
    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void upd(){

    }

}
