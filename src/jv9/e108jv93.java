package jv9;

import java.util.Scanner;

public class e108jv93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("りんごと子供の数を入力 --> ");
            int apple = sc.nextInt();
            int child = sc.nextInt();
            System.out.println("apple = " + apple + " child = " + child);
            if (apple <= 0 || child <= 0) {
                System.out.println("0以下が入力されました");
                break;
            }
            int n = 0;
            int amari = apple;
            while (amari >= child) {
                n++;
                amari -= child;
                System.out.println(n + "個ずつ渡すと残りは" + amari);
            }
            if (n == 0) {
                System.out.println("りんごが足りなくて一個も渡せない");
            } else if (amari == 0) {
                System.out.println("ちょうどピッタリ！");
            } else {
                System.out.println(child - amari + "個あったら" + (n + 1) + "個渡せるのに");
            }
            System.out.println();
        }
    }
}
