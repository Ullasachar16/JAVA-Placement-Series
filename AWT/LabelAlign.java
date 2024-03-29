package AWT;

import java.awt.*;

public class LabelAlign extends Frame {
    //Program to Implement AWT Component
    //Declare Component Label
    Label lb1,lb2,lb3,lb4;
    public LabelAlign(){
        setLayout(new FlowLayout());

        /* The Possible Alignment Values are
        Label.LEFT,Label.RIGHT,and Label.CENTER */

        lb1 = new Label("Left Label",Label.LEFT);
        lb2 = new Label("Right Label",Label.RIGHT);
        lb3 = new Label("Center Label",Label.CENTER);
        lb4 = new Label("Set Center Alignment");

        // "super" Frame adds Label
        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);

        lb4.setAlignment(Label.CENTER);

        setTitle("Label Alignment");
        setSize(150,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        //Alocating an Instance
        LabelAlign lba=new LabelAlign();
    }
}
