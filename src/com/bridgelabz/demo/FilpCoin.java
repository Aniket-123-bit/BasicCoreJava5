package com.bridgelabz.demo;
public class FilpCoin {
	public static void main(String[] args) {
		int loopCount = 1;
		double result;
		while(loopCount < 2)
		{

			result = Math.random();

			if(result <= .5)

				System.out.println(" Heads.");

			else

				System.out.println(" Tails.");

			loopCount = loopCount + 1;

		}

	}

}

 
