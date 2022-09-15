import java.util.Scanner;

public class e108jv33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("点数を入力-->");
            int ten = sc.nextInt();
            System.out.println("ten = " + ten);
            if (ten >= 60) {
                System.out.println(ten + "点は合格です");
            } else {
                System.out.println(ten + "点は不合格です");
            }
            System.out.println();
        }
        System.out.println("おしまい");
        sc.close();
    }
}
