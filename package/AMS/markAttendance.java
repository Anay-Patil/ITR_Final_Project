package AMS;
import java.util.*;
public class markAttendance 
{
    Scanner sc = new Scanner(System.in);
    int presentCount = 0;
    public String[] students = new String[10];
    public boolean[] attendance = new boolean[10];

    public void mark()
	{
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        attendance[rollNo-1] = true;
        presentCount++;
		
        System.out.println("Attendance marked for " +"!!"+ students[rollNo - 1]+"!!");
    }
}
