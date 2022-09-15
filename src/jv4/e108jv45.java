package jv4;

import java.util.Scanner;

public class e108jv45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("2つの整数を入力-->");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("a = " + a + " b = " + b);
        System.out.print("小さい順に出力 ");
        if (a <= b) {
            System.out.println(a + " " + b);
        } else {
            System.out.println(b + " " + a);
        }
    }
}
