package com.bridgelabz.pp2;

import java.util.Scanner;

public class MultipleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int digit = sc.nextInt();
        if(digit < 10){
            System.out.println("Units");
        }else if(digit < 100){
            System.out.println("Tens");
        }else if (digit < 1000){
            System.out.println("Hundreds");
        }else{
            System.out.println("Enter a valid number");
        }
    }
}
