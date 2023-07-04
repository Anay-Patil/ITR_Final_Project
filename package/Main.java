// Import the Calculator class from the let_me_calculate package
import let_me_calculate.Calculator;
import java.util.*;
public class Main 
{
    public static void main(String args[]) 
	{
        Calculator myCalculator = new Calculator();
       Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 2 NUMBERS: "); 
		int a=sc.nextInt();
		int b=sc.nextInt();
		myCalculator.add(a,b);
    }
}