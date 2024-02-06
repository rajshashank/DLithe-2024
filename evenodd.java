import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        int n;
        Scanner sin = new Scanner(System.in);
        n = sin.nextInt();
        EorO(n);
    }

    static void EorO(int n) {
        switch (n % 2) {
            case 0:
                System.out.println("even");
            case 1:
                System.out.println("odd");
        }

    }
}
