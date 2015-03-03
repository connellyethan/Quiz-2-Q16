package Problem16;

import java.util.Scanner;

public class Tuition {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the intial tuition: ");
		double initial_tuition = input.nextDouble();
		
		System.out.println("Enter the percent increase in tuition (decimal): ");
		double rate = input.nextDouble();
		
		input.close();
		
		double total = initial_tuition;
		
		for (int i = 1; i < 4; i++){
			
			double increase = initial_tuition * rate;
			
			double new_tuition = initial_tuition + increase;
			
			total += new_tuition;
			
			initial_tuition = new_tuition;
			
		}
		
		System.out.printf("The total tuition at the end of 4 years is %.2f", total);
		
		}
				
		
		
		
		
	}
		
	


