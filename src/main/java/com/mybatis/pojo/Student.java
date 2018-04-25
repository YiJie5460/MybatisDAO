package com.mybatis.pojo;

public class Student {
    Long id;
    String name;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        String str = new
                String("student[id:" + this.getId() + " name:" + this.getName() + "]");
        return str;
        }
}
