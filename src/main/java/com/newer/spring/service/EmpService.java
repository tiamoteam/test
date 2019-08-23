package com.newer.spring.service;

import com.newer.spring.domain.Emp;

import java.util.List;

public interface EmpService {


    public List<Emp> findAll();

    public int addEmp(Emp emp);

    public int updEmp(Emp emp);

    public int delEmp(int empno);

    public Emp findByEmpno(Integer empno);
}
