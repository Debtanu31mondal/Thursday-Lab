package array;

import java.util.Scanner;
public class SecondLargestElement {
    public static void getArray(int arr[],int size){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+size+ " elements in an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void secondlarge(int arr[],int n){
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
        System.out.println();
        System.out.println("Second largest element is the: "+arr[n-2]);
    }
    public static void main(String[] args) {
        int size;
        System.out.print("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr1[]=new int[size];
        SecondLargestElement.getArray(arr1,size);
        SecondLargestElement.secondlarge(arr1,size);
    }
}
