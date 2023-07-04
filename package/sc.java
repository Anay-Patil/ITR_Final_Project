import let_me_calculate.*;
import java.util.*;
class sc
{
  public static void main(String args[])
  {
   calculator c=new calculator();
   Scanner s=new Scanner(System.in);
   System.out.println("ENTER 2 NUMBERS: ");
   int a=s.nextInt();
   int b=s.nextInt();
   c.add(a,b);
  }
}