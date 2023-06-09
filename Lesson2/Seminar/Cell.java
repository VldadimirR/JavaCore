package Lesson2.Seminar;

import java.awt.*;

public class Cell {
    private int x, y;
    private int size;
    private Color color;

    public Cell(int x, int y, int size, Color color) {
        set(x, y);
        setSize(size);
        setColor(color);
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public void paint(Graphics2D g) {           // object rendering
        g.setColor(color);
        g.fillRect(x * size, y * size,        // upper left corner
                size, size);                  // width and height
    }
}
