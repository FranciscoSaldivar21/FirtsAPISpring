package com.schoolapi.schoolapi.models;

public class Student {
    private Integer id;
    private String name;
    private String code;
    private String email;

    public Student(Integer id, String name, String code, String email) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
}
