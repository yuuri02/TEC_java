package jva;

import java.util.Scanner;

public class e108jva5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.print("西暦を入力, 負で終了 --> ");
            int nen = sc.nextInt();
            System.out.println("nen = " + nen);
            if (nen < 0) {
                System.out.println("負が入力されました");
                break;
            }
            System.out.print(nen + "年は");
            if (leapYear(nen)) {
                System.out.println("閏年です");
            } else {
                System.out.println("閏年ではない");
            }
        }
        System.out.println("おしまい");
    }

    private static boolean leapYear(int year) {
        if (year%400 == 0) return true;
        if (year%100 == 0) return false;
        return year % 4 == 0;
    }
}
