package javaapplication1;
import java.util.Scanner;


public class JavaApplication1 {

    public static void main(String[] args) {
    
       Scanner Lol = new Scanner(System.in);
       Scanner Date = new Scanner(System.in);
      
        System.out.println("Enter First Name/s");
        String FirstName = Lol.nextLine();
     
        System.out.println("Enter Middle Name");
        String MidName = Lol.nextLine();
     
        System.out.println("Enter Last Name");
        String LastName = Lol.nextLine();
     
        System.out.println("Enter Month of Birth");
        String Month = Date.nextLine();
       
        System.out.println("Enter Day of Birth");
        String Day = Date.nextLine();
     
        System.out.println("Enter Year of Birth");
        String Year = Date.nextLine();
        
        System.out.println("Enter Your Age");
        String Age = Date.nextLine();
        
        System.out.println("YOUR NAME IS: "+ FirstName + " " + MidName + " " + LastName);  
        System.out.println("Your Birthdate is: " + Day + "/" + Month + "/" + Year);
        System.out.println("Your Age is: " + Age);
        System.out.println("lol");
    }
}
