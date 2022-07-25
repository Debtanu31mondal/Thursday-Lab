package string;
import java.util.Scanner;
public class StringSearch {
    public static void main(String[] args) {
        String str;
        char ch, g;
        int position = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        str = sc.nextLine();
        System.out.println("Enter the character you want to search: ");
        g = sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (g == ch) {
                position = i;
                break;
            }
        }
        if (position != -1)
            System.out.println("Character is present on the " + position + " position");
        else
            System.out.println("Charater not found");
    }
}
