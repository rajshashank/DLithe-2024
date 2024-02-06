import java.util.Scanner;
import java.util.*;

public class atm {

    public static void main(String[] args) {
        int iPin = 1234;
        Scanner sin = new Scanner(System.in);
        int bal = 0;

        System.out.println("Enter the pin: ");
        int pin = sin.nextInt();
        if (iPin == pin) {

            while (true) {

                System.out.println("Choose from the following operation");
                System.out.println(" 1. Deposit");
                System.out.println(" 2. Withdraw");
                System.out.println(" 3. Balance Enquiry");
                System.out.println(" 4. PIN Change");
                System.out.println(" 5. Exit");
                int choice = sin.nextInt();

                switch (choice) {
                    case 1:
                        bal = deposit(bal);
                        break;
                    case 2:
                        bal = withdraw(bal);
                        break;
                    case 3:
                        bal_enq(bal);
                        break;
                    case 4:
                        pinChange(pin);
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter valid option");
                        break;
                }
            }

        } else {
            System.out.println("Incorrect pin");
        }
    }

    public static int deposit(int bal) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the deposit amount: ");
        int depoAmt = sin.nextInt();
        bal += depoAmt;
        return bal;
    }

    public static int withdraw(int n) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the Withdrawal amount: ");
        int withAmt = sin.nextInt();
        if (withAmt < n) {
            n -= withAmt;
            System.out.println("Withdraw succesfull");
        } else {
            System.out.println("Insufficiant Balance");
        }

        return n;
    }

    public static int bal_enq(int n) {
        System.out.println("Your balance is: ");
        System.out.println(n)
    }

    public static int pinChange(int n) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the old PIN");
        int epin = sin.nextInt();
        if (epin == n) {
            System.out.println("Enter the new pin");
            n = sin.nextInt();
        } else {
            System.out.println("Invalid pin");
        }
        return;
    }
}
