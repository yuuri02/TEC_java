import java.util.Scanner;

public class E108jv23 {
    public static void main(String[] args) {
        int sugaku, kokugo, eigo;
        Scanner sc = new Scanner(System.in);
        System.out.print("数学の点数を入力--> ");
        sugaku = sc.nextInt();
        System.out.print("国語の点数を入力--> ");
        kokugo = sc.nextInt();
        System.out.print("英語の点数を入力--> ");
        eigo = sc.nextInt();
        System.out.println("数学 = " + sugaku);
        System.out.println("国語 = " + kokugo);
        System.out.println("英語 = " + eigo);
        System.out.println("平均 = " + (sugaku + kokugo + eigo) / 3.0);
        System.out.println("おしまい");
    }
}