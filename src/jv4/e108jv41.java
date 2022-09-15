package jv4;

import java.util.Scanner;

public class e108jv41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = 0;
        for (int i = 0; i < 5; i++) {
            int age = sc.nextInt();
            System.out.print("nenrei = " + age + " ");
            if (age >= 65) {
                cost += 1000;
                System.out.println(age + "歳はシニア 1000円");
            } else if (age >= 18) {
                cost += 1500;
                System.out.println(age + "歳は大人 1500円");
            } else {
                cost += 800;
                System.out.println(age + "歳はこども 800円");
            }
        }
        System.out.println();
        System.out.println("料金の合計 = " + cost);
        System.out.println("おしまい");
    }
}
