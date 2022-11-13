package com.bridgelabz.pp2;

import java.util.Scanner;

public class SumUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of natural numbers you want ");
        int num = sc.nextInt();
        SumUsingFor obj = new SumUsingFor();
        obj.sum(num);
    }
    void sum(int num){
        int sum = 0;
        for(int temp = 1;temp<=num;temp++){
            sum = sum + temp;
           // System.out.println("Sum is " + sum);
        }
        System.out.println("Sum is " + sum);
    }
}
