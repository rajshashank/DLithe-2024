
// given array with n numbers of elements return true if all the  prime elements in array contains same number of digits else return false
import java.util.*;

public class primeSameDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr));
        
        sc.close();
    }

    static int count(int a) {
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }

    static boolean check(int a[]) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                c = count(a[i]);
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                if (count(a[i]) != c)
                    return false;
            }
        }
        return true;
    }


    static boolean isPrime(int a) {
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

}
