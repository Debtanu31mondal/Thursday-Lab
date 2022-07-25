package array;
import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        int n, i;
        System.out.print("Enter Number of elements in an array : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements of an Array  : ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of original array:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("reverse array: ");
        for (i = n-1; i >= 0; i--) {
            System.out.print(arr[i]+ " ");
        }

    }
}
