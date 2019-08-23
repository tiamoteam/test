package com.newer.spring.domain;

import java.io.Serializable;

/**
 * 科室
 */
public class Departs implements Serializable {
    private static final long serialVersionUID = 8929366036805616066L;

    private Integer deid;
    private String dname;
    private String intro;
    private Integer deexist;
    private String by1;
    private Integer by2;

    public Departs() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getDeid() {
        return deid;
    }

    public void setDeid(Integer deid) {
        this.deid = deid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getDeexist() {
        return deexist;
    }

    public void setDeexist(Integer deexist) {
        this.deexist = deexist;
    }

    public String getBy1() {
        return by1;
    }

    public void setBy1(String by1) {
        this.by1 = by1;
    }

    public Integer getBy2() {
        return by2;
    }

    public void setBy2(Integer by2) {
        this.by2 = by2;
    }
}
