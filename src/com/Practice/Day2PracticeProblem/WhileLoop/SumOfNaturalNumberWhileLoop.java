package com.Practice.Day2PracticeProblem.WhileLoop;

import java.util.Scanner;

public class SumOfNaturalNumberWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=num){
            sum=sum+i;
          i++;
        }
        System.out.println("Sum of natural numbers are: "+sum);
    }
}
