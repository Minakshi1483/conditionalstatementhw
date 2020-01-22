import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class vowelandconsonant{

    public static void main(String[]args){

    int i=0;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Ener a character:");
    char ch=scanner.next( ).charAt(0);
    //char ch=sc.nextchar();
    switch(ch){

        case 'a' :
        case 'e' :
        case 'i' :
        case 'o' :
        case 'u' :i++;
    }
    if(i==1)
    System.out.println("Entered character "+ch+" is vowel");
    else
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
        System.out.println("Entered character "+ch+"is Consonant");
        else
        System.out.println("Not an alphabet");
}




}

