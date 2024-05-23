import java.util.*;


public class isPrime {
    static boolean Prime(int a) {
        if (a == 0 || a == 1) {
            return false;
        } else {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0)
                    return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if (Prime(a)) {
            System.out.println("Prime");
        } else {
            System.out.println("not Prime");
        }
        sc.close();
        


    }
}


