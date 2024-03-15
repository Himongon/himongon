package gpacheck;

import java.util.Scanner;


public class GPACheck {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Please Enter Your GPA on: Science");
        int grade = scn.nextInt();
        
        if (grade > 75) {
            System.out.println("You Have Scored " + grade + " in: Science");
            System.out.println("You Have Passed The Class of: Science.");    
        } else {
            System.out.println("You Have Scored " + grade + " in: Science");
            System.out.println("You Did Not Meet The Requirements To Pass The Class.");
        }
        
        
        
        
    }
    
}
