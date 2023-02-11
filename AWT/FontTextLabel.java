package AWT;
import java.awt.*;
public class FontTextLabel extends Frame{
    //Program to implement font text label using awt
    //Declare component label
    Label lb1,lb2;
    public FontTextLabel(){
        setLayout(new FlowLayout());
        //constructor label
        lb1=new Label("Text Font Label");
        lb2=new Label("Normal Text Label");

        // "super" Frame adds Label
        add(lb1);
        add(lb2);

        Font myFont=new Font("Serif",Font.BOLD,12);
        lb1.setFont(myFont);

        setTitle("AWT Elements");
        setSize(200,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        //Allocating an instance
        FontTextLabel ftl=new FontTextLabel();
    }
}