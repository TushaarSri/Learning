package com.questions.oops;


import java.util.*;

class Number {
    //Write your code here
    double real;
    double imaginary;

    /*Constructor*/
    Number(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getRealPart(){
        return real;
    }


    public double getImaginaryPart() {
        //Write your code here
        return imaginary;
    }

    public void setRealPart(double num1){
        this.real = num1;
    }

    public void setImaginaryPart(double num2){
        this.imaginary = num2;
    }

    public void display(){
        System.out.println(real + " " + imaginary);
    }

}

class Complex extends Number {

    public Complex(double real, double imaginary){
        super(real, imaginary);
    }

    public void checkComplex(){
        if(imaginary == 0 ){
            System.out.println("The given number is real");
        } else {
            System.out.println("The given number is complex");
        }
    }

    public void display(){
        System.out.println(real + "" + "+" + "" + "i" + imaginary);
    }
}

class PurelyImaginary extends Complex {

    PurelyImaginary(double real, double imaginary){
        super(real, imaginary);
    }

    public void checkPurelyImaginaryNumber(){
        if(real == 0 && imaginary != 0){
            display();
            System.out.println("The number is purely imaginary");
        } else {
            super.display();
            System.out.println("“The number is not purely imaginary");
        }
    }

    public void setRealZero(double real){
        this.real = 0;
    }

    public void display(){
        System.out.println("i"+imaginary);
    }
}

public class NumberSystemInheritance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());
        System.out.println(num.getImaginaryPart());
        num.checkComplex();
        num.checkPurelyImaginaryNumber();

    }
}
