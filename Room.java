package com.gc.roomgenerator;

import java.util.Scanner;

public class Room {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grand Circus' Room Detail Generator");
		Scanner input = new Scanner(System.in);
		String wantToContinue = "y";
		do {
			System.out.println("What is the length of your room?: ");
			int userInputLength = input.nextInt();
			System.out.println("What is the width of your room?: ");
			int userInputWidth = input.nextInt();
			System.out.println("What is the height of your room?: ");
			int userInputHeight = input.nextInt();
			System.out.println("Your rooms details are: ");
			getArea(userInputLength, userInputWidth);
			getPerimeter(userInputLength, userInputWidth);
			getVolume(userInputLength, userInputWidth, userInputHeight);
			input.nextLine();
			System.out.println("Would you like to continue?: ");
			wantToContinue = input.nextLine();
			
		} while (wantToContinue  == "y");
		input.close();
	}

	private static void getVolume(int userInputLength, int userInputWidth, int userInputHeight) {
		int volume = userInputLength * userInputWidth * userInputHeight ;
		System.out.println(volume + " Volume");
	}

	private static void getPerimeter(int userInputLength, int userInputWidth) {
		int perimeter = (userInputLength*2)+ (userInputWidth*2);
		System.out.println(perimeter + " Perimeter");
	}

	private static void getArea(int userInputLength, int userInputWidth) {
		int area = userInputLength*userInputWidth;
		System.out.println(area+ " Area");
	}

}
