package AWT;
import java.awt.*;
public class SimpleLabel extends Frame {
    //Program to Implement AWT Components
    //Declare Component Label
    Label lblCount;
    public SimpleLabel(){
        setLayout(new FlowLayout());

        //Constructor Label
        lblCount = new Label("Simple Label Example");

        //"super" Frame adds label
        add(lblCount);

        setTitle("AWT Elements");
        setSize(200,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        //Allocating an Instance
        SimpleLabel sl=new SimpleLabel();
    }
}
