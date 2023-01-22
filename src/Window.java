import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{


    public Window(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4,3,10,10));

        ImageIcon ImageIcon = new ImageIcon("taschenrechner.jpg");
        this.setIconImage(new ImageIcon(ImageIcon.getImage()).getImage());

        // created the buttons
        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));

        this.pack();
        this.setVisible(true);
    }
}
