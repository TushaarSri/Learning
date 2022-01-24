package com.ploymorphism;

public class StudentMainPolymorphism {
    public static void main(String[] args) {

        StudentPolymorphism studentPolymorphism = new StudentPolymorphism("Karan Poly", 2);
        System.out.println(studentPolymorphism.getDetails());

        ResearchStudentPolymorphism researchStudentPolymorphism = new ResearchStudentPolymorphism("Somesh Poly", 3, "Physics");
        System.out.println(researchStudentPolymorphism.getDetails());

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