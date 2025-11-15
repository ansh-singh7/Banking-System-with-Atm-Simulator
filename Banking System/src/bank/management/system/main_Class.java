package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6;
    String pin;
    main_Class(String pin){
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel l1=new JLabel("Select Your Transection");
        l1.setFont(new Font("System",Font.BOLD,18));
        l1.setBounds(430,180,400,30);
        l1.setForeground(Color.white);
        image.add(l1);

        b1=new JButton("Deposite");
        b1.setFont(new Font("System",Font.BOLD,18));
        b1.setForeground(Color.black);
        b1.setBounds(420,272,170,30);
        b1.addActionListener(this);
        image.add(b1);


        b2=new JButton("Cash withdraw");
        b2.setFont(new Font("System",Font.BOLD,18));
        b2.setForeground(Color.black);
        b2.setBounds(680,272,170,30);
        b2.addActionListener(this);
        image.add(b2);

        b3=new JButton("MINI Statement");
        b3.setFont(new Font("System",Font.BOLD,18));
        b3.setForeground(Color.black);
        b3.setBounds(420,322,170,30);
        b3.addActionListener(this);
        image.add(b3);


        b4=new JButton("PIN Change");
        b4.setFont(new Font("System",Font.BOLD,18));
        b4.setForeground(Color.black);
        b4.setBounds(680,322,170,30);
        b4.addActionListener(this);
        image.add(b4);


        b5=new JButton("Balance");
        b5.setFont(new Font("System",Font.BOLD,18));
        b5.setForeground(Color.black);
        b5.setBounds(420,372,170,30);
        b5.addActionListener(this);
        image.add(b5);


        b6=new JButton("EXIT");
        b6.setFont(new Font("System",Font.BOLD,18));
        b6.setForeground(Color.black);
        b6.setBounds(680,372,170,30);
        b6.addActionListener(this);
        image.add(b6);



        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new Deposite(pin);
            setVisible(false);//ye sirf frame band kare ga code nahi
        } else if (e.getSource()==b6){
            System.exit(0);//ye program band kar de ga
        }else if(e.getSource()==b2){
            new withdraw(pin);
            setVisible(false);
        } else if (e.getSource()==b5) {
            setVisible(false);
            new balance_enq(pin);

        }
    }

    public static void main(String []args){
        new main_Class("");
    }
}
