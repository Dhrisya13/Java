import java.util.Scanner;
public class MatrixMain {
      public static void main (String[] args) {
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Enter the dimension for matrix A:");
           System.out.print("ROWS:  ");
           int row1=sc.nextInt();
           
           System.out.print("COLUMNS:  ");
           int col1=sc.nextInt();
           
           System.out.println("Enter the dimension of matrix B:");
           System.out.print("ROWS:  ");
           int row2=sc.nextInt();
           
           System.out.print("COLUMNS:  ");
           int col2=sc.nextInt();
           
           int[][] A = new int[row1][col1];
           int[][] B = new int[row2][col2];
           
           System.out.println("Enter elements for matrix A:");
           for (int i=0; i<row1; i++) {
               for(int j=0; j<col1; j++) {
                  A[i][j] = sc.nextInt();
               }
           }
           System.out.println("Enter elements for matrix B:");
           for (int i=0; i<row2; i++) {
               for(int j=0; j<col2; j++) {
                  B[i][j] = sc.nextInt();
               }
           }
           
           while (true) {
           System.out.println("---MENU---");
           System.out.println("\n1.Addition \n2.Subtraction \n3.Exit\n");
           System.out.print("Enter choice:");
           int choice=sc.nextInt();
           
           if (choice==3) 
              break;
           switch (choice) {
           
           case 1: if(row1==row2 && col1==col2) {
                       System.out.println("Sum Matrix:");
                       for (int i=0;i<row1;i++) {
                          for (int j=0;j<col1;j++) {
                              System.out.print((A[i][j]+B[i][j]) + "\t");
                          }
                        System.out.println();
                        }
                  } else {
                       System.out.println("Error: Dimension must be same for Addition!");
                       } 
                       break;
           case 2: if(col1==row2) {
                     System.out.println("Product Matrix:");
                     int [][] c= new int[row1][col2];
                     for (int i=0;i<row1;i++) {
                       for (int j=0;j<col2;j++) {
                           c[i][j]=0;
                           for (int k=0;k<col1;k++) {
                           c[i][j] += A[i][k] + B[k][j];
                           }
                       System.out.print(c[i][j] + "\t");
                       }
                       System.out.println();
                       }
                   }else {
                      System.out.println("Error: cost of A must equal to row B");
                      }
                      break;
                      
                  default:
                      System.out.println("Invalid choice!");
                      }
                    }
                }
            }
