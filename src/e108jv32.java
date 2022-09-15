public class e108jv32 {
    public static void main(String[] args) {
        int x;
        int s = 0;
        for (x = 10; x <= 30; x += 5) {
            s += x;
            System.out.println("+" + x + " s="+s);
        }
        System.out.println("-------------");
        System.out.println("合計 " + s);
        System.out.println("おしまい");
    }
}
