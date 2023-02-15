package GUI;

import javax.swing.*;

public class ToolTipExample extends JFrame {
    //Program to implement ToolTip Using JFrame and GUI
    public ToolTipExample(){
        initUI();
    }
    private void initUI(){
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(null);
        panel.setToolTipText("This is panel");

        JButton btn = new JButton("Button");
        btn.setBounds(100,60,100,30);
        btn.setToolTipText("This is a button");

        panel.add(btn);

        setTitle("Tooltip");
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ToolTipExample ex = new ToolTipExample();
                ex.setVisible(true);
            }
        });
    }
}
