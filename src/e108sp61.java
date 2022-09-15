import java.util.Scanner;

public class e108sp61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int keta = sc.nextInt();
        int start = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keta; i++) {
            sb.append((start + i)%10);
        }
        int x = Integer.parseInt(sb.toString());
        int x2 = x * 2;
        System.out.println(x);
        System.out.println(x2);
    }
}
