
import java.util.Scanner;
 public class interchangedvalue
        {
     public static void main(String args[])
        {
         int a, b, temp;
         Scanner scan = new Scanner(System.in);

         System.out.print("Enter Value of A and B:\n");
         System.out.print("A = ");
         a = scan.nextInt();
         System.out.print("B = ");
         b = scan.nextInt();

         temp = a;
         a = b;
         b = temp;

         System.out.print("Number Interchanged Successfully..!!\n");
         System.out.print("A = " + a);
         System.out.print("\nB = " + b);
     }


 }