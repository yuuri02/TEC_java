package jv5;

import java.util.Scanner;

public class e108jv51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int ndata = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("整数を入力-->");
            int su = sc.nextInt();
            System.out.println("入力は su = " + su);
            System.out.println();
            ndata++;
            s += su;
        }
        System.out.println("ndata = " + ndata);
        System.out.println("goukei = " + s);
        System.out.println("おしまい");
    }
}
