
/**
 * Write a description of class EmpApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.util.Scanner;
public class EmpApp
{
    public static void main (String[] args)
    {
        EmpTree tree = new EmpTree(); //declare the BST object
        
        Scanner in = new Scanner(System.in);
        
        System.out.print ("Number of employee:");
        int n = in.nextInt();

        //declare array of Employee objects named emp here 
        Employee[] emp = new Employee[n] ;
    
        String aName ;
        long anId ;
        double aBase,anAllow,salary;
    
        for (int i = 0; i < emp.length;i++)
        {
            // input data for the employees here
            System.out.print("\nEmployee name : ") ;
            aName = in.next();
        
            System.out.print("Employee id : ") ;
            anId = in.nextLong() ;
        
            System.out.print("Employee base salary : ") ;
            aBase = in.nextDouble() ;
        
            System.out.print("Employee allowance : ") ;
            anAllow = in.nextDouble() ;
        
            // create the Employee objects here
            emp[i] = new Employee(aName,anId,aBase,anAllow) ;
            tree.insertNode(emp[i]);  
        }
        
         // display the tree
         tree.displayAll();
       
        // search for an employee by name
         System.out.print("\nEmployee name : ") ;
         String name = in.next();
         tree.search(name);
        
         // count number of employee
         System.out.print("\nnumber of employee : ") ;
         tree.count();
         
         //cal payment of employee
         double total=0;
         tree.calcSalary();
         
         //sum payment of all employee
         System.out.print("\nsum payment of all employee : RM" + tree.calcSum());
      }  
      
}
