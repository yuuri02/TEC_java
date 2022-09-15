package jva;

import java.util.Scanner;

public class e108jva2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.print("あいさつの回数を入力 --> ");
            int kaisu = sc.nextInt();
            System.out.println("<main> kaisu = " + kaisu);
            if (kaisu < 0) {
                System.out.println("<main> 負が入力されました");
                break;
            }
            int modorichi = aisatu(kaisu);
            System.out.println("<main> modorichi = " + modorichi);
            System.out.println();

        }
        System.out.println("<main> おしまい");
    }

    private static int aisatu(int k) {
        for (int i = 0; i < k; i++) {
            System.out.println("-- <aisatu> こんにちは");
        }
        return k;
    }
}
