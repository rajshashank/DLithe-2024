import java.util.*;
public class palindromeSubString {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sin.nextLine();
        String longPal = longPalindrome(s);
        System.out.println("Longest palindrome substring is: " + longPal);

    }

    public static String longPalindrome(String s){
        for (int i = 0; i < s.length-1; i++) {
            for (int j = i; j < s.length; j++) {
                
            }
        }
    }

    public static boolean isPali(String sub) {
        
    }
    
}
