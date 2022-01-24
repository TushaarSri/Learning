package com.ploymorphism;


abstract class PersonAbstract {
    protected final String name;

    public PersonAbstract(String name) {
        this.name = name;

    }

    public abstract String getDetails();

}

class StudentAbstract extends PersonAbstract{

    protected int year;

    protected static final int annualFees = 10000;

    public StudentAbstract(String name, int year) {
        super(name);
        this.year = year;
    }


    public String getDetails() {
        return "Name : " + name + '\n' +
                "Fees : " + computeFees();
    }

    protected float computeFees() {
        return StudentAbstract.annualFees * year;
    }

    public float computeFees(int annualFees){
        return annualFees * this.year;
    }



}

class ProfessorAbstract extends PersonAbstract {
    private int employeeNumber;
    private static final float startingSalary = 50000;

    public ProfessorAbstract(String name, int employeeNumber){
        super(name);
        this.employeeNumber = employeeNumber;

    }

    public String getDetails(){
        return "Name : "+name+ '\n' +"Salary : "+ this.computeSalary();
    }

    public float computeSalary(){
        return this.startingSalary;
    }

}


class ResearchStudentAbstract extends StudentAbstract {
    protected String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudentAbstract(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;
    }

    protected float computeFees(){
        return StudentAbstract.annualFees * this.year*0.9f;
    }


}

public class StudentAbstractMain {
    public static void main(String[] a) {

        StudentAbstract s1 = new StudentAbstract("karan", 2);
        //System.out.println(s1.getDetails());

        ResearchStudentAbstract s2 = new ResearchStudentAbstract("siddharth", 3, "Software Engineering");
        //System.out.println(s2.getDetails());

        ProfessorAbstract p1 = new ProfessorAbstract("SKC", 100);

        PersonAbstract[] array = {s1, s2, p1};
        printDetails(array);


    }

    public static void  printDetails (PersonAbstract [] persons) {
        for (PersonAbstract person: persons) {
            System.out.println(person.getDetails());
        }
    }

}
