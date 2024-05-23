// Q .. check if a number is prime and reverse the num and check if that is prime and return 1 fi yes and return 0 if not 


import java.util.*;


public class primeReversePrime {
    public static void main(String[] args) {

    }
    
    static boolean isPrime(int a) {

    }
    
    static int reverse(int a) {
        int rev = 0;
        while (a > 0) {
            int rem = a % 10;
            rev = rev * 10 + rem;
            a /= 2;
        }
        return rev;
    }
}
