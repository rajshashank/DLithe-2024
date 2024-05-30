// given array with n elements should have distinct number of digits return true else false


import java.util.*;
public class diffDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr,n));
        sc.close();
    }
    
    static boolean check(int a[],int n) {
        int[] c = new int[n];
        for (int i = 0; i < a.length; i++) {
            c[i] = count(a[i]);
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = i+1; j < c.length; j++) {
                if (c[i] == c[j]) 
                    return false;
            }
        }
        return true;
    }
    
    static int count(int a) {
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }
}
