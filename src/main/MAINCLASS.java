package main;

import java.util.Scanner;
import banking.bankingClass;

public class MAINCLASS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int attemp = 3;
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
                
                while(attemp != 0){
                
                bankingClass bc = new bankingClass();
                
                System.out.println("Enter your Account No: ");
                int accountNo = sc.nextInt();

                System.out.println("Enter your Pin: ");
                int pin = sc.nextInt();
              
                   
                    if(bc.verifyAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                        System.exit(0);
                    
                    }else{
                        attemp--;
                        System.out.println("INVALID ACCOUNT!");
                    }
                    
                   
                    if( attemp == 0){
                        System.out.println("Invalid Selection!");
                        
                    }
          
      
        }
        break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
               
                
          
       }
    }  
}
