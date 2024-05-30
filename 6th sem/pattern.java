// method three to print
// ****
// *  *
// *  *
// ****

public class pattern {
    public static void main(String[] args) {
        System.out.println();
        one();
        System.out.println();
        two();
        System.out.println();
        three();
        System.out.println();
        four();
        System.out.println();
    }

    static void four() {
        for (int i = 0; i < 10; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.println();
            }
            
        }
    }

    static void one() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void two() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void three() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || i == 0 || j == 4 || i == 4) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
