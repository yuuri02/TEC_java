package jv8;

import java.util.Scanner;

public class e108jv84 {
    public static void main(String[] args) {
        final int MAX = 180;
        Scanner sc = new Scanner(System.in);
        char[] rank = new char[]{'小', '中', '大', '特'};
        int[] range = new int[]{60, 100, 150, MAX};
        int[] price = new int[]{500, 950, 1450, 1750};
        int n = 0;
        for (;;) {
            System.out.print("180cm以内のサイズを入力 負で終了-->");
            int size = sc.nextInt();
            System.out.println("size = " + size);
            if (size < 0) {
                System.out.println("終了します");
                break;
            }
            if (size > MAX) {
                System.out.println("大きすぎです");
            }

        }
        System.out.println("扱った荷物の個数 n = " + n);
        System.out.println("おしまい");
    }
}
