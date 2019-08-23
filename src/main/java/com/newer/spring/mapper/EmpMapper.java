package com.newer.spring.mapper;

import com.newer.spring.domain.Emp;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpMapper {


    @Select("select empno,name ename,deptno,sal,job,hiredate from emp")
    public List<Emp> findAll();

    @Select("select empno,name ename,deptno,sal,job,hiredate from emp where empno=#{empno}")
    public Emp findByEmpno(@Param("empno")Integer empno);


    @Insert("insert into emp(name,sal,hiredate,deptno) values(#{ename},#{sal}," +
            "#{hiredate},#{deptno})")
    public int addEmp(Emp emp);


    @Update("update emp set name = #{ename},hiredate = #{hiredate}" +
            ",deptno=#{deptno},sal = #{sal} where empno = #{empno}")

    public int updEmp(Emp emp);

    @Delete("delete from emp where empno = #{empno}")
    public int delEmp(@Param("empno") int empno);

}
