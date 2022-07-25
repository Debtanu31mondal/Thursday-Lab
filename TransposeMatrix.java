package array;
import java.util.Scanner;
public class TransposeMatrix {
        public static void main(String []args)
        {
            Scanner sc=new Scanner(System.in);

            int row,col;       //Variable declaration

            System.out.println("Enter the number of rows:" );
            row=sc.nextInt();  //Row Size Initialization

            System.out.println("Enter the number of column:" );
            col=sc.nextInt();  //Column Size Initialization

            int arr[][]=new int[row][col];    //Matrix Declaration
            System.out.println("Enter the elements of the matrix: ");
            for(int i=0;i<row;i++)    //Matrix Initialization
            {
                for(int j=0;j<col;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }

            //Print the original Matrix
            System.out.println("The elements in the original matrix are: ");
            for(int i=0;i<row;i++)     //Print the matrix
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("");
            }

            int arr2[][]=new int[row][col];        //Transpose Matrix Declaration
            for(int i=0;i<row;i++)     //Transpose Matrix initialization
            {
                for(int j=0;j<col;j++)
                {
                    arr2[j][i]=arr[i][j];   //Store elements in the transpose matrix
                }
            }

            System.out.println("After transposing the elements are: ");
            for(int i=0;i<row;i++)      //Print the transpose matrix
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println("");
            }

        }
    }

