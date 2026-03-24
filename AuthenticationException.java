import java.util.Scanner;
class AuthenException extends Exception {
   public AuthenException(String message) {
   }
}
public class AuthenticationException {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       final String VALID_USER = "admin";
       final String VALID_PASS = "ktupass123";
       
       System.out.print("Enter username:");
       String inputUser = sc.nextLine();
       
       System.out.print("Enter Password:");
       String inputPass = sc.nextLine();
       
       System.out.println("\n Verifying credentials...");
       try {
            if (!inputUser.equals(VALID_USER) || !inputPass.equals(VALID_PASS)) {
               throw new AuthenException("invalid username or password!");}
            else {
               System.out.println("Access Granted. Welcome to the system");
               }
       } catch (AuthenException e) {
               System.out.println("Security alert:"+ e.getMessage());
               }
       sc.close();
       }
}
