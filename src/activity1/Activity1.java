
package activity1;

import java.util.Scanner;

public class Activity1 {

    
    public static void main(String[] args) {
   
        Scanner s = new Scanner(System.in);
      
        
        int total = 0;
        float average;
        String remarks;
        
        
        System.out.print("Enter Student Name: ");
        String name = s.nextLine();
        
        System.out.print("Enter Number of Subject: ");
        int num = s.nextInt();
        
            for (int x = 1 ; x <= num; x++){
            
            System.out.print("Enter grade for sub " + x +" :" );
            total += s.nextInt();
            
            
            
            }
           
        average = (float)total/ (float)num;
        
        if (average >= 75){
            remarks = "Passed";
        }
        else{
            remarks = "Failed";
        }
        
        System.out.printf("Averag: %.2f\n ", average);
        System.out.println("Remarks: " +remarks);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
