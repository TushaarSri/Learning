package com.ploymorphism;


interface PersonInterfaces {
    public abstract String getDetails();

    public abstract float computeSalary();
}

class StudentInterfaces implements PersonInterfaces {
    protected final int rollNumber;
    protected int year;

    protected static final int annualFees = 10000;
    protected static final int annualSalary = 15000;

    public StudentInterfaces(int rollNumber, int year) {
        this.rollNumber = rollNumber;
        this.year = year;
    }


    public String getDetails() {
        return "Roll Number : " + rollNumber + '\n' +
                "Fees : " + this.computeFees();
    }

    protected float computeFees() {
        return StudentInterfaces.annualFees * year;
    }

    public float computeFees(int annualFees) {
        return StudentInterfaces.annualFees * this.year;
    }

    public float computeSalary() {
        return StudentInterfaces.annualSalary * this.year;
    }
}

class ProfessorInterfaces implements PersonInterfaces {
    private int employeeNumber;
    private static final float startingSalary = 50000;

    public ProfessorInterfaces(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getDetails() {
        return "Employee Number : " + this.employeeNumber;
    }

    public float computeSalary() {
        return this.startingSalary;

    }

}


class ResearchStudentInterfaces extends StudentInterfaces {
    protected String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudentInterfaces(int rollNumber, int year, String researchArea) {
        super(rollNumber, year);
        this.researchArea = researchArea;
    }

    protected float computeFees() {
        return StudentInterfaces.annualFees * this.year * 0.9f;
    }


}


public class StudentInterfacesMain {
    public static void main(String[] a) {

        StudentInterfaces s1 = new StudentInterfaces(200, 2);
        //System.out.println(s1.getDetails());

        ResearchStudentInterfaces s2 = new ResearchStudentInterfaces(300, 3, "Software Engineering");
        //System.out.println(s2.getDetails());

        ProfessorInterfaces p1 = new ProfessorInterfaces(100);

        PersonInterfaces[] array = {s1, s2, p1};
        printDetails(array);


    }

    public static void  printDetails (PersonInterfaces [] persons) {
        for (PersonInterfaces personInterfaces : persons) {
            System.out.println(personInterfaces.getDetails());
            System.out.println("Salary: " + personInterfaces.computeSalary());
        }
    }



}
