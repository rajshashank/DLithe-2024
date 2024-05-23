// given string . Return ther number of special characters from the string

import java.util.*;

public class spchr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int c = calcSpc(str);
        System.out.println("Number of special characters in the string is " + c);
        sc.close();
    }

    static int calcSpc(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetterOrDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) 
                count++;
        }
        return count;
    }
}
