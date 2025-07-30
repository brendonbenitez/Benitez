
package activity1;

import java.util.Scanner;

public class Activity2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter employee name: ");
        String ename = sc.nextLine();
        System.out.println("Enter hourly rate: ");
        float hrate = sc.nextFloat();
        System.out.println("Enter total hours worked: ");
        float hours = sc.nextFloat();
        
        
        System.out.println("-------WAGE SUMMARY-------");
        System.out.println("Employee: "+ename);
        System.out.printf("Hourly Rate: ₱%.2f",hrate);
        System.out.println("\nHours worked: "+hours);
        System.out.println("Gross Weekly Wage: "+(hours*hrate));
        System.out.printf("SSS Contribution(10%%): ₱%.2f",(hours*hrate)*0.1);
        System.out.println("\n--------------------------");
        System.out.printf("Net Weekly Wage: ₱%.2f",((hours*hrate)-((hours*hrate)*0.1)));
        
        
    }
    
    
  
 
    
    
    
    
}
