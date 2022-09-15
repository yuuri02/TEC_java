package jv6;

public class e108jv61 {
    public static void main(String[] args) {
        int[] su = {33, 55, 11, 44, 77, 99, 66};
        int max = su[0];

        System.out.print("<配列suの内容> -- ");
        for (int i = 0; i < su.length; i++) {
            System.out.print(su[i] + " -- ");
        }
        System.out.println("\n");
        System.out.println("<<最大値を求める>>");
        System.out.println("--------- 最初 max は" + max + "とする");
        for (int k = 1; k < su.length; k++) {
            System.out.print("max = " + max + " --> ");
            if (max < su[k]) {
                max = su[k];
                System.out.println("maxは " + max + " に変わりました");
            } else {
                System.out.println("maxは " + max + " のままです");
            }
        }
        System.out.println();
        System.out.println("最後は max = " + max);
        System.out.println("<< メッセージを出力しないで最大値を求める >>");
        max = su[0];
        for (int i = 1; i < su.length; i++) {
            if (max < su[i]) {
                max = su[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("おしまい");
    }
}
