package com.newer.spring.controller;

import com.newer.spring.domain.Emp;
import com.newer.spring.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 表示层Restful 软件架构 不是标准
 */

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost",maxAge = 6400)
public class EmpControllerI {

    @Autowired
    private EmpService empService;


    /**
     * 员工信息添加
     * @param emp
     * @return
     */
    @PostMapping("/emp")
    public ResponseEntity<?> addEmp(@RequestBody Emp emp){

        int count = empService.addEmp(emp);


        return new ResponseEntity<>(count, HttpStatus.OK);
    }


    @PutMapping("/emp")
    public ResponseEntity<?> updEmp( Emp emp){

        int count = empService.updEmp(emp);


        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @DeleteMapping("/emp/{empno}")
    public ResponseEntity<?> del(@PathVariable("empno") int empno){

        int count = empService.delEmp(empno);


        return new ResponseEntity<>(count, HttpStatus.OK);
    }



    @GetMapping("/emp")

    public ResponseEntity<?> query(){

        List<Emp> list = empService.findAll();
        if (list==null || list.size()==0){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }


        return new ResponseEntity<>(list, HttpStatus.OK);
    }


    @GetMapping("/emp/{empno}")

    public ResponseEntity<?> queryEmp(@PathVariable("empno") int empno){

        Emp emp = empService.findByEmpno(empno);


        return new ResponseEntity<>(emp, HttpStatus.OK);
    }


}
