package com.newer.spring.mapper;

import com.newer.spring.domain.Departs;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@CacheNamespace(implementation = com.newer.spring.config.RedisCache.class)
public interface DepartsMapper {
    @Select("select deid,dename dname,deexist from departs")
    public List<Departs> findAll();
}
