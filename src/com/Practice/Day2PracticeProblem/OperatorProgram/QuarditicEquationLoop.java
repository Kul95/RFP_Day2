package com.Practice.Day2PracticeProblem.OperatorProgram;

import java.util.Scanner;

public class QuarditicEquationLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a=sc.nextDouble();
        System.out.println("Enter the second number: ");
        double b=sc.nextDouble();
        System.out.println("Enter the third number: ");
        double c=sc.nextDouble();
        double root1,root2;
        double determinant=b*b-4*a*c;
        if(determinant>0){
            root1=(-b+Math.sqrt(determinant)/2*a);
            root2=(-b-Math.sqrt(determinant)/2*a);
            System.out.format("Root1 and root2",root1,root2);
        } else if (determinant==0) {
            root1=root2=-b/(2*a);
            System.out.format("root1:"+root1);
        }
        else {
            double real=-b/(2*a);
            double imaginary=Math.sqrt(-determinant)/(2*a);
            System.out.format("root1:"+real+" "+imaginary);
            System.out.format("root2: "+real+" "+imaginary);
        }
    }
}
