package com.Practice.Day2PracticeProblem.ForLoop;

import java.util.Scanner;

public class SumOfNaturalNumberForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("Sum of numbers are: "+sum);
    }
}
