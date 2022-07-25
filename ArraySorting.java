package array;

import java.util.Scanner;
public class ArraySorting {
    public void sorting(int arr[],int n){
        int i,j,temp;
        for(i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Array in ascending order");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int size,i;
        System.out.print("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr1[]=new int[size];
        System.out.println("Enter "+size+ " elements in an array");
        for(i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        ArraySorting sort=new ArraySorting();
        sort.sorting(arr1,size);
    }
}
