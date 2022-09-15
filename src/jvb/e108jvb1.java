package jvb;

import javax.swing.*;
import java.awt.*;

public class e108jvb1 {
    public static void main(String[] args) {
        new MyPanel("ドラえもん");
    }
}

class MyPanel extends JPanel {
    public MyPanel(String title) {
        super(true);
        JFrame frm = new JFrame(title);
        Container frmContentPane = frm.getContentPane();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmContentPane.add(this);
        frm.setSize(600, 500);
        frm.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Font ft = new Font("MS 明朝", Font.PLAIN, 30);
        g.setFont(ft);
        g.setColor(Color.BLUE);
        g.drawString("E108 加藤弘雅", 30, 40);
        //顔の輪郭
        g.fillOval(100, 100, 320, 280);
        //顔の中
        g.setColor(Color.WHITE);
        g.fillOval(120, 150, 280, 240);
        //目の中
        g.fillOval(180, 100, 80, 100);
        g.fillOval(260, 100, 80, 100);
        //目の縁取り
        g.setColor(Color.BLACK);
        g.drawOval(180, 100, 80, 100);
        g.drawOval(260, 100, 80, 100);
        //黒目
        g.fillOval(240, 140, 20, 20);
        g.fillOval(260, 140, 20, 20);
        //鼻の中
        g.setColor(Color.RED);
        g.fillOval(240, 180, 40, 30);
        //首輪
        g.fillOval(120, 340, 280, 50);
        //首輪ボタン
        g.setColor(Color.YELLOW);
        g.fillOval(240, 340, 40, 50);
        //鼻の縦線
        g.setColor(Color.BLACK);
        g.drawLine(260, 210, 260, 320);
        //口 左
        g.drawLine(260, 320, 200, 310);
        //口 右
        g.drawLine(260, 320, 320, 310);
        //ひげ 上右
        g.drawLine(300, 240, 390, 220);
        //ひげ 中右
        g.drawLine(300, 265, 400, 265);
        //ひげ 下右
        g.drawLine(300, 290, 390, 310);
        //ひげ 上左
        g.drawLine(220, 240, 130, 210);
        g.drawLine(220, 265, 120, 265);
        g.drawLine(220, 290, 110, 310);
    }
}