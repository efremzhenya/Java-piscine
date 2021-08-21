package com.company;

public class Program {

    public static void main(String[] args) {
	    int sixDigitNumber = 479598;
	    int sumOfNumberSet = 0;

	    sumOfNumberSet += sixDigitNumber % 10;
	    sixDigitNumber /= 10;

	    sumOfNumberSet += sixDigitNumber % 10;
	    sixDigitNumber /= 10;

	    sumOfNumberSet += sixDigitNumber % 10;
	    sixDigitNumber /= 10;

	    sumOfNumberSet += sixDigitNumber % 10;
	    sixDigitNumber /= 10;

	    sumOfNumberSet += sixDigitNumber % 10;
	    sixDigitNumber /= 10;

	    sumOfNumberSet += sixDigitNumber;

	    System.out.print(sumOfNumberSet);
    }
}
