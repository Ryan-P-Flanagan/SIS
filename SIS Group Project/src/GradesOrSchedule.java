import java.util.Scanner;

public class GradesOrSchedule {
	static Scanner userIntInput = new Scanner(System.in);
	static int choice()
	{
		System.out.println("Change Student Grades/Schedule");
		System.out.println();
		System.out.println("1) Change Grade");
		System.out.println("2) Switch Classes");
		int selection = userIntInput.nextInt();
		return selection;
	}

}
