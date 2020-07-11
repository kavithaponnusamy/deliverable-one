import java.util.Scanner;

public class Vacation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vacationType;
		int groupSize;
		String result = "";
		System.out.println("Enter your vacation choice: Musical / Tropical / Adventurous");
		System.out.println("");
		Scanner scnr = new Scanner(System.in);
		vacationType = scnr.next();
		System.out.println("How many people are in your group?");
		groupSize = scnr.nextInt();
		result = "Since you are a group of "+groupSize+" going on a "+vacationType+" vacation, you should take a ";
		if(groupSize <= 2) {
			result += "first class";			
		}
		else if(groupSize <= 5) {
			result += "helicopter";
		}
		else {
			result += "charter flight";
		}	
		result += " to ";
		if(vacationType.equalsIgnoreCase("Musical")) {
			result += "New Orleans.";
		}
		else if(vacationType.equalsIgnoreCase("Tropical")) {
			result += "Beach Vacation in Mexico.";
		}
		else if (vacationType.equalsIgnoreCase("Adventurous")){
			result += "Whitewater Rafting the Grand Canyon.";
		}
		System.out.println(result);
		scnr.close();
	}
}