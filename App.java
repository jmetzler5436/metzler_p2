package metzler_p2;

import java.util.ArrayList;
import java.util.Scanner; 

public class App {
	
	public static void main(String[] args) {
	    ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();
	   
	    while (moreInput()) {
	        double height = getUserHeight();
	        double weight = getUserWeight();

	        BodyMassIndex bmi = new BodyMassIndex(height, weight);
	        bmiData.add(bmi);
	        
	        displayBmiInfo(bmi);
	    }

	    displayBmiStatistics(bmiData);
	}

	private static boolean moreInput() {
		boolean output = true;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String y = "Y", n = "N";
		int i = 1, j = 0;
		String hold = null;
		
		
		//Sadly have no gotten rid of this line. 
		//This section is to end the while statement in main.
		while(i == 1) {
			System.out.print("Do you wish to continue: (Enter Y or N) ");
			
			hold = sc.nextLine(); 			    
					  
		
		output = hold.equalsIgnoreCase(y);
		boolean noCase = hold.equalsIgnoreCase(n);
		
			if(output == true) {
				i = 0;
			}
			else if (noCase == true){
				i = 0;		
				break;
			}
		}
		
		j++;
		return output;
	}
	
	private static double getUserHeight() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double height = -1;
		
		System.out.print("Enter your height in inches: ");
		
		do{
			height = sc.nextDouble(); 
			
			if(height < 0)
				System.out.println("Please enter a positive value.");
		}while(height < 0);
		
		
		return height;
	}

	private static double getUserWeight() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		double weight = -1;
		
		System.out.print("Enter your weight in pounds: ");
		
		do {
			weight = sc.nextDouble(); 
			
			if(weight < 0)
				System.out.println("Please enter a positive value.");
		} while(weight < 0);
		
		return weight;
	}

	private static void displayBmiInfo(BodyMassIndex bmi) {
		bmi.BMI_Score();
		bmi.BMI_Category();
	}
	
	private static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
		double total = 0, average = 0, hold = 0;
		int i;
		
		for(i=0; i<20; i++) {
			if(bmiData.get(i) == null)
				break;
			hold = bmiData.get(i);
			average = average + hold;
			total = average / i;
		}
		
		System.out.println("The total average is: " + total);
	}
		
	
}
