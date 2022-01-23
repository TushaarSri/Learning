package com.inheritance;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Karan" , 2);
        System.out.println(student.getDetails());

        ResearchStudent researchStudent = new ResearchStudent("Somesh", 3, "Physics");
        System.out.println(researchStudent.getDetails());

    }
}

class Student{
    private final String name;
    private  int year;
    private  static final int annualFees = 10000;

    Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getDetails() {
        return  "Name : "+name + '\n' + "Fees : "+this.computeFees();
    }

    public float computeFees(){
        return this.year * Student.annualFees;
        /*annual fees is static fields so called using class reference*/
        /*Year is nonstatic belongs to specific object*/
    }


}

class ResearchStudent{
    private final String name;
    private  int year;
    private String researchArea;

    private  static final int annualFees = 20000;

    ResearchStudent(String name, int year, String researchArea) {
        this.name = name;
        this.year = year;
        this.researchArea = researchArea;
    }

    public String getDetails() {
        return  "Research Student Name : "+name + '\n' + "Fees : "+this.computeFees() + '\n' +"Course : "+this.researchArea;
    }

    public float computeFees(){
        return this.year * ResearchStudent.annualFees;
        /*annual fees is static fields so called using class reference*/
        /*Year is nonstatic belongs to specific object*/
    }


}