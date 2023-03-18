package GUI;

import javax.swing.*;
import java.awt.*;

public class CanvasExample extends Canvas {
    //Program to Implement gui canvas example
    public void paint(Graphics g){
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("C:\\Users\\ullas\\Web Dev\\CSS-My Site\\images\\java.png");
        g.drawImage(i,10,10,this);
    }

    public static void main(String[] args) {
        CanvasExample m = new CanvasExample();
        JFrame f = new JFrame("Canvas Example");
        f.add(m);
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
