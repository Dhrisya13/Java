import java.util.Scanner;
import mathutils.Calculator;

public class PackageMain {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Calculator cal=new Calculator();
      System.out.println("first number:");
      double n1=sc.nextDouble();
      System.out.println("Second number:");
      double n2=sc.nextDouble();
      System.out.println("Addition:"+cal.add(n1,n2));
      System.out.println("Subtraction:"+cal.subtract(n1,n2));
      System.out.println("Multiplication:"+cal.multiply(n1,n2));
      
      if (n2==0.0) {
        System.out.print("not divisible by zero");
      }
      else {
      System.out.println("Division:"+cal.div(n1,n2));
      }
   }
}
        
