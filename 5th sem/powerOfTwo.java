import java.util.*;
public class powerOfTwo {
    public static void main(String args[]) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sin.nextInt();
        if (isPowerOfTwo(x)) {
            System.out.println("power of 2");
        }
        else {
            System.out.println("not a power of 2");
        }
        
    }
    
    static boolean isPowerOfTwo(int n) {
        if (n == 0)
        return false;
        
        while (n != 1) {
            if (n % 2 != 0)
            return false;
            n = n / 2;
        }
        return true;
    }
    
}

