import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		boolean isExit = false;
		System.out.println("Calculator");
		
		while(!isExit) {
			System.out.println("1.Perform addition \n 2.Perform substraction \n 3. Perform multiplication \n 4. Perform division \n 5. Exit");
			int option = scan.nextInt();
			System.out.println("Enter first number:");
			int firstNumber = scan.nextInt();
			System.out.println("Enter second number:");
			int secondNumber= scan.nextInt();
			switch(option) {
			case 1:
				addValues(firstNumber, secondNumber);
			case 2:
				subtractValues(firstNumber, secondNumber);
			case 3:
				multiplyValues(firstNumber, secondNumber);
			case 4:
				divideValues(firstNumber, secondNumber);
			case 5:
				isExit= true;
			}
		}

	}
	
	public static void addValues(int first, int second) {
		System.out.println("Addition of the two numbers is equals to: " + (first + second));
	}
	public static void subtractValues(int first, int second) {
		System.out.println("Subtraction of the two numbers is equals to: " + (first - second));
	}
	
	public static void multiplyValues(int first, int second) {
		System.out.println("Multiplication of the two numbers is equals to:" + (first * second));
	}
	public static void divideValues(int first, int second) {
		System.out.println("Division of the two numbers is equals to: " + (first/second));
	}

}
