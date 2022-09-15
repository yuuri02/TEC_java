package jva;

import java.util.Scanner;

public class e108jva1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.print("整数を入力、負で終了 --> ");
            int hikisu = sc.nextInt();
            System.out.println("<main> ----- hikisu = " + hikisu);
            if (hikisu < 0) {
                System.out.println("<main> 負が入力されました");
                break;
            }
            System.out.println("<main> ----- メソッド myMethod()を呼ぶよ, 引数は" + hikisu);
            System.out.println();
            int modorichi = myMethod(hikisu);
            System.out.println("<main> ----- メソッド myMethod()から戻ってきた");
            System.out.println("<main> modorichi = " + modorichi);
            System.out.println("<main> hikisu = " + hikisu);
            System.out.println();
        }
        System.out.println("<main> おしまい");
    }

    private static int myMethod(int x) {
        System.out.println("--- <myMethod> 受け取った引数の値は " + x + "です");
        System.out.println("--- <myMethod> 10倍にして返します");
        x *= 10;
        return x;
    }
}
