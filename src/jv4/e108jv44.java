package jv4;

import java.util.Scanner;

public class e108jv44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height, weight;
        System.out.print("身長 (cm) を整数で入力-->");
        height = sc.nextInt();
        System.out.print("体重 (kg) を整数で入力-->");
        weight = sc.nextInt();
        System.out.printf("身長 %scm 体重 %skg\n", height, weight);
        double bmi = (double) weight / (height * height);
        System.out.printf("BMI = %.2f\n", bmi);
        double sn = height / 100.0;
        int hyoutai = (int) (22 * sn * sn);
        System.out.println("標準体重は " + hyoutai + "kg です");
        if (bmi < 18.5) {
            System.out.println("やせすぎです");
        } else if (bmi <= 25) {
            System.out.println("理想的です");
        } else {
            System.out.println("太りすぎです");
        }
        System.out.println("おしまい");
    }
}
