// given array with n numbers of elements return true if all the elements in array contains same number of digits else return false

import java.util.*;

public class sameDigits {
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
        while ( a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }

    static boolean check(int a[]) {
        int c = count(a[0]);
        for (int i = 1; i < a.length; i++) {
            if (count(a[i]) != c)
                return false;
        }
        return true;
    }
}
