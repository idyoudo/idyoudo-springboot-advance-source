package com.idyoudo.springboot.headless;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

public class HeadlessGraphic {

    public static void main (String[] args) throws Exception {

        // 设置Headless模式
        System.setProperty("java.awt.headless", "true");

        BufferedImage bi = new BufferedImage(250, 150, BufferedImage.TYPE_INT_RGB);

        Graphics g = bi.getGraphics();

        g.drawString(new String("Headless模式图片".getBytes(), "utf-8"), 70, 70);

        ImageIO.write(bi, "jpg", System.out);
    }

}
