package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any day: ");
        int day = sc.nextInt();

        switch(day){
            case 1:
            case 3:
            case 5:
                System.out.println("JAVA LESSON"); break;
            case 2:
            case 4:
                System.out.println("TECHNICAL ENGLISH"); break;
            case 6:
            case 7:
                System.out.println("HOLIDAY!"); break;
            default:
                System.out.println("YOU ENTERED WRONG NUMBER");
        }
    }
}
