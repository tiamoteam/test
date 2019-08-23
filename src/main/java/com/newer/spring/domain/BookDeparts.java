package com.newer.spring.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 挂号人数
 */
public class BookDeparts implements Serializable {
    private static final long serialVersionUID = -4038330590236480222L;

    private String dname;
    private List<Integer> countList;

    public BookDeparts() {
    }

    public BookDeparts(String dname, List<Integer> countList) {
        this.dname = dname;
        this.countList = countList;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Integer> getCountList() {
        return countList;
    }

    public void setCountList(List<Integer> countList) {
        this.countList = countList;
    }
}
