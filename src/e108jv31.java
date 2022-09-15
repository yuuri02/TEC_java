public class e108jv31 {
    public static void main(String[] args) {
        int x;
        int s = 0;
        for (x = 2; x <= 8; x += 2) {
            s += x;
            System.out.println("+" + x + " s="+s);
        }
        System.out.println("-------------");
        System.out.println("合計 " + s);
        System.out.println("おしまい");
    }
}
