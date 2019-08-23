package com.newer.spring.mapper;


import com.newer.spring.domain.Dept;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptMapper {

    @Select("select deptno,dname from dept")
    public List<Dept> findAll();

}
