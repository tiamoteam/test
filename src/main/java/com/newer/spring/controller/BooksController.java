package com.newer.spring.controller;

import com.newer.spring.domain.BookDeparts;
import com.newer.spring.domain.BookDepartsCount;
import com.newer.spring.domain.Departs;
import com.newer.spring.service.BooksService;
import com.newer.spring.service.DepartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BooksController {

    @Autowired
    private DepartsService departsService;

    @Autowired
    private BooksService booksService;


    @GetMapping("/draw")
    public ResponseEntity<?> drawTable(){

        List<String> timesList=new ArrayList<>();
        timesList.add("today");
        timesList.add("yesterday");
        timesList.add("week");
        timesList.add("month");
        timesList.add("quarter");

        List<BookDeparts> bookDepartsList=new ArrayList<>();
        //
        List<Departs> departsList = departsService.findAll();
        for (Departs d :
                departsList) {
            String dname = d.getDname();
            int today = booksService.getToday(d.getDeid());
            int yesterday = booksService.getYesterday(d.getDeid());
            int week = booksService.getWeek(d.getDeid());
            int month = booksService.getMonth(d.getDeid());
            int quarter = booksService.getQuarter(d.getDeid());

            List<Integer> countList = new ArrayList<>();
            countList.add(today);
            countList.add(yesterday);
            countList.add(week);
            countList.add(month);
            countList.add(quarter);


            bookDepartsList.add(new BookDeparts(dname,countList));
        }



        return new ResponseEntity<>(new BookDepartsCount(timesList,bookDepartsList), HttpStatus.OK);
    }


    @GetMapping("/drawPic")
    public ResponseEntity<?> drawPic(){


        List<Map<String,Object>> list = new ArrayList<>();

        List<Departs> departsList = departsService.findAll();
        for (Departs d:
             departsList) {
            Map<String,Object> map = new HashMap<>();
            map.put("name",d.getDname());
            map.put("y",booksService.getQuarter(d.getDeid()));
            map.put("drilldown",d.getDname());
            list.add(map);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

}
