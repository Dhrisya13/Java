import java.util.Scanner;

class Employee {
   int eNo;
   String eName;
   double eSalary;
 
   Employee() {
   eNo=0;
   eName="unknown";
   eSalary=0;
   }
   
   Employee(int No, String Name, double Salary) {
   eNo=No;
   eName=Name;
   eSalary=Salary;
   }
   
   public void display() {
   System.out.println(eNo + "\t" + eName + "\t" + eSalary);
   }
}
public class ArrayObj {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter number of employees (N):");
       int n = sc.nextInt();
       
       Employee[] arr = new Employee[n];
       
       System.out.println("\n---Enter Employee Details---");
       for (int i=0; i<n; i++) {
          System.out.println("Employee" + (i+1) + ":");
          
          System.out.println("Enter No:");
          int eNo = sc.nextInt();
          
          sc.nextLine();
          
          System.out.println("Enter eName:");
          String eName = sc.nextLine();
          
          System.out.println("Enter eSalary:");
          double eSalary = sc.nextDouble();
          
          arr[i] = new Employee(eNo, eName, eSalary);
          
          System.out.println();
       }
        System.out.print("Enter Employee number to search:");
        int searchId = sc.nextInt();
        
        boolean found = false;
        System.out.println("\n---Search Results---");
        for (int i=0; i<n; i++) {
          if (arr[i].eNo == searchId) {
             System.out.println("Employee found!");
             arr[i].display();
             
             found = true;
             break;         
          }
        }
          if (!found) {
          System.out.println("Employee not found!!");
          }
          
        }
      }
          
          
          
          
          
          
          
          
               
       
