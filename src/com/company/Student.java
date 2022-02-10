package com.company;


import java.time.Month;

public class Student {
    private int age;
    private String name;
    private String srName;
    private String eposta;




    public Student() {
    }

    public Student(int age, String name, String srName, String eposta) {
        if (age>0){ this.age = age;
        }else {
            System.out.println("negative age");
            this.age = age;
        }
        this.name = name;
        this.srName = srName;
        this.eposta = eposta;





    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age>0){this.age = age;

        }else {
            System.out.println("negative age");
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrName() {
        return srName;
    }

    public void setSrName(String srName) {
        this.srName = srName;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    void getStudentInfo(){
        System.out.println(getAge()+", "+getName()+", "+getSrName()+", "+getEposta());
    }



}



