package com.company;

import java.util.Arrays;

public class Course {
    String name;
    String number;
    String teacherNameSrname;
    Group[] groups;

    void Course(){

    }

    public Course(String name, String number, String teacherNameSrname, Group[] groups) {
        this.name = name;
        this.number = number;
        this.teacherNameSrname = teacherNameSrname;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTeacherNameSrname() {
        return teacherNameSrname;
    }

    public void setTeacherNameSrname(String teacherNameSrname) {
        this.teacherNameSrname = teacherNameSrname;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
    void getCourseInfo(){
        System.out.println(getName()+", "+ getNumber()+", "+getTeacherNameSrname());
        for (Group kurs:getGroups()) {
            kurs.getGroupInfo();
        }

    }
}
