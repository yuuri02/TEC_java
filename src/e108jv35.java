import java.util.Scanner;

public class e108jv35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("出力する数を入力-->");
            int repeat = sc.nextInt();
            System.out.println("kosu = " + repeat);
            for (int j = 0; j < repeat; j++) {
                System.out.print("○");
            }
            System.out.println();
        }
        System.out.println("おしまい");
        sc.close();
    }
}
