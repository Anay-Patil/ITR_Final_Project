import AMS.*;
import java.util.*;
public class ams1
 {
    public static void main(String args[]) 
	{
        int presentCount = 0, choice;

        String[] students = new String[10];
        boolean[] attendance = new boolean[10];

        viewAttendance v = new viewAttendance();
        markAttendance m = new markAttendance();

        Scanner sc = new Scanner(System.in);

        // Initialize student names
        students[0] = "KSHITIJ";
        students[1] = "TEJAS   ";
        students[2] = "SHRAVANI";
        students[3] = "SAHANTANU";
        students[4] = "VAISHNAVI";
        students[5] = "JAMES   ";
        students[6] = "DENNIS   ";
        students[7] = "BJARNE   ";
        students[8] = "ROHAN   ";
        students[9] = "ROCKY   ";
		
		      System.out.println("-----------------------------------------------------");
              System.out.println("-------------ATTENDANCE MANAGEMENT SYSTEM------------");
			  System.out.println("-----------------------------------------------------");
        do {
			
            System.out.println("\n*************************");
            System.out.println("1. Mark Attendance");
            System.out.println("2. View Attendance");
            System.out.println("3. Exit");
		    System.out.println("*************************");
		    System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{

            case 1:
                m.students = students;
                m.attendance = attendance;
                m.mark();
                break;

            case 2:
                v.students = students;
                v.attendance = attendance;
                v.view();
                break;

            case 3:
                System.out.println("TODAYS ATTENDANCE UPDATED SUCCESSFULLY!!!");
                break;
				
	        default:
                System.out.println("Invalid choice. Please enter a valid choice.");
                break;
            }
        } while (choice != 3);
    }
}
