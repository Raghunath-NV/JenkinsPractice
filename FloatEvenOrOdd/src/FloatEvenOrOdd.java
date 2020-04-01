import java.util.Scanner;

//Method to find if float number is even or odd

public class FloatEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();

		try {
			Float.parseFloat(num);
			System.out.print("Using method 3 " + num + " is  ");
			System.out.println(
					(Integer.parseInt(String.valueOf(num.charAt(num.length() - 1)))) % 2 == 0 ? "Even" : "Odd");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Found Non numeric value in input string" + e.getMessage());
		}
	}

}
