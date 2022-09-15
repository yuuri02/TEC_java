package jv9;

import java.util.Scanner;

public class e108jv95 {
    public static void main(String[] args) {
        String str;
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.print("単語を入力してください --> ");
        str = sc.next();
        System.out.println("str = " + str);
        System.out.println("<縦書き>");
        for (k = 0; k < str.length(); k++) {
            System.out.println(str.charAt(k));
        }
        System.out.println();

        System.out.println("<2文字ずつ出力>");
        for (k = 0; k < str.length(); k++) {
            System.out.print(str.charAt(k)+str.charAt(k));
        }
        System.out.println();

        System.out.println("<後ろから出力>");
        for (k = str.length()-1; k >= 0; k--) {
            System.out.print(str.charAt(k));
        }
        System.out.println();

        System.out.println("<3角に出力>");
        for (k = 0; k < str.length(); k++) {
            System.out.println(str.substring(0, k+1));
        }
        System.out.println();

        System.out.println("おしまい");
    }
}
