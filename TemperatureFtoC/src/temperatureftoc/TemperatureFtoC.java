package temperatureftoc;

import java.util.Scanner;

public class TemperatureFtoC {
 
    public static void main(String[] args) {

       Scanner scn = new Scanner(System.in);
       
         System.out.println("Please type in the temperature in fahrenheit");
         int Temp = scn.nextInt();
         
         System.out.println("Your Temperature in Celsius is: " + ((Temp - 32)*0.56));
    }
    
}
