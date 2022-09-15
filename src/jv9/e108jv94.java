package jv9;

import java.util.Scanner;

public class e108jv94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("1~3を入力 0で終了 --> ");
            int su = sc.nextInt();
            System.out.println("su = " + su);
            if (su == 0) {
                System.out.println("0が入力されました");
                break;
            }
            System.out.print("switch()を使った時");
            switch (su) {
                case 1:
                    System.out.println(su + ":緑");
                    break;
                case 2:
                    System.out.println(su + ":白");
                    break;
                case 3:
                    System.out.println(su + ":紫");
                    break;
                default:
                    System.out.println(su + ":その他");
            }
            System.out.print("if()を使った時");
            if (su == 1) {
                System.out.println(su + ":みどり");
            } else if (su == 2) {
                System.out.println(su + ":しろ");
            } else if (su == 3) {
                System.out.println(su + ":むらさき");
            } else {
                System.out.println(su + ":その他");
            }
        }
        System.out.println("おしまい");
    }
}
