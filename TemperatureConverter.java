import java.util.Scanner;
public class TemperatureConverter {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while (true) {
      System.out.println("\n1.Celsius to Fahrenheit \n2.Fahrenheit to Celsius \n3.Exit");
      System.out.println("Enter your choice:");
      int choice=sc.nextInt();
      sc.nextLine();
      if (choice==3) {
          break;
      }
      System.out.println("Enter the temperature to convert");
      String userInput=sc.nextLine();
      try {
         double temperature = Double.parseDouble(userInput);
         double convertedTemp;
         switch(choice){
         case 1: 
         convertedTemp = (temperature *9/5)+32;
         System.out.println(+temperature+"C is "+convertedTemp+"F");
         break;
         case 2:
         convertedTemp = (temperature -32)*5/9;
         System.out.println(+temperature+"F is "+convertedTemp+"C");
         break;
         default:
         System.out.println("Error: invalid menu selection!");
         break;
         }
      }
      catch (NumberFormatException e) {
      System.out.println("Error:Invalid input! You must enter a numerical value");
      System.out.println("Exception details:"+e);
      System.out.println("Reason:"+e.getMessage());
      }
      }
      }
      }   
