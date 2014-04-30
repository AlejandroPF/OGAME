package ogame;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.*;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.*;

class ImageTest {

    JTabbedPane tp;
    JLabel lab1;
    JPanel welcome, w;
    JFrame frame;
    ImageIcon image2;
    JButton b1;

    public void createUI() {
        frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        welcome = new JPanel();
        welcome.setSize(1000, 500);


        ImageIcon icon = new ImageIcon(ImageTest.class.getResource("fondo.jpg"));

        tp = new JTabbedPane();
        Container pane = frame.getContentPane();
        pane.add(tp);


        lab1 = new JLabel();
        lab1.setIcon(icon);
JLabel prueba=new JLabel("PATATATATATATATA");
welcome.add(prueba);



        welcome.add(lab1);
        tp.addTab("Welcome", welcome);

        frame.setSize(700, 700);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("Ogame");
        
    }

    

    public static void main(String[] args) {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
        }

        ImageTest w = new ImageTest();
        w.createUI();

    }
}