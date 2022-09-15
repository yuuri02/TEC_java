package jv6;

import java.util.Scanner;

public class e108jv65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] su = {33, 55, 19, 44, 17, 99, 66};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        double heikin;

        System.out.print("<配列の内容> -- ");
        for (int i = 0; i < su.length; i++) {
            System.out.print(su[i] + " -- ");
        }
        System.out.println();
        System.out.print("6以下の正の数を入力--> ");
        int c = sc.nextInt();
        System.out.println("<< 前から " + c + "個について最大、最小、平均を求める >>");

        for (int i = 0; i < c-1; i++) {
            sum += su[i];
            if (max < su[i]) {
                max = su[i];
            }
            if (min > su[i]) {
                min = su[i];
            }
        }

        heikin = (double) sum / c;
        System.out.println("最大は " + max);
        System.out.println("最小は " + min);
        System.out.println("平均は " + heikin);
        System.out.println("おしまい");
    }
}
