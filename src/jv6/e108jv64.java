package jv6;

public class e108jv64 {
    public static void main(String[] args) {
        int[] su = {4, 6, 9, 3, 7};

        System.out.print("<配列 su の内容> -- ");
        for (int i = 0; i < su.length; i++) {
            System.out.print(su[i] + " -- ");
        }

        System.out.println("\n");
        System.out.println("<< 先頭の値を棒グラフにする");
        System.out.println(" +----5----10");
        System.out.print(su[0] + "|");
        for (int i = su[0]; i > 0; i--) {
            System.out.print("○");
        }

        System.out.println("\n");
        System.out.println("<< 2番目の値を棒グラフにする");
        System.out.println(" +----5----10");
        System.out.print(su[1] + "|");
        for (int i = su[1]; i > 0; i--) {
            System.out.print("○");
        }

        System.out.println("\n");
        System.out.println("<< 全部まとめて棒グラフにする");
        System.out.println(" +----5----10");
        for (int i = 0; i < su.length; i++) {
            System.out.print(su[i] + "|");
            for (int j = su[i]; j > 0; j--) {
                System.out.print("○");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("おしまい");
    }
}
