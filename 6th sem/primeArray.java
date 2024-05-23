// Q ... write a program to read n number of elements into the array the arrange all the prime elements at the begining of the array and non prime elements all a the end of the array
import java.util.*;

public class primeArray {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);


        System.out.println("enter the size of the array");
        int n = sin.nextInt();

    }
    
    static boolean isPrime(int a) {
        if (a == 0 || a == 1) {
            return false;
        }
        else{
            for (int i = 2; i <= a/2 ; i++) {
                if (a % i == 0)
                    return false;
            }
        }
        return true;
    }
}


