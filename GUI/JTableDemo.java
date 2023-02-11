package GUI;
import javax.swing.*;
class JTableDemo {
    JFrame f;
    JTableDemo(){
        f=new JFrame();

        String data[][]={
                {"101","ABC","10000"},{"102","DEF","20000"},{"103","XYZ","30000"}
        };
        String column[]={"ID","NAME","SALARY"};

        JTable jt = new JTable(data,column);
        jt.setBounds(30,40,200,300);

        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);

        f.setSize(300,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JTableDemo();
    }
}
