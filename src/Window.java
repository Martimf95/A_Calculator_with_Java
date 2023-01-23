import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{


    public Window(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,1,10,20));

        ImageIcon image = new ImageIcon("C:\\Users\\marvi\\Desktop\\Programmieren\\Java\\A_Calculator_with _Java\\src\\taschenrechner.jpg");
        this.setIconImage(image.getImage());

        TextField textfield = new TextField("Zahlen", 35);
        textfield.setFont(new Font("Noto Sans", Font.PLAIN, 18));
        this.add(textfield);

        JPanel textfeldpanel = new JPanel();

        textfeldpanel.add(textfield);

        JPanel tasten = new JPanel();
        tasten.setLayout(new GridLayout(3,4,10,10));

        // created the buttons
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton buttonDel = new JButton("Del");
        JButton buttonAC = new JButton("AC");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton buttonMulti = new JButton("*");
        JButton buttonDivi = new JButton(":");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");

        tasten.add(button1);
        tasten.add(button2);
        tasten.add(button3);
        tasten.add(buttonDel);
        tasten.add(buttonAC);
        tasten.add(button4);
        tasten.add(button5);
        tasten.add(button6);
        tasten.add(buttonMulti);
        tasten.add(buttonDivi);
        tasten.add(button7);
        tasten.add(button8);
        tasten.add(button9);
        tasten.add(buttonPlus);
        tasten.add(buttonMinus);

        this.add(textfeldpanel);
        this.add(tasten);
        this.pack();
        this.setVisible(true);
    }
}
