import java.util.ArrayList;
import java.util.Scanner;

public class NewOrDelete {
	static Scanner userIntInput = new Scanner(System.in);
	static Scanner userStringInput = new Scanner(System.in);

	static int choice()
	{
		System.out.println("Add or Delete a Student");
		System.out.println();
		System.out.println("1) Add a student");
		System.out.println("2) Delete a student");
		int selection = userIntInput.nextInt();
		return selection;
	}
	
	public static void addStudent(ArrayList<Student> students)
	{
		System.out.println("Enter first name:");
		String firstName = userStringInput.nextLine();
		
		System.out.println("Enter last name:");
		String lastName = userStringInput.nextLine();
		
		System.out.println("Enter Period 1 class name:");
		String cOne = userStringInput.nextLine();
		
		System.out.println("Enter Period 1 letter grade:");
		String grOne = userStringInput.nextLine().toUpperCase();
		
		System.out.println("Enter Period 2 class name:");
		String cTwo = userStringInput.nextLine();
		
		System.out.println("Enter Period 2 letter grade:");
		String grTwo = userStringInput.nextLine().toUpperCase();
		
		System.out.println("Enter Period 3 class name:");
		String cThree = userStringInput.nextLine();
		
		System.out.println("Enter Period 3 letter grade:");
		String grThree = userStringInput.nextLine().toUpperCase();

		double gpa = calculateGPA(grOne, grTwo, grThree);
		
		students.add(new Student(firstName, lastName, gpa, cOne, cTwo, cThree, grOne.charAt(0), grTwo.charAt(0), grThree.charAt(0)));
		System.out.println(firstName + " " + lastName + " has been added.");
	}

	public static void deleteStudent(ArrayList<Student> students)
	{
		if (students.isEmpty())
		{
			System.out.println("There are no students to delete.");
			return;
		}

		System.out.println("Select a student to delete:");
		for (int i = 0; i < students.size(); i++)
		{
			System.out.println((i + 1) + ") " + students.get(i).getFirstName() + " " + students.get(i).getLastName());
		}

		int index = userIntInput.nextInt() - 1;

		if (index >= 0 && index < students.size())
		{
			Student removed = students.remove(index);
			System.out.println(removed.getFirstName() + " " + removed.getLastName() + " has been deleted.");
		}
		else
		{
			System.out.println("Invalid selection.");
		}
	}

	private static double calculateGPA(String g1, String g2, String g3)
	{
		double total = gradeToPoints(g1) + gradeToPoints(g2) + gradeToPoints(g3);
		return Math.round((total / 3.0) * 100.0) / 100.0;
	}

	private static double gradeToPoints(String grade)
	{
		switch (grade)
		{
			case "A+":
			case "A":  return 4.0;
			case "A-": return 3.7;
			case "B+": return 3.3;
			case "B":  return 3.0;
			case "B-": return 2.7;
			case "C+": return 2.3;
			case "C":  return 2.0;
			case "C-": return 1.7;
			case "D+": return 1.3;
			case "D":  return 1.0;
			case "D-": return 0.7;
			default:   return 0.0;
		}
	}
}