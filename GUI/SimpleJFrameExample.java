package GUI;
import javax.swing.JFrame;
public class SimpleJFrameExample extends JFrame {
    public SimpleJFrameExample(){
        setTitle("JFrame Example");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleJFrameExample sjf=new SimpleJFrameExample();
    }
}
