package string;

public class NoOfVowels {
    public static void main(String[] args) {
        String str="Hello Java";
        int count=0;
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
                count++;
        }
        if(count!=0)
            System.out.println("The number of vowels present in the string: "+count);
        else
            System.out.println("no vowel is preset in this string");
    }
}
