package projectLearning02;

import java.util.Scanner;

public class tutorial02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int patternLenght = scan.nextInt();
		for(int i =0; i<patternLenght;i++) {
			for(int j =0; j<=i;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		for(int i = patternLenght; i>0; i--) {
			for (int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}