package Handlers;

import Main.LPanel;

import java.awt.*;
import java.awt.event.MouseEvent;

public class BrushHandler extends Handler {

    public BrushHandler(LPanel panel) {
        super(panel);
    }

    public void mousePressed(MouseEvent e) {
        this.xStart = e.getX();
        this.yStart = e.getY();

        this.xEnd = this.xStart;
        this.yEnd = this.yStart;
    }

    public void mouseDragged(MouseEvent e) {
        this.xStart= e.getX();
        this.yStart = e.getY();

        g = panel.getGraphics();
        g.setColor(color);
        ((Graphics2D) g).setStroke(new BasicStroke(lineWidth));
        g.drawLine(xStart, yStart, xEnd, yEnd);

        xEnd = xStart;
        yEnd = yStart;

        panel.createImage(panel);
    }
}
