import java.util.Scanner;
class CPU {
  double price;
  
  CPU() {
    price=0;
    }
  CPU(double p) {
    price=p;
    }
    
    class Processor {
       int cores;
       String manufacturer;
       
    Processor() {
       cores=0;
       manufacturer="";
       }
    Processor(int c,String m) {
       cores = c;
       manufacturer=m;
       }
     }
   static class RAM {
       int memory;
       String manufacturer;
    
    RAM() {
       memory=0;
       manufacturer="";
       }
    RAM(int mem, String man) {
       memory=mem;
       manufacturer=man;
       }
     } 
   } 
   public class CPUMain {
       public static void main(String[] args) {
       	  Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter the detail of the CPU");
          System.out.print("Enter the price of the CPU:");
          double p1 = sc.nextDouble();
          sc.nextLine();
          
          CPU c1 = new CPU(p1);
          
          System.out.print("Enter the cores of the CPU:");
          int p2 = sc.nextInt();
          sc.nextLine();
          System.out.print("Enter the manufacturer of the CPU:");
          String p3 = sc.nextLine();
          sc.nextLine();
          
          CPU.Processor c2 = c1.new Processor(p2,p3);
          
          System.out.print("Enter the memory of the CPU:");
          int p4 = sc.nextInt();
          sc.nextLine();
          System.out.print("Enter the manufacturer of the CPU:");
          String p5 = sc.nextLine();
          sc.nextLine();
          
          CPU.RAM c3 = new CPU.RAM(p4,p5);
          
          System.out.println("---DETAIL OF THE CPU---");
          System.out.println("Price of CPU:"+c1.price);
          System.out.println("Core of CPU:"+c2.cores);
          System.out.println("manufacture of CPU:"+c2.manufacturer);
          System.out.println("Memory of CPU:"+c3.memory);
          System.out.println("Manufacture of CPU:"+c3.manufacturer);
          }
       }
