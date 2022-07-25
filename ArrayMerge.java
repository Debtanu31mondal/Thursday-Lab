package array;
import java.util.Scanner;
public class ArrayMerge {
    public static void main(String[] args)
    {
        int i, k=0;
        int[] merge = new int[100];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int a = scan.nextInt();
        int[] arr1 = new int[a];
        System.out.print("Enter " +a+ " elements for first array: ");
        for(i=0; i<arr1.length; i++)
        {
            arr1[i] = scan.nextInt();
            merge[k++] = arr1[i];
        }
        System.out.print("Enter the size of second array: ");
        int b = scan.nextInt();
        int[] arr2 = new int[b];
        System.out.print("Enter " +b+ " elements for second array: ");
        for(i=0; i<arr2.length; i++)
        {
            arr2[i] = scan.nextInt();
            merge[k++] = arr2[i];
        }
        System.out.println("The merged array is: ");
        for(i=0; i<arr1.length+arr2.length; i++)
            System.out.print(merge[i]+ " ");
    }
}
