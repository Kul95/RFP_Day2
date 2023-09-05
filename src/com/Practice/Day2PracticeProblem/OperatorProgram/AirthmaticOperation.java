package com.Practice.Day2PracticeProblem.OperatorProgram;

import java.util.Scanner;

public class AirthmaticOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        System.out.println("Enter the third number: ");
        int c=sc.nextInt();
        int x=(a+b*c);
        System.out.println("First arithmetic :"+x);
        int y=(c+a/b);
        System.out.println("Second arithmetic : "+y);
        int z=(a%b+c);
        System.out.println("Third arithmetic : "+z);
        int m=(a*b+c);
        System.out.println("Fourth arithmetic : "+m);
    }
}
