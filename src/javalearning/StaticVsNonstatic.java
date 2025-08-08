package javalearning;

public class StaticVsNonstatic {

	public static void main(String[] args) {
		
	}
	

	public static void eat() {
		System.out.println("Test 1");
		//sing();
		dance();
	}

	public void dance() {
		System.out.println("Test 2");
		//eat();
	}

	public static void sing() {
		System.out.println("Test 3");
		StaticVsNonstatic2 ani = new StaticVsNonstatic2();
		ani.Anirudh();
	}

	public void cry() {
		System.out.println("Test 4");
		dance();
	}

}
