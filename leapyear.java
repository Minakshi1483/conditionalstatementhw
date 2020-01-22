
import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;
public class leapyear
{
public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter any year:");
    int year = scan.nextInt();
    scan.close();
    boolean isleap = false;
    if (year % 4 == 0)
    {
        if (year % 100 == 0)
        {
            if (year % 400 == 0)
        isleap = true;
     else
        isleap = false;
    }
        else
        isleap = true;
}
   else{

        isleap = false;
    }

   if(isleap==true)
       System.out.println(year+"is a leap year.");
   else
       System.out.println(year+ "is not a leap Year ");





    }

}