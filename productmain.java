import java.util.Scanner;
class product {
     int pcode;
     String pname;
     double price;
     
     product(){
        pcode=0;
        pname="unknown";
        price=0;  
     }
     
     product(int c, String n, double p) {
          pcode=c;
          pname=n;
          price=p;
          }
     void display() {
        System.out.println(pcode+"\t"+pname+"\t"+price);
     }
}
public class productmain {
    public static void main(String[] args) {
                 Scanner sc = new Scanner (System.in);
                 
                 product p1=new product(101,"Laptop",45000.00);
                 System.out.println("Enter the details of product2:");
                 
                 System.out.print("Enter the product2 code:");
                 int pcode = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter the product2 name:");
                 String pname = sc.nextLine(); 
                 System.out.print("Enter the price of product2:");
                 double price = sc.nextDouble();
                 
                 product p2=new product(pcode,pname,price);
                 
                 System.out.println("Enter the details of product3:");
                 product p3=new product();
                 System.out.print("Enter the product3 code:");
                 p3.pcode = sc.nextInt();
                 sc.nextLine();
                 System.out.println("Enter the product3 name:");
                 p3.pname=sc.nextLine();
                 System.out.print("Enter the price of product3:");
                 p3.price = sc.nextDouble();
                 
                 System.out.println("\n----Product With Lowest Price----");
                 product low=p1;
                 if(p2.price<low.price) {
                    low=p2;
                 }
                 if(p3.price<low.price) {                
                    low=p3;
                 }
                 System.out.println("code\tname\tprice");
                 low.display();
                 }
                 }
                 
