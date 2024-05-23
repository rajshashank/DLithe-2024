import java.util.*;

public class email {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the gmail Id: ");
        String mail = sin.nextLine();
        if (mail.endsWith("@gmail.com") != true) {
            System.out.println("Not valid gmail");
        }
        else {
            String left = mail.substring(0, mail.length() - 10);
            char c = left.charAt(0);
            if (Character.isLetter(c) == true || !left.contains(" ")) {
                for (int i = 0; i < left.length(); i++) {
                    if (!(Character.isLetterOrDigit(left.charAt(i))) || isspace(left.charAt(i)))  {
                        
                    }
                }
            }
        
        }

    }
}
