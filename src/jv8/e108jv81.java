package jv8;

import java.util.Scanner;

public class e108jv81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.print("西暦を入力 --> ");
            int nen = sc.nextInt();
            int uru = 0;
            int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            System.out.println("nen = " + nen);
            if (nen < 0) {
                System.out.println("負が入力されました");
                break;
            }
            if (nen%400 == 0) uru = 1;
            else if (nen%100 != 0 && nen%4 == 0) uru = 1;

            if (uru == 1) {
                days[1]++;
                System.out.println(nen + "年は閏年です");
            } else {
                System.out.println(nen + "年は閏年ではありません");
            }
            for (int i = 0; i < days.length; i++) System.out.print(days[i] + " ");
            System.out.println();
        }
        System.out.println("おしまい");
    }
}
