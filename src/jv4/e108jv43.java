package jv4;

import java.util.Scanner;

public class e108jv43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("日付を入力-->");
            int day = sc.nextInt();
            System.out.print("hi = " + day);
            if (0 < day && day <= 31) {
                System.out.println("今日は " + day + "日です");
            } else {
                System.out.println("そんな日付はありません");
            }
        }
        System.out.println("おしまい");
    }
}
