import java.util.Scanner;
class Person {
   String name;
   String gender;
   String address;
   int age;
   
   Person(String name, String gender, String address, int age) {
   this.name = name;
   this.gender = gender;
   this.address = address;
   this.age = age;
   }

   public void display() {
      System.out.println("Name : " + name);
      System.out.println("gender : " + gender);
      System.out.println("address : " + address);
      System.out.println("age : " + age);
      }
   }
class Employee  extends Person{
   int emp_id;
   String companyName;
   String qualification;
   double salary;
   
public Employee(String name, String gender, String address, int age, int emp_id, String companyName, String qualification, double salary) {
   super (name, gender, address, age);
   this.emp_id = emp_id;
   this.companyName = companyName;
   this.qualification = qualification;
   this.salary = salary;
   }

public void display() {
   super.display();
   System.out.println("Employee id: " + emp_id);
   System.out.println("Company: " + companyName);
   System.out.println("qualification: " + qualification);
   System.out.println("salary: " + salary);
   }
}
class Teacher  extends Employee{
   String subject;
   String department;
   int teacherid;
   
public Teacher (String name, String gender, String address, int age, int emp_id, String companyName, String qualification, double salary, String subject, String department, int teacherid) {
super (name, gender, address, age, emp_id, companyName, qualification, salary);
   this.subject = subject;
   this.department = department;
   this. teacherid = teacherid;
   }

public void display() {
   super.display();
   System.out.println("Subject: " + subject);
   System.out.println("Department: " + department);
   System.out.println("TeacherId: " + teacherid);
   }
}

public class MultilevelInheritance {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the number of the teachers (N):");
   int n = sc.nextInt();
   
   Teacher[] arr = new Teacher[n];
   
   for (int i=0; i<n; i++) {
      System.out.println("\n---Enter Details for Teachers:" + (i+1) + "---");
      sc.nextLine();
      
      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("Gender: ");
      String gender = sc.nextLine();
      System.out.print("Address: ");
      String address = sc.nextLine();
      System.out.print("Age: ");
      int age = sc.nextInt();
      
      
      System.out.print("Employee id: ");
      int emp_id = sc.nextInt();
      sc.nextLine();
      
      System.out.println("CompanyName: ");
      String companyName = sc.nextLine();
      System.out.println("qualification: ");
      String qualification = sc.nextLine();
      System.out.println("salary: ");
      double salary = sc.nextDouble();
      sc.nextLine();
      
      System.out.print("TeacherId: ");
      int teacherid = sc.nextInt();
      sc.nextLine();
      
      System.out.println("Subject: ");
      String subject = sc.nextLine();
      System.out.println("Department: ");
      String department = sc.nextLine();
      
      arr[i] = new Teacher(name, gender, address, age, emp_id, companyName, qualification, salary, subject, department, teacherid);
      }
      
      System.out.println("\n==========================================");
      System.out.println("            TEACHER RECORDS           ");
      System.out.println("============================================");
      
      for (int i=0; i < arr.length; i++) {
          arr[i].display();
          }
      }
 }
