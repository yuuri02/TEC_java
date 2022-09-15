package sp;

import java.util.Scanner;

public class e108spa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[64];
        for (int i = 0;i < 64;i++) {
            int tmp = sc.nextInt();
            if (tmp == -1) break;
            data[i] = tmp;
        }

        System.out.println();
        int b = 0;
        for (int i: data) {
            b += i;
            System.out.println(i);
            if (b >= 64) break;
        }

        System.out.println();
        b = 0;
        int bits = 0;
        for (int i: data) {
            b+=i;
            bits += getBit(i)-2+1+getBit(i);
            String s = "1".repeat(getBit(i) - 2) + "0" + toBinary(i);
            System.out.println(s);
            System.out.println(getBit(i));

            if (b >= 64) break;
        }
        System.out.println(bits);
    }

    public static String toBinary(int n) {
        return Integer.toBinaryString(n);
    }
    public static int getBit(int n) {
        for (int i = 2; i < 8; i++) {
            if (n < Math.pow(2, i)) return i;
        }
        return -1;
    }
}
