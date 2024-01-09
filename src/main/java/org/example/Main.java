package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            try {
                int accountAmount;
                System.out.println("Enter account balance:");
                Scanner enteredValue = new Scanner(System.in);
                int balance = enteredValue.nextInt();
                System.out.println("Enter the amount to top up:");
                int refill = enteredValue.nextInt();
                if (refill>1000){
                    accountAmount = balance + refill + refill/100;
                    System.out.println("Your bonus: " + refill/100);
                }else {
                    accountAmount = balance + refill;
                }

                System.out.println("In your account: " + accountAmount);
                break;
            }catch (InputMismatchException e) {
                System.out.println("Please, enter the number");
            }
        }
    }

}