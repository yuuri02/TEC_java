package jv9;

import java.util.Scanner;

public class e108jv92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.print("正の10進数を入力 --> ");
            int su = sc.nextInt();
            System.out.println("10進数 su = " + su);
            if (su < 0) {
                System.out.println("負が入力されました");
                break;
            }

            int[] binary = new int[32];
            int k = 0;
            while (su > 0) {
                binary[k] = su%2;
                su /= 2;
                k++;
            }

            System.out.print("2進数表示 --> ");
            for (int i = k-1; i >= 0;i--) {
                System.out.print(binary[i]);
                if (i%4==0) System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("おしまい");
    }
}
