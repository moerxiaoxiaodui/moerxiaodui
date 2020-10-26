package com.etc.entity;

import java.io.Serializable;

/**
 * @author huge
 * @date 2020/10/24 - 16:13
 */
public class ViewInfo implements Serializable {
    private Company company;
    private HR hr;

    public ViewInfo() {
    }

    public ViewInfo(Company company, HR hr) {
        this.company = company;
        this.hr = hr;
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
}
