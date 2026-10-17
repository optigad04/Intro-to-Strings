import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter your second String: ");
        String str2 = sc.nextLine();

        String combined = str1 + " " + str2;
        System.out.println("Concatenated String: " + combined);

        //length of string
        System.out.println("Length of first string is :" + str1.length());
        System.out.println("Length of second string is :" + str2.length());
        //reverse
        String reverse="";
        for (int i=str1.length()-1;i>=0;i--){
            reverse+=str1.charAt(i);
        }
        System.out.println("Reversed first String: " + reverse);
        String reverse2="";
        for (int i=str2.length()-1;i>=0;i--){
            reverse2+=str2.charAt(i);
        }
        System.out.println("Reversed second String: " + reverse2);
        sc.close();
    }
}