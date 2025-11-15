package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1,lable2,lable3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton buttion1,buttion2,buttion3;
    Login(){
        super("Bank Managment System With Atm Simulator");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        label1=new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.black);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        lable2 = new JLabel("Card No: ");
        lable2.setFont(new Font("Ralway",Font.BOLD,28));
        lable2.setForeground(Color.black);
        lable2.setBounds(150,190,375,30);
        add(lable2);

        textField2 = new JTextField(15);
        textField2.setBounds(325,190,232,30);
        textField2.setForeground(Color.BLACK);
        textField2.setFont(new Font("Arial",Font.BOLD,22));
        add(textField2);



        lable3 = new JLabel("PIN: ");
        lable3.setFont(new Font("Ralway",Font.BOLD,28));
        lable3.setForeground(Color.black);
        lable3.setBounds(150,235,375,30);
        add(lable3);


        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,235,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,28));
        passwordField3.setForeground(Color.BLACK);
        add(passwordField3);

        buttion1 = new JButton("Sign in");
        buttion1.setFont(new Font("Arial",Font.BOLD,14));
        buttion1.setForeground(Color.black);
        buttion1.setBackground(Color.red);
        buttion1.setBounds(330,300,100,30);
        buttion1.addActionListener(this );
        add(buttion1);

        buttion2 = new JButton("Clear");
        buttion2.setFont(new Font("Arial",Font.BOLD,14));
        buttion2.setForeground(Color.black);
        buttion2.setBackground(Color.red);
        buttion2.setBounds(450,300,100,30);
        buttion2.addActionListener(this );
        add(buttion2);

        buttion3 = new JButton("Sign up");
        buttion3.setFont(new Font("Arial",Font.BOLD,14));
        buttion3.setForeground(Color.black);
        buttion3.setBackground(Color.red);
        buttion3.setBounds(320,350,240,30);
        buttion3.addActionListener(this );
        add(buttion3);


        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/back1.png"));
        Image ii2 = ii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage =new JLabel(ii3);
        iimage.setBounds(0,0,850,480);
        add(iimage);


        setLayout(null);
        setSize(850,480);
        setLocation(400,200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource()==buttion1){
                con c=new con();
                String cardno= textField2.getText();
                String pin = passwordField3.getText();//data se wapas call karenge check karne ke liye //value get karne ke liye
                String q="select * from login where card_no='"+cardno+"' and pin ='"+pin+"'";
                ResultSet resultset= c.statement.executeQuery(q);
                if(resultset.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card no or PIN");
                }

            } else if (e.getSource()==buttion2){
                textField2.setText("");
                passwordField3.setText("");

            }else if (e.getSource()==buttion3){
                new Signup();
                setVisible(false);

            }
        }catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String [] args){
        new Login();

    }
}
