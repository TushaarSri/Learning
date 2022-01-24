package com.inheritance;

public class StudentMain {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(111, 1000);
        BankAccount bankAccount2 = new BankAccount(222, 2000);
        BankAccount bankAccount3 = new BankAccount(333, 3000);

        Student student = new Student("Karan", 2, bankAccount);
        System.out.println(student.getDetails());

        ResearchStudent researchStudent = new ResearchStudent("Somesh", 3, "Physics", bankAccount2);
        System.out.println(researchStudent.getDetails());

        PhDStudent phDStudent = new PhDStudent("Siddharth", 1, "Physics Advance", "Newtons Laws", bankAccount3);
        System.out.println(phDStudent.getDetails());

    }
}

class Student {
    protected final String name;
    protected int year;

    /*Introduce Bank Account*/ /*A class can have attribute created by class*/
    private BankAccount bankAccount;

    private static final int annualFees = 10000;

    Student(String name, int year, BankAccount bankAccount) {
        this.name = name;
        this.year = year;
        this.bankAccount = bankAccount;
    }

    public String getDetails() {
        return "Name : " + name + '\n' + "Fees : " + this.computeFees();
    }

    public float computeFees() {
        return this.year * Student.annualFees;
        /*annual fees is static fields so called using class reference*/
        /*Year is nonstatic belongs to specific object*/
    }


}

class ResearchStudent extends Student {
    private String researchArea;

    private static final int annualFees = 20000;

    ResearchStudent(String name, int year, String researchArea, BankAccount bankAccount) {
        super(name, year, bankAccount);
        this.researchArea = researchArea;
    }

    public String getDetails() {
        return this.name + " is a research student with research area " + this.researchArea +
                " and he/she is in his/her " + this.year;
    }


}

class PhDStudent extends ResearchStudent {
    private String thesisTitle;

    private static final int annualFees = 20000;

    PhDStudent(String name, int year, String researchArea, String thesisTitle, BankAccount bankAccount) {
        super(name, year, researchArea, bankAccount);
        this.thesisTitle = thesisTitle;
    }


}

class BankAccount {
    private int accountNumber;
    private int balance;

    public BankAccount(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}