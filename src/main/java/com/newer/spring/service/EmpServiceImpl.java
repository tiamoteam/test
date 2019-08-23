package com.newer.spring.service;

import com.newer.spring.domain.Emp;
import com.newer.spring.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {


    @Autowired
    private EmpMapper empMapper;


    @Override
    public List<Emp> findAll() {
        return empMapper.findAll();
    }

    @Override
    public int addEmp(Emp emp) {
        return empMapper.addEmp(emp);
    }

    @Override
    public int updEmp(Emp emp) {
        return empMapper.updEmp(emp);
    }

    @Override
    public int delEmp(int empno) {
        return empMapper.delEmp(empno);
    }

    @Override
    public Emp findByEmpno(Integer empno) {
        return empMapper.findByEmpno(empno);
    }


}
