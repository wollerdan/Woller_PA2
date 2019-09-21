import java.util.Scanner;

public class encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, n1, n2, n3, n4; //declare variables
		Scanner in = new Scanner(System.in); //start scanner
		
		System.out.println("Enter integer to encrypt: "); //ask user for integer to encrypt
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
    	
    	//add 7 and get remainder from that value
    	
    	n1 = (n1 + 7) % 10;
    	n2 = (n2 + 7) % 10;
    	n3 = (n3 + 7) % 10;
    	n4 = (n4 + 7) % 10;
    	
    	System.out.print(n2 + "" + n1 + "" + n4 + "" + n3); //print encrypted integer
		
	}

}
