import java.util.Scanner;

public class decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, n1, n2, n3, n4; //declare variables
		Scanner in = new Scanner(System.in); //start scanner
		
		System.out.println("Enter integer to decrypt: "); //ask user what integer to decrypt
		n = in.nextInt(); //assign user integer to n
		
		in.close(); //close scanner
		
		//separate each digit by getting the remainder and diving to get next digit
		
		n1 = n % 10;
    	n = n / 10;
    	n2 = n % 10;
    	n = n / 10;
    	n3 = n % 10;
    	n = n / 10;
    	n4 = n % 10;
    	n = n / 10;
    	
    	//add 3 to offset the addition of 7 from encryption and get remainder
    	
    	n1 = (n1 + 3) % 10;
    	n2 = (n2 + 3) % 10;
    	n3 = (n3 + 3) % 10;
    	n4 = (n4 + 3) % 10;
    	
    	System.out.print(n2 + "" + n1 + "" + n4 + "" + n3); //give decrypted integer
	}

}
