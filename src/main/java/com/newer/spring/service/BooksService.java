package com.newer.spring.service;

import com.newer.spring.mapper.BooksMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {

    @Autowired
    private BooksMapper booksMapper;

    public int getToday(int deid){
        return booksMapper.getToday(deid);
    }

    public int getYesterday(int deid){
        return booksMapper.getYesterday(deid);
    }

    public int getMonth(int deid){
        return booksMapper.getMonth(deid);
    }

    public int getWeek(int deid){
        return booksMapper.getWeek(deid);
    }

    public int getQuarter(int deid){
        return booksMapper.getQuarter(deid);
    }
}
