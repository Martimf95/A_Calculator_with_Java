import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Window extends JFrame{


    public Window() throws IOException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,1,10,20));

        BufferedImage img3 = ImageIO.read( new URL("https://img.icons8.com/color/480/calculator--v1.png"));

        ImageIcon image = new ImageIcon(img3);
        this.setIconImage(image.getImage());

        TextField textfield = new TextField("", 35);
        textfield.setFont(new Font("Noto Sans", Font.PLAIN, 18));
        this.add(textfield);

        JPanel textfeldpanel = new JPanel();

        textfeldpanel.add(textfield);

        JPanel tasten = new JPanel();
        tasten.setLayout(new GridLayout(4,4,10,10));

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
                if ((textfield.getText().length()>0)){
                    String einVor = textfield.getText().substring(textfield.getText().length()-1);
                    if (!(einVor.equals("+"))){
                        if (!(einVor.equals("-"))){
                            if (!(einVor.equals(","))){
                                if (!(einVor.equals(":"))){
                                    if (!(einVor.equals("*"))){
                                        textfield.setText(textfield.getText()+"*");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });

        // Taste "Divi"
        JButton buttonDivi = new JButton(":");
        buttonDivi.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if ((textfield.getText().length()>0)){
                    String einVor = textfield.getText().substring(textfield.getText().length()-1);
                    if (!(einVor.equals("+"))){
                        if (!(einVor.equals("-"))){
                            if (!(einVor.equals("*"))){
                                if (!(einVor.equals(","))){
                                    if (!(einVor.equals(":"))){
                                        textfield.setText(textfield.getText()+":");
                                    }
                                }
                            }
                        }
                    }
                }
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
                if ((textfield.getText().length()>0)){
                    String einVor = textfield.getText().substring(textfield.getText().length()-1);
                    if (!(einVor.equals(","))){
                        if (!(einVor.equals("*"))){
                            if (!(einVor.equals(":"))){
                                textfield.setText(textfield.getText()+"+");
                            }
                        }
                    }
                }
            }
        });

        // Taste "Minus"
        JButton buttonMinus = new JButton("-");
        buttonMinus.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if ((textfield.getText().length()>0)){
                    String einVor = textfield.getText().substring(textfield.getText().length()-1);
                    if (!(einVor.equals(","))) {
                        if (!(einVor.equals("*"))) {
                            if (!(einVor.equals(":"))) {
                                textfield.setText(textfield.getText() + "-");
                            }
                        }
                    }
                }
            }
        });

        // Taste "0"
        JButton button0 = new JButton("0");
        button0.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+0);
            }
        });

        // Taste "Komma"
        JButton buttonKomma = new JButton(",");
        buttonKomma.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if ((textfield.getText().length()>0)){
                    String einVor = textfield.getText().substring(textfield.getText().length()-1);
                    if (!(einVor.equals("+"))){
                        if (!(einVor.equals("-"))){
                            if (!(einVor.equals("*"))){
                                if (!(einVor.equals(":"))){
                                    textfield.setText(textfield.getText()+",");
                                    buttonKomma.setEnabled(false);
                                }
                            }
                        }
                    }
                }
            }
        });

        // Taste "Gleich"
        JButton buttonGleich = new JButton("=");
        buttonGleich.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });

        // Taste "Del"
        JButton buttonDel = new JButton("Del");
        buttonDel.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if(!(textfield.getText().length() == 0)){
                    String zuloeschen = textfield.getText().substring(textfield.getText().length()-1);
                    if (zuloeschen.equals(",")){
                        buttonKomma.setEnabled(true);
                    }
                    textfield.setText(textfield.getText().substring(0, textfield.getText().length()-1));
                }

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
        tasten.add(buttonKomma);
        tasten.add(button0);
        tasten.add(buttonGleich);

        this.add(textfeldpanel);
        this.add(tasten);
        this.pack();
        this.setVisible(true);
    }
}
