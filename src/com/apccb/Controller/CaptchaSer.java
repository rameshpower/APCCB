package com.apccb.Controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import com.apccb.Utils.*;

@SuppressWarnings("unused")
@WebServlet("/CaptchaSer")
public class CaptchaSer extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        CaptchaInternalData capchadt = new CaptchaInternalData();
        int width = 150;
        int height = 50;
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();

        Font font = new Font("#c2c7cf", Font.BOLD, 18);
        g2d.setFont(font);

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

        GradientPaint gp = new GradientPaint(0, 0, Color.CYAN, 0, height / 2, Color.black, true);

        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);

        g2d.setColor(new Color(194, 199, 207));

        Random r = new Random();
        char data[] = capchadt.getSaltString().toCharArray();
        String captcha = String.copyValueOf(data);
        request.getSession(true).setAttribute("captcha", captcha);

        int x = 0;
        int y = 0;

        for (int i = 0; i < data.length; i++) {
            x += 10 + (Math.abs(r.nextInt()) % 15);
            y = 20 + Math.abs(r.nextInt()) % 20;
            g2d.drawChars(data, i, 1, x, y);
        }

        g2d.dispose();

        response.setContentType("image/png");

        @SuppressWarnings("static-access")
		String ss = capchadt.imgToBase64String(bufferedImage);

        response.getWriter().write(ss);
    }
}
