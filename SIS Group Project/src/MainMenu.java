import java.util.Scanner;

public class MainMenu {
	static Scanner userIntInput = new Scanner(System.in);
	static int showMenu()
	{
		System.out.println("What would you like to do");
		System.out.println();
		System.out.println("1) add or delete a student");
		System.out.println("2) change student grades/schedule");
		System.out.println("3) sort students");
		int selection = userIntInput.nextInt();
		return selection;
	}

}
