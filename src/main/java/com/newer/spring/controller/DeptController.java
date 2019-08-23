package com.newer.spring.controller;


import com.newer.spring.domain.Dept;
import com.newer.spring.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;
import java.util.List;

@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("findAllDept")
    @ResponseBody
    public List<Dept> findAllDept(){
        return deptService.findAll();
    }


}
