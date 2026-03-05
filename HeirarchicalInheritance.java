import java.util.Scanner;
class Publisher {
    String publisherName;
    
    public Publisher(String publisherName) {
        this.publisherName = publisherName;
        }
    public void display() {
        System.out.println("Publisher Name: " + publisherName);
        }
    }
class Book extends Publisher {
    String bookName;
    String author;
    double price;
    
    public Book(String publisherName, String bookName, String author, double price) {
       super(publisherName);
       this.bookName = bookName;
       this.author = author;
       this.price = price;
       }

public void display() {
    super.display();
    System.out.println("Book's Name: " + bookName);
    System.out.println("Author's Name: " + author);
    System.out.println("Book's price: " + price);
    }
}
class Literature extends Book {
    String type;
    
    public Literature(String publisherName, String bookName, String author, double price, String type){
    super(publisherName, bookName, author, price) ;
    this.type = type;
    }

public void display() {
    super.display();
    System.out.println("Book's Type:" + type);
    System.out.println("--------------------------------------");
    }
}
class Fiction extends Book {
    String genre;
    
    public Fiction(String publisherName, String bookName, String author, double price, String genre){
    super(publisherName, bookName, author, price) ;
    this.genre = genre;
    }

public void display() {
    super.display();
    System.out.println("Book's Genre:" + genre);
    System.out.println("--------------------------------------");
    }
}  
public class HeirarchicalInheritance {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of Books: ");
        int n = sc.nextInt();
        Book[] arr = new Book[n];    
        
    for (int i = 0; i < n; i++) {
       System.out.println("\n--- Enter Details for Book " + (i + 1) +" ---");
       System.out.print("Select Category (1 for Literature, 2 for Fiction): ");
       int choice = sc.nextInt();
       sc.nextLine();   
       
       System.out.print("Publisher Name: ");
       String publisherName = sc.nextLine();
       System.out.print("Book Name: ");
       String bookName = sc.nextLine();
       System.out.print("Author: ");
       String author = sc.nextLine();
       System.out.print("Price: ");
       double price = sc.nextDouble();
       sc.nextLine();

       if (choice == 1) {
       System.out.print("Literature Type: ");
       String type = sc.nextLine();
       arr[i] = new Literature(publisherName, bookName, author, price, type);
       }
       
       else if (choice == 2) {
       System.out.print("Fiction Genre: ");
       String genre = sc.nextLine(); 
       arr[i] = new Fiction(publisherName, bookName, author, price, genre);
       }
       
       else {
       System.out.println("Invalid choice");
       
       }
    }
       System.out.println("\n-----Display Book By Category-----");
       System.out.print("Enter category to display (1 for Literature and 2 for Fiction):");
       int searchChoice = sc.nextInt();
       boolean found = false; 
       
       for (int i=0; i<n; i++) {
        if (searchChoice == 1 && arr[i] instanceof Literature) { 
         arr[i].display();
         found = true;
         }
        else if (searchChoice == 2 && arr[i] instanceof Fiction) { 
         arr[i].display();
         found = true;
         } 
      }
      if (!found) {
         System.out.println("No books found in the selected category");
         }
      }    
  }    
