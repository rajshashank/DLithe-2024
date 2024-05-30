// given a wall length "WL" in inches m number of small bricks(1 inch each in length) and n number of large bricks (5 inch each in length).
// return true if it is possible to construct the wall with the given bricks else return false 

// wall(sb,lb,wl)-->true
// wall(2,2,7)-->true
// wall(3,5,19) --> false

import java.util.*;

public class wall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the small bricks: ");
        int s = sc.nextInt();
        System.out.println("Enter the large bricks: ");
        int l = sc.nextInt();
        System.out.println("Enter the wall size: ");
        int w = sc.nextInt();
        System.out.println(checkWall(s, l, w));
        sc.close();
    }

    // static boolean checkWall(int s, int l, int w) {
    //     int rl = w / 5; //required wall
    //     int minl = Math.min(l, rl); //minimun large wall
    //     int lw = w - (minl * 5); //large our wall minus large wall
    //     return lw < s;
    // }
    
    static boolean checkWall(int s, int l, int w) {
        int rl = w / 5;  //required wall
        int minl = Math.min(l, rl);  //minimun large wall
        int lw = w - (minl * 5);  //large our wall minus large wall
        return lw < s;
    }
}
            


// int rlb = wl / 5;
// int minlb = Math.min(rlb, lb);
// int lwl = wl - (minlb * 5);
// return lwl<=sb;
