import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Window extends JFrame{


    public Window(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,1,10,20));

        ImageIcon image = new ImageIcon("C:\\Users\\marvi\\Desktop\\Programmieren\\Java\\A_Calculator_with _Java\\src\\taschenrechner.jpg");
        this.setIconImage(image.getImage());

        TextField textfield = new TextField("", 35);
        textfield.setFont(new Font("Noto Sans", Font.PLAIN, 18));
        this.add(textfield);

        JPanel textfeldpanel = new JPanel();

        textfeldpanel.add(textfield);

        JPanel tasten = new JPanel();
        tasten.setLayout(new GridLayout(3,4,10,10));

        //-----------------------------------------------------
        // Tasten

        // Taste "1"
        JButton button1 = new JButton("1");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                textfield.setText(textfield.getText()+1);
            }
        });

        // Taste "2"
        JButton button2 = new JButton("2");
        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+2);
            }
        });

        // Taste "3"
        JButton button3 = new JButton("3");
        button3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+3);
            }
        });

        // Taste "Del"
        JButton buttonDel = new JButton("Del");
        buttonDel.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText().substring(0, textfield.getText().length()-1));
            }
        });

        // Taste "AC"
        JButton buttonAC = new JButton("AC");
        buttonAC.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textfield.setText("");
            }
        });

        // Taste "4"
        JButton button4 = new JButton("4");
        button4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+4);
            }
        });

        // Taste "5"
        JButton button5 = new JButton("5");
        button5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+5);
            }
        });

        // Taste "6"
        JButton button6 = new JButton("6");
        button6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+6);
            }
        });

        // Taste "Multi"
        JButton buttonMulti = new JButton("*");
        buttonMulti.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"*");
            }
        });

        // Taste "Divi"
        JButton buttonDivi = new JButton(":");
        buttonDivi.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+":");
            }
        });

        // Taste "7"
        JButton button7 = new JButton("7");
        button7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+7);
            }
        });

        // Taste "8"
        JButton button8 = new JButton("8");
        button8.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+8);
            }
        });

        // Taste "9"
        JButton button9 = new JButton("9");
        button9.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+9);
            }
        });

        // Taste "Plus"
        JButton buttonPlus = new JButton("+");
        buttonPlus.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"+");
            }
        });

        // Taste "Minus"
        JButton buttonMinus = new JButton("-");
        buttonMinus.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"-");
            }
        });

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
