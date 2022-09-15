package jv6;

public class e108jv63 {
    public static void main(String[] args) {
        int[] su = {33, 55, 19, 44, 17, 99, 66};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        double heikin;

        System.out.print("<配列の内容> -- ");
        for (int i = 0; i < su.length; i++) {
            System.out.print(su[i] + " -- ");
        }
        System.out.println();

        for (int i = 0; i < su.length; i++) {
            sum += su[i];
            if (max < su[i]) {
                max = su[i];
            }
            if (min > su[i]) {
                min = su[i];
            }
        }

        heikin = (double) sum / su.length;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("goukei = " + sum);
        System.out.println("heikin = " + heikin);
        System.out.println("おしまい");
    }
}
