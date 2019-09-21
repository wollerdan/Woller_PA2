import java.util.Scanner;

public class survey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// generate variables
		int i, j, counter = 0, score;
		boolean restart = true, ask = true;
		String response;
		String[] topics = { "Video games", "Politics", "Money", "Kids", "Space Colonization"}; //start topics array
		int[][] ratings = new int[5][10]; //start array to get ratings from users
		double avg = 0.0, min = 10.0, max = 0.0;
		String minTopic="", highTopic="";
		Scanner in = new Scanner(System.in); //start scanner
		
		while(restart) //keep loop going while restart = true
		{
			for(i=0; i<topics.length; i++) //go through topics array
			{
				ask = true; //set ask true
				while(ask) //continue to ask same question to check validation of input
				{
					System.out.println("How would you rate " + topics[i] + " from 1-10?");
					score = in.nextInt(); //get user input from score
					if(score > 0 && score < 11) //check if score is between 1 and 10
					{
						ratings[i][score - 1] += 1; //add 1 to the response for topic
						ask = false; //since input was valid, set to false to break loop to go to next question
					}else {
						System.out.println("Your rating must be between 1 and 11.");
					}
				}
			}
			System.out.println("Would you like to add another survey? (yes or no):");
			response = in.next(); //gather response
			if(response.compareTo("no")==0) //if entered no, break loop to calculate results
				restart = false;
			counter++; //gather total amount of people that surveyed
		}
		
		in.close();
		
		System.out.printf("| %-18s |", "Topics"); //allow 18 spaces for looks
		System.out.println(" 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | Avg Rating");
		for(i=0; i<topics.length; i++)
		{
			avg = 0; //set avg to zero for each topic loop
			//System.out.print("| " + topics[i] + "| ");
			System.out.printf("| %-18s | ", topics[i]);
			for(j=0; j<10; j++)
			{
				avg += ratings[i][j] * (j+1); //add to average the response number times the value of the column
				System.out.print(ratings[i][j] + " | ");
			}
			
			avg = avg / counter; //divide the total by how many people took the survey
			
			if(avg > max) //if the current avg is higher than the max, set new topic to as the max
			{
				max = avg;
				highTopic = topics[i];
			}
			
			if(avg < min) //if the current avg is lower than the max, set new topic to the min
			{
				min = avg;
				minTopic = topics[i];
			}
			
			System.out.printf("Avg: %.2f\n", avg);
		}
		
		System.out.println();
		System.out.println("The highest rated topic is: " + highTopic); //show what was the highest rated
		System.out.println("The lowest rated topic is: " + minTopic); //show what the lowest rated
		
	}

}
