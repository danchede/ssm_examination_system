package com.ifox.entity;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in12:41 2018/5/8
 * @Modified By:
 */
public class College {
    private Integer collegeid;

    private String collegename;

    public Integer getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(Integer collegeid) {
        this.collegeid = collegeid;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename == null ? null : collegename.trim();
    }
}
