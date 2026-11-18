import java.util.ArrayList;


public class GroupProject
	{

		public static void main(String[] args)
			{
				ArrayList<Student> students = new ArrayList<>();

				switch(MainMenu.showMenu())
				{
					case 1: System.out.println(NewOrDelete.choice());
					
					case 2: System.out.println(GradesOrSchedule.choice());
						
					case 3: System.out.println(SortStudents.choice());
				}
				
				
				
			}

	}
