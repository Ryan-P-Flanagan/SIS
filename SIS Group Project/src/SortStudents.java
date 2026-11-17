import java.util.Scanner;

public class SortStudents {
	static Scanner userIntInput = new Scanner(System.in);
	static int choice()
	{
		System.out.println("Sort Students");
		System.out.println();
		System.out.println("1) Sort by last name");
		System.out.println("2) Sort by GPA");
		System.out.println("3) Sort by period");
		int selection = userIntInput.nextInt();
		return selection;
	}
}
