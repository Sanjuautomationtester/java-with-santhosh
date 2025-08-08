package controlstatements;

public class IfElse {
	
	static int year = 2024;

	public static void main(String[] args) {
		int number = 20;
		
		if(number>10) {
			System.out.println("condition passed");
		}
			else if(number<30) {
				System.out.println("this is also passed");
	}
			else {
			System.out.println("Condition failed");
			}
	
	
	int age = 18;
	if(age<18) {
	
		System.out.println("a person can vote");
	}
		else {
			System.out.println("a person cannot vote");
		}
	String username ="admin";
	String password ="admin123";
	
	if(username == "admin123"  && password == "admin123") {
		System.out.println("condition matches");
	}
		else {
			System.out.println("condition failed");
		}
	

	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	    System.out.println(year + " is a leap year.");
	} else {
	    System.out.println(year + " is not a leap year.");
	}
	
	}
}

