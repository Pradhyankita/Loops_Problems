package com.bridgelabz.pp2;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();
        System.out.println("Enter your choice: \n1)First operation \n2)Second operation \n3)Third operation \n4)Fourth operation");
        int ch = sc.nextInt();
        int op1 = 0;
        int op2 = 0;
        int op3 = 0;
        int op4 = 0;
        switch (ch) {
            case 1:
                op1 = num1 + num2 * num3;
                System.out.println(op1);
                break;
            case 2:
                op2 = num3 + num1 / num2;
                System.out.println(op2);
                break;
            case 3:
                op3 = num1 % num2 + num3;
                System.out.println(op3);
                break;
            case 4:
                op4 = num1 * num2 + num3;
                System.out.println(op4);
                break;
            default:
                System.out.println("Enter a valid choice!");
                break;
        }
        if (op1 > op2 && op1 > op3 && op1 > op4) {
            System.out.println("First operation is the maximum output" + op1);
        } else if (op2 > op1 && op2 > op3 && op2 > op4) {
            System.out.println("Second operation is the maximum output" + op2);
        } else if (op3 > op1 && op3 > op2 && op3 > op4) {
            System.out.println("Third operation is the maximum output" + op3);
        } else if (op4 > op1 && op4 > op2 && op4 > op3) {
            System.out.println("Fourth operation is the maximum output" + op4);
        } else {
            System.out.println("Enter a valid");
        }
    }
}
