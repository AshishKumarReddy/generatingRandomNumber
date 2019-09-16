import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumber {

	
	
	public static void main(String[] args) {
		
		Random r = new Random();
		int count = 0;
		int randomNumber = r.nextInt((100 - 1) + 1) + 1;
		
		Scanner input = new Scanner(System.in);
		String number = "";
		
		boolean check = false;
		do {
			
			System.out.print("Enter Guess Number: ");
			try {
				number = input.next();
				if(number.equals("q"))
				{
					check = false;
				}
				else
				{
					if(randomNumber == Integer.parseInt(number))
						check = false;
					else
						check = true;
					count = count + 1;
				}
			}
			catch(Exception ex)
			{
				System.out.println("Error: "+ex.getMessage());
			}
		}while(check);
		input.close();
		
		System.out.println("Number of Attempts taken: "+count);
		
	}

}
