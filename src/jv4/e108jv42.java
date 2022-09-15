package jv4;

import java.util.Scanner;

public class e108jv42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ndata = 0;
        int s = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("身長(cm)を入力-->");
            int height = sc.nextInt();
            s += height;
            System.out.print("身長 " + height + "cm ");
            if (height >= 180) {
                System.out.println("Xサイズ");
            } else if (height >= 165) {
                System.out.println("Lサイズ");
            } else if (height >= 150) {
                System.out.println("Mサイズ");
            } else {
                System.out.println("Sサイズ");
            }
            ndata++;
            System.out.println();
        }
        System.out.println("ndata = " + ndata);
        System.out.println("goukei = " + s);
        System.out.println("heikin = " + (s / (double) ndata));
        System.out.println("おしまい");
    }
}
