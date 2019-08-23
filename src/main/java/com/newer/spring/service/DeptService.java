package com.newer.spring.service;


import com.newer.spring.domain.Dept;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DeptService {

    public List<Dept> findAll();

}
