import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int a = sin.nextInt();
        int b = sin.nextInt();
        double x = (Math.log(a) + Math.log10(b) + Math.exp(a)) / (Math.pow(a, b) + Math.cbrt(b) + Math.tan(a));
        System.out.println(x);
    }
}
