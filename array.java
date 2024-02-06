import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        int a[] = new int[5];
        int b[] = new int[5];
        int res[] = new int[5];
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the values of first array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sin.nextInt();
        }
        System.out.println("Enter the values of second array");
        for (int i = 0; i < b.length; i++) {
            b[i] = sin.nextInt();
        }

        res = add(a, b);

        System.out.println("Resultant array is: ");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + " ");
        }

    }

    static int[] add(int a[], int b[]) {
        int c[] = new int[a.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }
}
