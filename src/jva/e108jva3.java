package jva;

import java.util.Scanner;

public class e108jva3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.print("2つの整数を入力, 2つが等しい時終了 --> ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("<main> a = " + a + " b = " + b);
            if (a == b) {
                System.out.println("<main> 等しい数が入力されました");
                break;
            }
            int ans = mySum(a, b);
            System.out.println("<main> ans = " + ans);
            System.out.println();
        }
        System.out.println("<main> おしまい");
    }

    private static int mySum(int x, int y) {
        System.out.println("-- <mySum> 引数は" + x + "と" + y);
        int ans = 0;
        System.out.print("-- <mySum> ");
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        for (int i = min; i <= max; i++) {
            ans += i;
            System.out.print(i);
            if (i != max)
                System.out.print(" + ");
        }
        System.out.println(" = " + ans);
        return ans;
    }
}
