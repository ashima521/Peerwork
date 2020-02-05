package com.qa.factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		boolean factorial = true;
		int number = Utils.input();
		int originalNumber = number;
		int i = 1;
		while (number != 1) {
			i++;
			if ((number % i) != 0) {
				System.out.println(originalNumber + " = NONE");
				factorial = false;
				break;
			}

			number = number / i;
//			System.out.println(i + "what is i" + number);

		}
		if (factorial == true) {
			System.out.println(originalNumber + "=" + i + "!");

		}
	}
}
