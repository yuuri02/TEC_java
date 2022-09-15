import java.util.ArrayList;
import java.util.Scanner;

public class e108sp62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            System.out.print("1桁の数を入力. 負で終了-->");
            int input = sc.nextInt();
            if (input < 0) {
                System.out.println("負が入力されました");
                break;
            }
            list.add(input);
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
        System.out.println();
        System.out.println(repeat("--", list.size()));
        for (int i = 0; i < list.size(); i++) {
            //未実装
        }
    }

    private static String repeat(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
