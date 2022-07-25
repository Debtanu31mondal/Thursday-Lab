package array;

import java.util.Scanner;

public class ArrayMinAndMax {
    public static void main(String[] args) {
        int i, max, min, Size;
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        Size = sc.nextInt();
        int arr1[] = new int[Size];
        System.out.println("enter " + Size + " elements in an array");
        for (i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        max = min = arr1[0];
        for (i = 1; i < arr1.length; i++) {
            if (arr1[i] > max)
                max = arr1[i];
            else if (arr1[i] < min)
                min = arr1[i];
        }
        System.out.println("Maximum Number: " + max);
        System.out.println("Minimum Number: " + min);
    }
}
