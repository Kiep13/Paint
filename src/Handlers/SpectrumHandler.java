package Handlers;

import Main.LPanel;

import java.awt.event.MouseEvent;

public class SpectrumHandler extends Handler {

    public SpectrumHandler(LPanel panel) {
        super(panel);
    }

    public void mousePressed(MouseEvent e) {
        xStart = e.getX();
        yStart = e.getY();
    }

    public void mouseDragged(MouseEvent e) {
        xEnd = e.getX();
        yEnd = e.getY();

        g = panel.getGraphics();
        g.setColor(color);
        g.drawLine(xStart, yStart, xEnd, yEnd);
    }

}
