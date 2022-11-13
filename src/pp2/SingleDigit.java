package com.bridgelabz.pp2;

import java.util.Scanner;

public class SingleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the single digit number you want in word format ");
        int digit = sc.nextInt();
        if(digit < 10){
            if(digit == 1){
                System.out.println("ONE");
            }else if(digit == 2){
                System.out.println("TWO");
            }else if(digit == 3){
                System.out.println("THREE");
            }else if(digit == 4){
                System.out.println("FOUR");
            }else if(digit == 5){
                System.out.println("FIVE");
            }else if(digit == 6){
                System.out.println("SIX");
            }else if(digit == 7){
                System.out.println("SEVEN");
            }else if(digit == 8){
                System.out.println("EIGHT");
            }else{
                System.out.println("NINE");
            }
        }else{
            System.out.println("Enter a valid single digit number");
        }
    }
}
