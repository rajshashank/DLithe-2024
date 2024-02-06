import java.util.Scanner;

public class unique {
    public static void main(String[] args) {
        int a[] = new int[5];
        int unique[] = new int[5];
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the array elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sin.nextInt();
        }
        int b[] = { 1, 1, 2, 2, 3 };
        unique = Unique(b);

        System.out.println("Unique elements are: ");
        for (int i = 0; i < unique.length; i++) {
            System.out.println(unique[i] + " ");
        }
    }

    static int[] Unique(int a[]) {
        int z[] = new int[5];
        int count = 0;
        int k = 0;
        for (int i = 0; i < a.length; i++) {

            int j = i;

            while (j <= a.length) {
                if (i == j)
                    continue;
                else if (a[i] == a[j]) {
                    count++;
                    break;
                }
                j++;

            }
            z[k++] = a[i];
        }

        return z;
    }
}
