package com.etc.entity;

import java.io.Serializable;

/**
 * @author huge
 * @date 2020/10/26 - 9:14
 */
public class AllInfo implements Serializable{
    Company company;
    HR hr;
    Recruit recruit;

    public AllInfo() {
    }

    public AllInfo(Company company, HR hr, Recruit recruit) {
        this.company = company;
        this.hr = hr;
        this.recruit = recruit;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public HR getHr() {
        return hr;
    }

    public void setHr(HR hr) {
        this.hr = hr;
    }

    public Recruit getRecruit() {
        return recruit;
    }

    public void setRecruit(Recruit recruit) {
        this.recruit = recruit;
    }

    @Override
    public String toString() {
        return "AllInfo{" +
                "company=" + company +
                ", hr=" + hr +
                ", recruit=" + recruit +
                '}';
    }
}
