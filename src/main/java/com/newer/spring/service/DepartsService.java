package com.newer.spring.service;

import com.newer.spring.domain.Departs;
import com.newer.spring.mapper.DepartsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartsService {
    @Autowired
    private DepartsMapper departsMapper;

    public List<Departs> findAll(){
        return departsMapper.findAll();
    }
}
