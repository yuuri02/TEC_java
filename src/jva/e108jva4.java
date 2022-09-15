package jva;

import java.util.Scanner;

public class e108jva4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("段を指定して九九を表示する");
        for (;;) {
            System.out.print("1~9を入力してください 負で終了 --> ");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("負が入力されました");
                break;
            }
            System.out.println("n = " + n);
            int ret = kuku(n);
            System.out.print("ret = " + ret);
            if (ret == 0) {
                System.out.print(" 正常終了");
            } else {
                System.out.println(" エラー");
            }
            System.out.println();
        }
        System.out.println("おしまい");
    }

    private static int kuku(int n) {
        if (n < 0 || 10 < n) return 1;
        System.out.println("<kuku> " + n + " の段");
        for (int i = 1; i <= 9; i++) {
            System.out.println("  " + n + " x " + i + " = " + (n*i));
        }
        System.out.println("-----------");
        return 0;
    }
}
