package jv5;

public class e108jv53 {
    public static void main(String[] args) {
        int[] a = new int[] {44, 22, 66, 88, 33};
        System.out.println("配列 a の0番目(先頭)は" + a[0]);
        System.out.println("配列 a の1番目は" + a[1]);
        System.out.println("配列 a の2番目は" + a[2]);
        System.out.println("配列 a の大きさは 5だから 最後は 4番目");

        System.out.print("<配列 a の内容> --");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " -- ");
        }
        System.out.print("\n<配列 a 逆順> -- ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " -- ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("<配列 a の合計> " + sum);
        double ave = (double) sum / a.length;
        System.out.println("<配列 a の平均> " + ave);
        System.out.println();
        System.out.println("<配列 a をデクリメント>");
        System.out.print("<配列 a の内容> -- ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(--a[i] + " -- ");
        }
        System.out.println();
        System.out.println("おしまい");
    }
}
