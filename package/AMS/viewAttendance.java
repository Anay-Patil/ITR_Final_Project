package AMS;
import java.util.*;
public class viewAttendance 
{
    int presentCount = 0;
   public String[] students = new String[10];
   public boolean[] attendance = new boolean[10];

    public void view() 
	{
        System.out.println("==============================");
        System.out.println("Roll No  Name \t\tAttendance");
        System.out.println("==============================");
        for (int i = 0; i < students.length; i++)
		{
            System.out.println((i + 1) + " \t" + " " + students[i] + "\t" + " "+ (attendance[i] ? "Present" : "Absent"));
            if(attendance[i]) 
			{
                presentCount++;
            }
				/*if (attendance[i])
					{
					System.out.println((i + 1) + " \t" + " " + students[i] + "\t" + "Present");
					presentCount++;
					} 
				else 
				{
					System.out.println((i + 1) + " \t" + " " + students[i] + "\t" + "Absent");
				}*/
        }
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("Present Student= " + presentCount);
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
}
