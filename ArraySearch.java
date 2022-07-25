package array;
import java.util.Scanner;
public class ArraySearch {

    public void searchElementInArray(int arr[],int search){
        int i;
        int position=-1;
        //logic for search
        for(i=0;i<arr.length;i++)
        {
            if(search==arr[i]){
                position=i;
                break;
            }
        }
        //need to check that we got position or not
        if(position!=-1)
        {
            System.out.println("element found at "+(position+1)+" position");
        }
        else System.out.println("data not found");
    }
    public static void main(String[] args) {
        int i,Size,Search;
        System.out.println("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
        Size=sc.nextInt();
        //instantiate array
        int arr1[]=new int[Size];
        //getting array elements from user
        System.out.println("enter "+Size+ " elements in an array");
        for(i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        //getting search elements from user
        System.out.println("enter elements to search: ");
        Search=sc.nextInt();
        ArraySearch sear=new ArraySearch();
        sear.searchElementInArray(arr1,Search);

    }
}
