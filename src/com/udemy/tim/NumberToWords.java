package com.udemy.tim;

public class NumberToWords {
	public static void numberToWords(int number) {
		int digit = reverse(number);
			int lastDigit = 0;
			while(digit > 0) {
				lastDigit = digit % 10;
				switch(lastDigit) {
				case 0:
					System.out.println("ZERO");
					break;
				case 1:
					System.out.println("ONE");
					break;
				case 2:
					System.out.println("TWO");
					break;
				case 3:
					System.out.println("THREE");
					break;
				case 4:
					System.out.println("FOUR");
					break;
				case 5:
					System.out.println("FIVE");
					break;
				case 6:
					System.out.println("SIX");
					break;
				case 7:
					System.out.println("SEVEN");
					break;
				case 8:
					System.out.println("EIGHT");
					break;
				case 9:
					System.out.println("NINE");
					break;
				default:
					System.out.println("Invalid Value");		
				}
				digit = digit / 10;
			}
		}
		public static int reverse(int number) {
			int digit = 0, reversed = 0;
			while(number > 0) {
				digit = number % 10;
				reversed = reversed * 10 + digit;
				//reversed = reversed + digit;
				number /= 10;
			}
			return reversed;
		}

		public static int getDigitCount(int number) {
			if(number < 0) {
				return -1;
			}
			return String.valueOf(number).length();
		}
	}