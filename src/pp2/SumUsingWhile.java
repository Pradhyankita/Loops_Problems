package com.bridgelabz.pp2;

import java.util.Scanner;

public class SumUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of natural numbers you want ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        System.out.println("N= " +n);
        while(i <= n){
               sum = sum + i;
               i++;
               // System.out.println(n);
            }System.out.println("Sum is " +sum);

        SumUsingWhile obj = new SumUsingWhile();
        obj.sum(n);

        }
        void sum(int n ){
            int i = 1;
            int sum = 0;
            System.out.println("N= " +n);
            while(i <= n){
                sum = sum + i;
                i++;
                // System.out.println(n);
            }System.out.println("Sum is " +sum);
        }
    }
