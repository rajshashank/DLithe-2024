// return a string with maximum no of special characters or maximum vowels in an array of strings
 
import java.util.*;

public class maxSpChr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the strings");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        String ans = maxSpecialChar(arr);
        String ans1 = maxVowels(arr);
        System.out.println("String with max Special character is : " + ans);
        System.out.println("String with max Vowels is : " + ans);
        sc.close();
    }

    static String maxSpecialChar(String[] arr) {
        int n = arr.length;
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = countSpecialChar(arr[i]);
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (max < count[i]) {
                max = count[i];
                index = i;
            }
        }
        return arr[index];
    }

    static String maxVowels(String[] arr) {
        int n = arr.length;
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = countVowels(arr[i]);
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (max < count[i]) {
                max = count[i];
                index = i;
            }
        }
        return arr[index];
    }

    static int countSpecialChar(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetterOrDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)))
                count++;
        }
        return count;
    }

    static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt
            (i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
            count++;
        }
        return count;
    }

}
