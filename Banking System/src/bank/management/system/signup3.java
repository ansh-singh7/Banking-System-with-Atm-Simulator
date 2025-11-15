package bank.management.system;

import javax.swing.*;
import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3 extends JFrame implements ActionListener {
    JButton s1,s2;
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    String formno;
    signup3(String formno){
        this.formno = formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(100,5,100,100);
        add(image);

        JLabel l1 =new JLabel("Page 3:");
        l1.setFont(new Font("Railway",Font.BOLD,22));
        l1.setBounds(230,35,100,40);
        add(l1);

        JLabel l2 =new JLabel("Account Details:");
        l2.setFont(new Font("Railway",Font.BOLD,22));
        l2.setBounds(230,65,300,40);
        add(l2);

        JLabel l3 =new JLabel("Account Details:");
        l3.setFont(new Font("Railway",Font.BOLD,18));
        l3.setBounds(100,130,300,30);
        add(l3);

        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Railway",Font.BOLD,16));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(100,170,150,30);
        add(r1);

        r2=new JRadioButton("Current Account");
        r2.setFont(new Font("Railway",Font.BOLD,16));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(100,230,150,30);
        add(r2);

        r3=new JRadioButton("Fixed Deposite");
        r3.setFont(new Font("Railway",Font.BOLD,16));
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(350,170,150,30);
        add(r3);

        r4=new JRadioButton("Children Account");
        r4.setFont(new Font("Railway",Font.BOLD,16));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(350,230,250,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 =new JLabel("Card No:");
        l4.setFont(new Font("Railway",Font.BOLD,18));
        l4.setBounds(100,290,300,30);
        add(l4);

        JLabel l5 =new JLabel("(Your 16-digit Card No:)");
        l5.setFont(new Font("Railway",Font.BOLD,12));
        l5.setBounds(100,315,300,30);
        add(l5);

        JLabel l6 =new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Railway",Font.BOLD,12));
        l6.setBounds(300,290,300,30);
        add(l6);

        JLabel l7 =new JLabel("(It would appear on atm card/cheque Book and Statement)");
        l7.setFont(new Font("Railway",Font.BOLD,12));
        l7.setBounds(300,315,500,30);
        add(l7);

        JLabel l8 =new JLabel("PIN:");
        l8.setFont(new Font("Railway",Font.BOLD,18));
        l8.setBounds(100,360,300,30);
        add(l8);

        JLabel l9 =new JLabel("XXXX");
        l9.setFont(new Font("Railway",Font.BOLD,18));
        l9.setBounds(300,360,300,30);
        add(l9);

        JLabel l10 =new JLabel("Services Required:");
        l10.setFont(new Font("Railway",Font.BOLD,18));
        l10.setBounds(100,425,300,30);
        add(l10);

        c1=new JCheckBox("ATM Card");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Railway",Font.BOLD,16));
        c1.setBounds(100,480,200,30);
        add(c1);

        c2=new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Railway",Font.BOLD,16));
        c2.setBounds(350,480,200,30);
        add(c2);

        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Railway",Font.BOLD,16));
        c3.setBounds(100,520,200,30);
        add(c3);

        c4=new JCheckBox("Email Alerts");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Railway",Font.BOLD,16));
        c4.setBounds(350,520,200,30);
        add(c4);


        c5=new JCheckBox("E-Statement");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Railway",Font.BOLD,16));
        c5.setBounds(100,560,200,30);
        add(c5);

        c6=new JCheckBox("Check book");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Railway",Font.BOLD,16));
        c6.setBounds(350,560,200,30);
        add(c6);


        JCheckBox c7 = new JCheckBox("I here by decleare that the above imformation is correct",true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Railway",Font.BOLD,16));
        c7.setBounds(100,600,500,30);
        add(c7);

        JLabel l12=new JLabel("Form no:");
        l12.setFont(new Font("Railway",Font.BOLD,14));
        l12.setBounds(680,10,150,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Railway",Font.BOLD,14));
        l13.setBounds(740,10,150,30);
        add(l13);

        s1=new JButton("Submit");
        s1.setFont(new Font("Railway",Font.BOLD,14));
        s1.setBounds(450,670,100,40);
        s1.setBackground(Color.BLACK);
        s1.setForeground(Color.white);
        s1.addActionListener(this);
        add(s1);

        s2=new JButton("Cancel");
        s2.setFont(new Font("Railway",Font.BOLD,14));
        s2.setBounds(300,670,100,40);
        s2.setBackground(Color.BLACK);
        s2.setForeground(Color.white);
        s2.addActionListener(this);
        add(s2);


        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLocation(400,20);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if(r1.isSelected()){
            atype = "Saving Account";
        } else if (r2.isSelected()) {
            atype = "Current Account";
        } else if (r3.isSelected()) {
            atype = "Fixed Deposite";
        } else if (r3.isSelected()) {
            atype = "Fixed Deposite";
        } else if (r4.isSelected()) {
            atype = "Children Account";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong()%90000000L)+1409963000000L;
        String cardno =""+ Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = ""+ Math.abs(first3);
        
        String fac = "";
        if(c1.isSelected()){
            fac +="ATM Card";
        } else if (c2.isSelected()) {
            fac +="Internet Banking";
        } else if (c3.isSelected()){
            fac += "Mobile Banking";
        } else if (c4.isSelected()){
            fac +="Email Alerts";
        } else if (c5.isSelected()){
            fac += "E-Statement";
        } else if (c6.isSelected()){
            fac +="Check book";
        }
        try{
            if(e.getSource()==s1){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                } else {
                    con c1 = new con();
                    String q1 = "insert into Signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card NUmber :"+cardno+"\n PIN: "+pin);
                    new Deposite(pin);//passing pin to deposite class//
                    setVisible(false);

                }
            } else if (e.getSource()==s2) {
                System.exit(0);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public  static void main(String [] args){
        new signup3(" ");
    }
}
