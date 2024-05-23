import java.util.*;

public class uniquesString {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sin.nextLine();
        boolean result = ifUnique(s);
        System.out.println(result);

    }
    public static boolean ifUnique (String s){
        int c = 0;
        for (int i = 0; i < s.length; i++) {
            if (String.indexOf(i) == String.lastIndexOf(i)) {
                c += 1;
            }
        }
    }
}
