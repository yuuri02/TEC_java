import java.util.Scanner;

public class E108jv21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.print("半径を入力-->");
        r = sc.nextInt();
        System.out.println("r = " + r);
        double menseki = r * r * Math.PI;
        double ensyu = 2 * r * Math.PI;
        System.out.println("<半径 " + r + "の円>");
        System.out.println("面積 = " + menseki);
        System.out.println("円周 = " + ensyu);
        System.out.println("おしまい");
        sc.close();
    }
}