import java.util.Scanner;

public class mathpower {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        double x;
        int a = sin.nextInt();
        int b = sin.nextInt();
        System.out.println("a :" + a + "\nb :" + b);
        x = Math.pow((Math.min(a, b)), (Math.max(a, b)));
        long y = Math.round(x);
        System.out.println(y);
        sin.close();
    }
}
