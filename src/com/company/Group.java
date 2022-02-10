package com.company;

import java.util.Arrays;

public class Group {
    private Student[] student;
    private String learn;
   private String dateOfStudy;

   public void Group(){

    }

    public Group(Student[] student, String learn, String dateOfStudy) {
        this.student = student;
        this.learn = learn;
        this.dateOfStudy = dateOfStudy;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;

    }

    public String getLearn() {
        return learn;
    }

    public void setLearn(String learn) {
        this.learn = learn;
    }

    public String getDateOfStudy() {
        return dateOfStudy;
    }

    public void setDateOfStudy(String dateOfStudy) {
        this.dateOfStudy = dateOfStudy;
    }

    void getGroupInfo(){
        System.out.println(getLearn()+", "+getDateOfStudy());
        for (Student gruppa:getStudent()) {
            gruppa.getStudentInfo();
        }
    }

}
