package jv6;

public class e108jv62 {
    public static void main(String[] args) {
        int[] su = {77, 99, 44, 33, 88, 22, 66};
        int min = su[0];

        System.out.print("<配列suの内容> -- ");
        for (int i = 0; i < su.length; i++) {
            System.out.print(su[i] + " -- ");
        }
        System.out.println("\n");
        System.out.println("<<最小値を求める>>");
        System.out.println("--------- 最初 min は" + min + "とする");
        for (int k = 1; k < su.length; k++) {
            System.out.print("min = " + min + " --> ");
            if (min > su[k]) {
                min = su[k];
                System.out.println("minは " + min + " に変わりました");
            } else {
                System.out.println("minは " + min + " のままです");
            }
        }
        System.out.println();
        System.out.println("最後は min = " + min);
        System.out.println("<< メッセージを出力しないで最小値を求める >>");
        min = su[0];
        for (int i = 1; i < su.length; i++) {
            if (min > su[i]) {
                min = su[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("おしまい");
    }
}
