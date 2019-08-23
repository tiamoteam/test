package com.newer.spring.controller;

import com.newer.spring.domain.Emp;
import com.newer.spring.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//@Controller

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("/test")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("data","temp");
        return modelAndView;
    }

    @RequestMapping("toIndex")
    public String toIndex(){

        return "index";
    }


    @RequestMapping(value = "findAll",method = RequestMethod.POST)//@PostMapping
//    @ResponseBody
    public List<Emp> findAll(){

        List<Emp> empList = empService.findAll();
        return empList;
    }
    @RequestMapping("add")
//    @ResponseBody
    public int addEmp(Emp emp){

        int count = empService.addEmp(emp);

        return count;
    }

    @RequestMapping("upd")
//    @ResponseBody

    public int updEmp(Emp emp){
        int count = empService.updEmp(emp);
        return count ;
    }

    @RequestMapping("del")
//    @ResponseBody

    public int delEmp(int empno){
        int count =  empService.delEmp(empno);

        return count;
    }

    @RequestMapping("findByEmpno")
    //@ResponseBody
    public Emp findByEmpno(Integer empno){
        Emp emp=empService.findByEmpno(empno);
        return emp;
    }


}
