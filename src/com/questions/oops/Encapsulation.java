package com.questions.oops;
import java.util.*;

class SavingAmount {
    private int saving;

    public void setInitialSaving(int amount) {
        saving = amount;
    }

    public void incrementSaving() {
        saving += 1000;
    }

    public void decrementSaving() {
        saving -= 100;
    }

    public int getCurrentSaving() {
        return saving;
    }

    public void checkSaving() {
        if (saving >=1000) {
            System.out.println("Congratulations! You have saved a good amount");
        } else if (saving >= 0 && saving <1000) {
            System.out.println("Insufficient saving!");
        } else if (saving < 0) {
            System.out.println("You are in debt");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        SavingAmount obj = new SavingAmount();
        Scanner in = new Scanner(System.in);
        obj.setInitialSaving(in.nextInt());
        obj.decrementSaving();
        obj.incrementSaving();
        obj.checkSaving();
        System.out.println("Your current savings are Rs" +" "+ obj.getCurrentSaving());
    }
}
