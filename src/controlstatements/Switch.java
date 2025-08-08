package controlstatements;

public class Switch {

	public static void main(String[] args) {
		String grade = "B";
		grade = grade.trim();

		switch (grade) {
		case "A":
			System.out.println("Excellent grade");
			break;
		case "B":
		case "B plus":
			// System.out.println("Good Grade");
			if (grade.equals("B plus")) {
				System.out.println("Great");
			} else if (grade.equals("B")) {
				System.out.println("Good");
			}

			break;
		case "C":
			System.out.println("Average Grade");
			break;
		case "F":
			System.out.println("Fail");
			break;

		default:
			System.out.println("Did not appear for exam");
		}
	}

}
