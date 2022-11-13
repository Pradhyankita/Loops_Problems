package com.bridgelabz.pp2;

import java.util.Scanner;

public class ReverseUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer you want to reverse ");
        long number = sc.nextLong();
        if (number >= 10) {
            long rev = 0;
            for (; number != 0; ) {
                long rem = number % 10;
                rev = rev * 10 + rem;
                number = number / 10;
            }
            System.out.println("Reverse of the Integer is " + rev);
        }else{
            System.out.println("Enter a number whic can be reversed!");
        }
    }
}
