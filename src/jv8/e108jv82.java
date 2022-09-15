package jv8;

import java.util.Scanner;

public class e108jv82 {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 9;
        Scanner sc = new Scanner(System.in);
        int k = 0;
        int kaisu = 0;
        for (;;k++) {
            System.out.println("k = " + k + " kaisu = " + kaisu);
            System.out.print("1以上9以下の整数を入力 --> ");
            int x = sc.nextInt();
            System.out.println("x = " + x);
            if (x < MIN) {
                System.out.println("1より小さいのでbreak\nbreakするとkもkaisuも増えない");
                break;
            }
            if (x > MAX) {
                System.out.println("9より大きいのでcontinue \nkaisuは増えない");
                continue;
            }
            kaisu++;
        }
        System.out.println("最終 k = " + k + " kaisu = " + kaisu);
        System.out.println("おしまい");
    }
}
