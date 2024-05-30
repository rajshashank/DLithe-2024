import java.util.*;

public class div {
    public static void main(String[] args) {
        int n = 8;
        int lim = 4 * n;
        int res = 0;
        int i;
        System.out.println(lim);
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                int sq = i * i;
                if (sq <= lim)
                    res += sq;
                    // System.out.println(res);
            }
        }
        System.out.println(res);
    }
}