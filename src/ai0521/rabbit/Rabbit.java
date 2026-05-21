package ai0521.rabbit;

import javax.swing.text.Position;

public class Rabbit {
    private String shape;
    private int xPos;
    private int yPos;


    public Rabbit() {
    }

    public Rabbit(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
    public class Code07_06 {
        public static void main(String[] args) {

        }
    }
}
