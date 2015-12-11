/*
 * Title:       Lab2
 * Author:      Cruze McFarlane
 * ID #:        620040546
 * Major:       Economics & Computer Science
 * Lecturer:    Careene Rodney
*/
import java.util.Scanner;

public class Lab2
{
    public static void main(String[] arg)
    {
        String fname, lname, email, email2;
        String extension = "uwimona.edu.jm";
        char at = '@';
        String dot = ".";
        int index, index2;
        int a = 12;
        int b = 9;
        int c = 10;
        double d = -14.678;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What is your first name? ");
        fname = scan.nextLine();
        
        System.out.print("\nWhat is your last name? ");
        lname = scan.nextLine();
        
        System.out.println("\nYour full name is: "+fname+" "+lname);
        
        lname = "Jones";
        System.out.println("\nYour full name is: "+fname+" "+lname);
        
        email = fname+dot+lname+at+extension;
        System.out.println("\nYour email address is: " +email.toLowerCase());
        
        System.out.print("\nEnter your UWI email address: ");
        email = scan.nextLine();
        email = email.toLowerCase().replace(" ", "");
        
       index = email.indexOf(at); //check for the '@' sign
       index2 = email.indexOf(dot); //check for the  '.' character
        
       email2 = email.substring(0, index); 
       
             
       if (email2.contains(dot) && email.substring(index).equals(at+extension))
       {
           fname = email.substring(0, index2);
           lname = email.substring(index2+1, index);
           System.out.println("\n" +fname.substring(0,1).toUpperCase()+fname.substring(1) +" " 
           +lname.substring(0,1).toUpperCase()+lname.substring(1) 
           +" this is a valid email!");           
        }
        
        else
        {
            System.out.println("\nInvaild email!");
        }
        
       System.out.println("\nLargest: " +Math.max(b, c));
       System.out.println("\nExponent: " +Math.pow(a,c));       
       System.out.println("\nAbsolute Value: " +Math.abs(d));
    }
}