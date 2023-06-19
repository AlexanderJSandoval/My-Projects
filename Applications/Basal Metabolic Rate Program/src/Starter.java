import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
			
	 Scanner Scanny = new Scanner(System.in);
	 //Get User Values
	 	System.out.println("Please enter true for Male or false for Female");
	Boolean sex = Scanny.nextBoolean();  
	double rawAdd = 1;
	double weightVar = 1;
	double heightVar = 1;
	double ageVar = 1;
	
	if (sex == true) {
			rawAdd = 66;
		 	weightVar = 6.23;
			heightVar = 12.7;
			ageVar = 6.8;
	 }
	
	 if (sex == false) {
		 	rawAdd = 655;
			weightVar = 4.35;
			heightVar = 4.7;
			ageVar = 4.7;
	 }
	 	//test cases
	// System.out.println(weightVar);
	// System.out.println(heightVar);
	// System.out.println(ageVar);
	// System.out.println(rawAdd);
		System.out.println("Please enter your Weight in lbs");
	//Process Weight	
		Double rawWeight = Scanny.nextDouble();
		double undWeight = (rawWeight * weightVar );
		//System.out.println(undWeight);
		
		System.out.println("Please enter your Height in inches");
	//Process Height	
		Double rawHeight = Scanny.nextDouble();
		double undHeight = (rawHeight*heightVar);
		//System.out.println(undHeight);
		
		System.out.println("Please enter your age in years");
	//Process Age		
		Double rawAge = Scanny.nextDouble();
		double undAge = (rawAge*ageVar);
		//System.out.println(undAge);
		
		//Total	calories calculated without factoring in activity level
		double calorieCount = undAge + undHeight + undWeight + rawAdd; 
	
		
//	//Capture activity level
//		double activityMulti = 1;
//		
//		System.out.println("(Input sedentary )•	If you are sedentary (little or no exercise)");
//		System.out.println("(Input light )•	If you are lightly active (light exercise/sports 1-3 days/week)");
//		System.out.println("(Input moderate )•	If you are moderately active (moderate exercise/sports 3-5 days/week)");
//		System.out.println("(Input active)•	If you are very active (exercise/sports 6-7 days a week) ");
//		System.out.println("(Input hard )•	If you are extra active (very hard exercise/sports & physical job or 2x training)"); 
//		
//		String optionTracker = Scanny.nextLine();
//	
//	
//	// Factor in activity level
//		if (optionTracker == "sedentary") {
//		activityMulti = 1.2;	
//		}
//		if (optionTracker == "light") {
//			activityMulti = 1.375;	
//			}
//		if (optionTracker == "moderate") {
//			activityMulti = 1.55;	
//			}
//		if (optionTracker == "active") {
//			activityMulti = 1.725;	
//			}
//		if (optionTracker == "Hard") {
//			activityMulti = 1.9;	
//			}
//		calorieCount = calorieCount * activityMulti;
//		
		System.out.println("Your should eat about " + calorieCount + " per day");
		
		Scanny.close();
	}

}
