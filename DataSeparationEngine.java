import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DataSeparationEngine {
public static void main (String[] args) {
File inputFile=new File("Number.txt");
File evenFile=new File("Even.txt");
File oddFile=new File("Odd.txt");
System.out.println("-> Initializing Tokenization Sequence...");
try (
Scanner sc=new Scanner (inputFile);
PrintWriter evenWriter=new PrintWriter (evenFile);
PrintWriter oddWriter=new PrintWriter(oddFile); )
{
int count=0;
while (sc.hasNextInt()) {
int Number=sc.nextInt();
count++;
if (Number%2==0) {
evenWriter.println(Number);
}
else {
oddWriter.println(Number);
}
}
System.out.println("Result: Successfully processed"+count+"integers");
System.out.println("Output routed to 'Even.txt' and 'Odd.txt'");
}catch (FileNotFoundException e) {
System.err.println("FATAL I/O ERROR: ’numbers.txt’ not found.");
System.err.println("Fix: You must manually create ’numbers.txt’in the project directory and populate it with integers.");
}
}
}
