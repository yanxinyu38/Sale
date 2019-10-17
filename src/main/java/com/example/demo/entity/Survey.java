package com.example.demo.entity;

public class Survey {
    private int id;
    private String sname;
    private String type;
    private int flag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", type='" + type + '\'' +
                ", flag=" + flag +
                '}';
    }
}
