package com.Practice.Day2PracticeProblem.SwitchCasePrograms;

import java.util.Scanner;

public class CheckVowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");break;
            default:
                System.out.println("Consonant");
        }

    }
}
