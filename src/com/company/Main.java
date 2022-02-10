package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
      Student student = new Student(-30, "Akmaral", "Mazhitova", "akmaral@gmail.com");
      Student student2 = new Student(20, "Arlen", "Arlenov", "arlen@gmail.com");
      Student student3 = new Student(30, "Klara", "Azimova", "klara@gmail.com");
      Student[] students ={student, student2, student3};

      Group group = new Group(students, "java5 online", "05.01.2022");
      Group group1 = new Group(students, "javaScript online", "06.01.2022");
      Group group2 = new Group(students, "English online", "07.01.2022");
      Group[] groups = {group, group1, group2};

      Course course = new Course("peaksoft", "0312-12-12-12", "Esen Niyazov", groups);
      course.getCourseInfo();



    }
}
