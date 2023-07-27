package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = 0;
        int secondNum = 0;
        char operator;

        //first number input
        try {
            firstNum = Integer.parseInt(args[0]);
        } catch (InputMismatchException e) {
            int i;
            do {
                i = 0;
                System.out.println("Use digits only!");
                scanner.nextLine();
                try {
                    System.out.print("Enter first number: ");
                    firstNum = scanner.nextInt();
                } catch (InputMismatchException a) {
                    i = 1;
                }
            } while (i !=0 );
        }

        //second number input
        try {
            secondNum = Integer.parseInt(args[1]);
        } catch (InputMismatchException e) {
            int i;
            do {
                i = 0;
                System.out.println("Use digits only!");
                scanner.nextLine();
                try {
                    System.out.print("Enter second number: ");
                    secondNum = scanner.nextInt();
                } catch (InputMismatchException a) {
                    i = 1;
                }
            } while (i !=0 );
        }

        //operator input
        operator = args[2].charAt(0);
        int i;
        do {
            i=1;
            switch (operator) {
                case '+', '/', '*', '-' -> i = 0;
            }
            if (i!=0){
                System.out.println("Use valid operators only!");
                scanner.nextLine();
                System.out.print("Enter the operator (+, -, *, /): ");
                operator = scanner.next().charAt(0);
            }
        } while (i != 0 );

        switch (operator) {
            case '+' -> System.out.println("The result is: " + (firstNum + secondNum));
            case '-' -> System.out.println("The result is: " + (firstNum - secondNum));
            case '*' -> System.out.println("The result is: " + (firstNum * secondNum));
            case '/' -> {
                if (secondNum == 0){
                    System.err.println("Can't division by zero!");
                }
                else {
                    System.out.println("The result is: " + (float) firstNum / secondNum);
                }
            }
        }
    }
}