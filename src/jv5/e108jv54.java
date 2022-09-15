package jv5;

import java.util.Scanner;

public class e108jv54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ndata = 0, gokei = 0;
        int[] ten = new int[4];
        for (int i = 0; i < ten.length; i++) {
            System.out.print("点数を入力--> ");
            int t = sc.nextInt();
            ten[i] = t;
            System.out.println("k =" + i + " ten[" + i + "]=" + t);
            char hyoka;
            if (t >= 80) {
                hyoka = 'A';
            } else if (t >= 60) {
                hyoka = 'B';
            } else {
                hyoka = 'C';
            }
            System.out.println(t + "点は評価: " + hyoka);
            ndata++;
            gokei += t;
        }
        double heikin = (double)gokei / ndata;
        System.out.println();
        System.out.println("ndata = " + ndata);
        System.out.println("goukei = " + gokei);
        System.out.println("heikin = " + heikin);
        System.out.println("おしまい");
    }
}
