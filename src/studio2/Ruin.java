package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What is the start amount?");
		int startAmount = in.nextInt();
		System.out.print("What is the win limit?");
		int winLimit = in.nextInt();
		System.out.print("What is the win chance?");
		double winChance = in.nextDouble();
		System.out.print("What is the total simulations?");
		int totalSimulations = in.nextInt();
		
		for (int count = 1; count <= totalSimulations; count++)
			while (startAmount>0 && startAmount<winLimit) {
				double wina =(Math.random());
				if (winChance > wina) {
				System.out.println("You lose");
				startAmount--;
				System.out.println(startAmount + "");
			}
				else if(winChance<wina) {
				System.out.println("You win");
				startAmount++;
				System.out.println(startAmount + "");
		}
		}
			if (startAmount == 0) { 
			System.out.println("Ruin");
			
			
		}
			else if (startAmount == winLimit) {
			System.out.println("Success");
		
		
		
		
		
			
	}

	
		
	}

}
