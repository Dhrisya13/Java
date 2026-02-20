import java.util.Scanner;
class geometry {
   double area(double r) {
     return Math.PI * r*r ; 
     }
   double area(double l, double b) {
     return l * b ;
     }
   double area(double a, double b, double c) {
     if ((a+b <= c) || (a+c<=b) || (b+c <= a)) {
        System.out.println("There is an error!") ;
        return 0;
        }
      double s = (a+b+c)/2 ; 
      return Math.sqrt(s * (s-a) * (s-b) * (s-c)) ;
      }
   } 
public class MethodOverloading {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       geometry ar1 = new geometry();
       
       System.out.println("---Method Overloading : Area Calculation---");
       System.out.print("Enter radius of the circle:");
       double r = sc.nextDouble();
       System.out.println("Area of a circle:"+ar1.area(r));  
       
       System.out.print("Enter Area of the rectangle:");
       double l = sc.nextDouble();
       double b = sc.nextDouble();
       System.out.println("Area of a rectangle:"+ar1.area(l,b)); 
       
       System.out.print("Enter Area of the triangle:");
       double sideA = sc.nextDouble();
       double sideB = sc.nextDouble();
       double sideC = sc.nextDouble();
       System.out.println("Area of a triangle:"+ar1.area(sideA,sideB,sideC)); 
       
       }
   }
       
       
       
       
       
