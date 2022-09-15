package jv8;

public class e108jv83 {
    public static void main(String[] args) {
        String hira = "りんご";
        String alpha = "ApplePIE";
        String kanji = "林檎";
        String suji = "1234";
        System.out.println(hira + " 文字数 = " + hira.length());
        System.out.println(alpha + " 文字数 = " + alpha.length());
        System.out.println(kanji + " 文字数 = " + kanji.length());
        System.out.println(suji  + " 文字数 = " + suji.length());
        System.out.println("---------------");
        System.out.println(hira + "と " + alpha + " を連結 --> ");
        System.out.println("\t"+hira + alpha + " 文字数 = " + (hira+alpha).length());
        System.out.println("---------------");
        System.out.println(alpha + " を大文字に変換" + alpha.toUpperCase());
        System.out.println(alpha + " はそのまま");
        System.out.println(alpha + " を小文字に変換" + alpha.toLowerCase());
        System.out.println(alpha + " はそのまま");
        System.out.println("---------------");
        String wk = "赤と白と黄色と緑";
        System.out.println(wk + " 文字数 = " + wk.length());
        for (int i = 0; i < wk.length(); i++) System.out.print(i);
        System.out.println(" <-- 文字位置");
        System.out.println("---------------");
        System.out.println("白は" + wk.indexOf('白') + "番目");
        System.out.println("緑は" + wk.indexOf('緑') + "番目");
        System.out.println("おしまい");
    }
}
