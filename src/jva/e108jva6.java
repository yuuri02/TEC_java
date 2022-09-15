package jva;

import java.util.Scanner;

public class e108jva6 {
    final static int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.print("カレンダーの月を入力, 0以下で終了 --> ");
            int tuki = sc.nextInt();
            System.out.println("tuki = " + tuki);
            if (tuki < 0) {
                System.out.println("0以下が入力されました");
                break;
            }
            if (tuki > 12) {
                System.out.println("月が正しくありません、再入力してください");
                continue;
            }
            System.out.print(tuki + "月の開始曜日を入力 --> ");
            int start = sc.nextInt();
            System.out.print("表示する月の数を入力してください --> ");
            int su = sc.nextInt();
            for (int i = 0; i < su; i++) {
                start = calender(tuki, start);
                tuki++;
                if (tuki > 12) tuki = 1;
            }
        }
    }

    private static int calender(int x, int blank) {
        System.out.println("<"+x+"月のカレンダー>");
        System.out.println("日 月 火 水 木 金 土");
        for (int i = 0; i < days[x-1]; i++) {
            //未実装
        }
        return 0;
    }
}
