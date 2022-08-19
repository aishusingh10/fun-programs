import java.util.*;

public class Fibonnaci {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci2(i));
        }

    }

    public static void fibonacci1(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        if (n == 1) {
            System.out.println(n1);
        } else if (n == 2) {
            System.out.println(n1);
            System.out.println(n2);
        } else {
            System.out.println(n1);
            System.out.println(n2);
            for (int i = 0; i < n - 2; i++) {
                n3 = n1 + n2;
                System.out.println(n3);
                n1 = n2;
                n2 = n3;
            }
        }
    }

    public static int fibonacci2(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            int fib = fibonacci2(n - 1) + fibonacci2(n - 2);
            return fib;
        }

    }

}
