/*The purpose of this lone class is to create a Script that will calculate 
/the number of students who are incorrectly counted on average per meal.
@Alex Sandoval*/
import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
	//Creation of needed items
		Scanner scanny = new Scanner(System.in);
		double totalNum = 0; //This is the total number of people that came through the door
		double perBath = 10; //This number represents the average percentage to 
							//10 is a placeholder until data is gathered
		double adjNum =0; //This number represents the total number of unique individuals who entered the door
		
	//Gather user data	
	System.out.println("Please enter the number of students");
	totalNum = scanny.nextDouble();
	
	adjNum = (totalNum*((100- perBath)/100));
	System.out.println(adjNum);
	
	
	
	System.out.println("Thank you, Assuming "+ perBath +"% came in twice we would have " + adjNum +" indevidual people coming in ");	
		
	}

}
