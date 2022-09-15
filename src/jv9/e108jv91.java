package jv9;

public class e108jv91 {
    public static void main(String[] args) {
        int k;
        String msg = "こんにちは";
        String msg2 = "ありがとう";
        for (k = 0; k < 6; k++) {
            System.out.println(msg);
        }
        k = 0;
        while (k < 6) {
            if (k%2 == 0) System.out.println(msg);
            else System.out.println(msg2);
            k++;
        }
        System.out.println("おしまい");
    }
}
