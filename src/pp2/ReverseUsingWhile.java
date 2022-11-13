package com.bridgelabz.pp2;

import java.util.Scanner;

public class ReverseUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer you want to reverse ");
        long number = sc.nextLong();
        ReverseUsingWhile obj1 = new ReverseUsingWhile();
        obj1.reverse(number);
    }
    void reverse(long number){
        long rev = 0;
        while (number != 0) {
            long rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        System.out.println("Reverse of the Integer is " + rev);
    }
}
