package string;

import java.util.Scanner;
public class NoOfOccurance {
    public static void main(String[] args) {
        String str;
        char ch, search;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        str = sc.nextLine();
        System.out.println("Enter the character you want to search: ");
        search = sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (search == ch) {
                count++;
            }
        }
        if (count != 0)
            System.out.println("Your search charater is present on the string "+count+ " time");
        else
            System.out.println("Charater not found");
    }
}
