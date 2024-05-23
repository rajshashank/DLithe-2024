// write a program to read 3 sub marks and find total marks of a student 



import java.util.*;

public class three {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks of sub 1");
        int sub1 = s.nextInt();
        System.out.println("Enter the marks of sub 2");
        int sub2 = s.nextInt();
        System.out.println("Enter the marks of sub 3");
        int sub3 = s.nextInt();
        int total = sub1 + sub2 + sub3;
        System.out.println("Total marks of the student is " + total);
    }
}


public class marks {
    static int total(int a, int b, int c) {
        int total = a + b + c;
        return total;
    }
    
    static int display()
}
