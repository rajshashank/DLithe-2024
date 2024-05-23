import java.util.Scanner;

public class precision {
    public static void main(String args[]) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter a floating number: ");
        float num = sin.nextFloat();
        System.out.println("Enter the precision");
        int pre = sin.nextInt();

        if (pre > 7) {
            String s = String.format("%." + pre + "f", num);
            System.out.print(s);
        } else {
            System.out.println("0");
        }

    }
}