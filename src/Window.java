import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{


    public Window(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,1,10,10));

        ImageIcon image = new ImageIcon("C:\\Users\\marvi\\Desktop\\Programmieren\\Java\\A_Calculator_with _Java\\src\\taschenrechner.jpg");
        this.setIconImage(image.getImage());

        TextField textfield = new TextField("Zahlen", 35);
        this.add(textfield);

        JPanel textfeldpanel = new JPanel();

        textfeldpanel.add(textfield);

        JPanel tasten = new JPanel();
        tasten.setLayout(new GridLayout(3,3,10,10));

        // created the buttons
        tasten.add(new JButton("1"));
        tasten.add(new JButton("2"));
        tasten.add(new JButton("3"));
        tasten.add(new Button("Del"));
        tasten.add(new JButton("4"));
        tasten.add(new JButton("5"));
        tasten.add(new JButton("6"));
        tasten.add(new Button("*"));
        tasten.add(new JButton("7"));
        tasten.add(new JButton("8"));
        tasten.add(new JButton("9"));
        tasten.add(new Button("+"));


        this.add(textfeldpanel);
        this.add(tasten);
        this.pack();
        this.setVisible(true);
    }
}
