import java.util.Scanner;

public class e108jv34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("年齢を入力-->");
            int age = sc.nextInt();
            System.out.println("nenrei = " + age);
            if (age >= 18) {
                total += 1500;
                System.out.println(age + "歳は おとな 1500円");
            } else {
                total += 800;
                System.out.println(age + "歳は こども 800円");
            }
            System.out.println();
        }
        System.out.println("合計金額 " + total + "円");
        System.out.println("おしまい");
        sc.close();
    }
}
