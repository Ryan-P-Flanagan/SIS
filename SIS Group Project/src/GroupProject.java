
public class GroupProject
	{

		public static void main(String[] args)
			{
				switch(MainMenu.showMenu())
				{
					case 1: System.out.println(NewOrDelete.choice());
					
					case 2: System.out.println(GradesOrSchedule.choice());
						
					case 3: System.out.println(SortStudents.choice());
				}
				
				
				
			}

	}
