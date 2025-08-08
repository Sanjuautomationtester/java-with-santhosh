package controlstatements;

public class TernaryOperators {

	public static void main(String[] args) {
		int a = 10, b = 20;

		int max = (a > b) ? a : b;

		System.out.println("Greater number is: " + max);
		
		int marks = 55;

		String result = (marks >= 50) ? "Pass" : "Fail";

		System.out.println("You " + result);

	}

}
