import java.util.Scanner;

public class bmiConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight, height, bmi; //set variables
		String type;
		Scanner in = new Scanner(System.in); //start scanner
		
		System.out.println("Please enter your weight: ");
		weight = in.nextDouble(); //get users weight
		
		System.out.println("Please enter your height: ");
		height = in.nextDouble(); //get users height
		
		System.out.println("Is this in Metric units (enter yes or no): ");
		type = in.next(); //ask user if its metric as it uses a different formula
		
		in.close(); //close scanner
		
		if(type.compareTo("yes") == 0)
		{
			//user selected metric
			bmi = weight / Math.pow(height, 2); //divide weight by height squared
		}else {
			bmi = (703 * weight) / Math.pow(height, 2); //weight is multiplied by 703 then divided by height squared
		}
		
		//display bmi chart
		System.out.println("Underweight = < 18.5"); 
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		
		System.out.printf("\nYour BMI is: %.2f", bmi); //displayed users bmi rounded to 2 decimal places
	}

}
