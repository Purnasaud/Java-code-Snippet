/**
   @version 1.00 2000-04-30
   @author Cay Horstmann
*/

import java.util.*;

public class ArrayListTest
{  
   public static void main(String[] args)
   {  
      ArrayList staff = new ArrayList(); // no size given 

      staff.add(new Employee("Carl Cracker", 75000,
         1987, 12, 15));		// size = 1 
      System.out.println("size= "+ staff.size());

      staff.add(new Employee("Harry Hacker", 50000,
         1989, 10, 1)); 		// size = 2
      System.out.println("size= "+ staff.size());

      staff.add(new Employee("Tony Tester", 40000,
         1990, 3, 15)); 		// size = 3 
      System.out.println("size= "+ staff.size());

      // raise everyone's salary by 5%
      for (int i = 0; i < staff.size(); i++)
      {
         Employee e = (Employee)staff.get(i); // NOTICE the cast 
	System.out.println(e);
         e.raiseSalary(5);
      }

      // print out information about all Employee objects
      for (int i = 0; i < staff.size(); i++)
      {  
         Employee e = (Employee)staff.get(i); //NOTICE the cast
         System.out.println("name=" + e.getName()
            + ",salary=" + e.getSalary()); 
      }

      Employee removal = (Employee)staff.get(1);
      System.out.println("\nremoving " + removal.getName() + "\n");
      staff.remove( 1 );		// size = 2 
      System.out.println("size= "+ staff.size());


       // print out information about all Employee objects
      for (int i = 0; i < staff.size(); i++)
      {
         Employee e = (Employee)staff.get(i); //NOTICE the cast
         System.out.println("name=" + e.getName()
            + ",salary=" + e.getSalary());
      }

   }
}

// A different implementation of Employee class that
// does not rely on the corejava package
class Employee
{  
   public Employee(String n, double s, 
      int year, int month, int day)
   {  
      name = n;
      salary = s;
      GregorianCalendar calendar
         = new GregorianCalendar(year, month - 1, day);
         // GregorianCalendar uses 0 for January
      hireDay = calendar.getTime();
   }

   public String getName()
   {  
      return name;
   }

   public double getSalary()
   {  
      return salary;
   }

   public String toString()
  {
	return (name + salary);	
  }
   public Date getHireDay()
   {  
      return hireDay;
   }

   public void raiseSalary(double byPercent)
   {  
      double raise = salary * byPercent / 100;
      salary += raise;
   }

   private String name;
   private double salary;
   private Date hireDay;
}
