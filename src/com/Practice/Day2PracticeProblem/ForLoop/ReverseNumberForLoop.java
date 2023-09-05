package com.Practice.Day2PracticeProblem.ForLoop;

import java.util.Scanner;

public class ReverseNumberForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int rev=0;
        for(num=0;num>0;num=num/10){
            int rem=num%10;
            rev=rev*10+rem;
        }
        System.out.println("Reverse Number: "+rev);
    }
}
