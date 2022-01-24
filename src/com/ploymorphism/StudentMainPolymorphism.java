package com.ploymorphism;

public class StudentMainPolymorphism {
    public static void main(String[] args) {

        StudentPolymorphism studentPolymorphism = new StudentPolymorphism("Karan Poly", 2);
        System.out.println(studentPolymorphism.getDetails());
        System.out.println(studentPolymorphism.computeFees());

        /* DYNAMIC Polymorphism = allow assign object of subclass reference to super class */

        studentPolymorphism = new ResearchStudentPolymorphism("Somesh Dynamic Polymorphism", 3, "Physics");
        System.out.println(studentPolymorphism.getDetails());

        StudentPolymorphism researchStudentPolymorphism = new ResearchStudentPolymorphism("Somesh Poly", 3, "Physics");
        System.out.println(researchStudentPolymorphism.getDetails());
        System.out.println(researchStudentPolymorphism.computeFees(2000));

        PhDStudentPolymorphism phDStudentPolymorphism = new PhDStudentPolymorphism("Hari",1, "Software engineering", "IOT" );
        System.out.println(phDStudentPolymorphism.getDetails());

        StudentPolymorphism [] array = {studentPolymorphism, researchStudentPolymorphism, phDStudentPolymorphism};
        System.out.println("**************************************");
        printDetails(array);

    }

    public static void printDetails(StudentPolymorphism[] studentPolymorphisms){
        for(StudentPolymorphism studentPolymorphism : studentPolymorphisms){
            System.out.println(studentPolymorphism.getDetails());
        }
    }
}

class StudentPolymorphism {
    protected final String name;
    protected int year;

    private static final int annualFees = 10000;

    StudentPolymorphism(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getDetails() {
        return "Name : " + name + '\n' + "Fees : " + this.computeFees();
    }

    public float computeFees() {
        return this.year * StudentPolymorphism.annualFees;

    }

    /*Method Overloading = Method with same name but different type or number of argument, STATIC POLYMORPHISM*/
    /*Static polymorphism = Compile Time*/
    public float computeFees(int annualFees) {
        return this.year * annualFees;

    }


}

class ResearchStudentPolymorphism extends StudentPolymorphism {
    private String researchArea;

    private static final int annualFees = 20000;

    ResearchStudentPolymorphism(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;
    }
    /*METHOD OVERRIDING = SAME METHOD WITH SAME ARGUMENT AND RETURN TYPE BUT ADDITIONAL INFO*/
    public String getDetails() {
        return super.getDetails() + '\n' + "Research Area : " + this.researchArea;
    }


}

class PhDStudentPolymorphism extends ResearchStudentPolymorphism {
    private String thesisTitle;

    private static final int annualFees = 20000;

    PhDStudentPolymorphism(String name, int year, String researchArea, String thesisTitle) {
        super(name, year, researchArea);
        this.thesisTitle = thesisTitle;
    }


}