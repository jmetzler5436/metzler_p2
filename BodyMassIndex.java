package metzler_p2;

import java.util.ArrayList;

public class BodyMassIndex {

	ArrayList<Double> bmiData = new ArrayList<Double>(10); 
	
	public BodyMassIndex(double height, double weight) {
		double BMIscore;
		BMIscore = ((703 * weight) / Math.pow(height, 2));
		bmiData.add(BMIscore);		
	}

	public void BMI_Score() {
		double i = bmiData.get(0);
		i = (double) Math.round(i * 100) / 100;
		System.out.println(i);
		
		
		
	}

	public void BMI_Category() {
		/* 703 * pounds / inches^2
		 * Underweight < 18.5 
		 * Normal weight = 18.5–24.9 
		 * Overweight = 25–29.9 
		 * Obesity >= 30
		 */
		double i = bmiData.get(0);
		
		if(i <= 18.5) 
			System.out.println("Underweight");
		else if(i <= 24.9) 
			System.out.println("Normal weight");
		else if(i <= 29.9) 
			System.out.println("Overweight");
		else 
			System.out.println("Obesity");
		
		
	}
	
	
}


	