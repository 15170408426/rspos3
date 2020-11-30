package com.bdqn.domain;

public class Branch {
private Integer id;
private String businessNO;
private String name;
private String cityArea;
private String address;
private String telephone;
private String summary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusinessNO() {
        return businessNO;
    }

    public void setBusinessNO(String businessNO) {
        this.businessNO = businessNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityArea() {
        return cityArea;
    }

    public void setCityArea(String cityArea) {
        this.cityArea = cityArea;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "id=" + id +
                ", businessNO='" + businessNO + '\'' +
                ", name='" + name + '\'' +
                ", cityArea='" + cityArea + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}
