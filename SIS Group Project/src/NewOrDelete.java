import java.util.Scanner;

public class NewOrDelete {
	static Scanner userIntInput = new Scanner(System.in);
	static int choice()
	{
		System.out.println("Add or Delete a Student");
		System.out.println();
		System.out.println("1) Add a student");
		System.out.println("2) Delete a student");
		int selection = userIntInput.nextInt();
		return selection;
	}
	
	public static void addStudent()
	{
		
	}

}
