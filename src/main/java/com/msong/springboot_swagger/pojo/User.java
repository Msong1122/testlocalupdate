package com.msong.springboot_swagger.pojo;


public class User {
    private String name;
    private String pwd;
    private int age;
    private String sex;

    public User() {
    }

    public User(String name, String pwd, int age, String sex) {
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
