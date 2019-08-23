package com.newer.spring.domain;

import java.io.Serializable;
import java.util.List;

public class BookDepartsCount implements Serializable {
    private static final long serialVersionUID = 8712166053347837766L;

    private List<String> times;
    private List<BookDeparts> bookDepartsList;

    public BookDepartsCount() {
    }

    public BookDepartsCount(List<String> times, List<BookDeparts> bookDepartsList) {
        this.times = times;
        this.bookDepartsList = bookDepartsList;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<String> getTimes() {
        return times;
    }

    public void setTimes(List<String> times) {
        this.times = times;
    }

    public List<BookDeparts> getBookDepartsList() {
        return bookDepartsList;
    }

    public void setBookDepartsList(List<BookDeparts> bookDepartsList) {
        this.bookDepartsList = bookDepartsList;
    }
}
