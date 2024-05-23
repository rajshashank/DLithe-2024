import java.util.*;

public class sortedarray {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter the array elements!");
        for (int i = 0; i < a.length; i++) {
            a[i] = sin.nextInt();
        }
        System.out.println(sorted(a));
    }


    public static boolean sorted(int a[]) {
        int small = 0;
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < small) {
                small = a[i];
                i = j;

            }
        }
        for (int i = j; i < a.length; i++) {
            
        }
    }
}
