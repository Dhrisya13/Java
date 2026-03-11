import java.util.Scanner;
interface shape {
    double area();
    double perimeter();
    }
class circle implements shape {
    double radius;
public circle (double radius) {
    this.radius=Math.abs(radius);
    }
public double area() {
    return Math.PI*radius*radius ;
    }
public double perimeter() {
    return 2*Math.PI*radius;
    }
}  
class rectangle implements shape {
    double length;
    double width;
public rectangle (double length, double width) {
    this.length=Math.abs(length);
    this.width=Math.abs(width);
    }
public double area() {
    return length*width;
    }
public double perimeter() {
    return 2*(length+width);
    } 
} 
public class InterfaceMain {
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   shape currentshape=null;
   while (true) {
   System.out.println("\n---Shape Calculator---");
   System.out.println("1.Circle 2.Rectangle 3.Exit");
   System.out.println("select an option");
   
   int choice=sc.nextInt();
   if (choice==3) {
      System.out.println("Execution terminated");
      break;
      }
   switch (choice) {
      case 1:System.out.print("Enter radius:");
             double r=sc.nextDouble();
             currentshape=new circle(r);
             break;
      case 2:System.out.print("Enter length and width:");
             double l=sc.nextDouble();
             double w=sc.nextDouble();
             currentshape=new rectangle(l,w);
             break;
      default:
             System.out.println("Error:Invalid Selection! Try Again");
             continue;
             }
             System.out.printf("Area:%.2f\n",currentshape.area());
             System.out.printf("Perimeter:%.2f\n",currentshape.perimeter());
             }
             sc.close();
      }
}
