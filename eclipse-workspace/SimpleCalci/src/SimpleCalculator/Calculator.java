package SimpleCalculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isExit = false;

        System.out.println("Calculator");

        while (!isExit) {
            System.out.println("1. Perform addition");
            System.out.println("2. Perform subtraction");
            System.out.println("3. Perform multiplication");
            System.out.println("4. Perform division");
            System.out.println("5. Exit");

            System.out.println("Enter your choice (1-5):");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    performOperation("addition", scan);
                    break;
                case 2:
                    performOperation("subtraction", scan);
                    break;
                case 3:
                    performOperation("multiplication", scan);
                    break;
                case 4:
                    performOperation("division", scan);
                    break;
                case 5:
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
                    break;
            }
        }
    }

    public static void performOperation(String operation, Scanner scan) {
        System.out.println("Enter first number:");
        int firstNumber = scan.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scan.nextInt();

        switch (operation) {
            case "addition":
                System.out.println("Addition of the two numbers is equals to: " + (firstNumber + secondNumber));
                break;
            case "subtraction":
                System.out.println("Subtraction of the two numbers is equals to: " + (firstNumber - secondNumber));
                break;
            case "multiplication":
                System.out.println("Multiplication of the two numbers is equals to:" + (firstNumber * secondNumber));
                break;
            case "division":
                if (secondNumber != 0) {
                    System.out.println("Division of the two numbers is equals to: " + ((double) firstNumber / secondNumber));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}
