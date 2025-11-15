package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2;
    JButton next;
    JTextField textname,textfname,textemail,textadd,textcity,textpin,textstate;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 =(ran.nextLong()%9000L)+1000L;
    String first = " "+ Math.abs(first4);
    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel lable1=new JLabel("APPLICATION FORM No."+ first);
        lable1.setBounds(160,20,600,40);
        lable1.setFont(new Font("Railways",Font.BOLD,38));
        add(lable1);

        JLabel label2 =new JLabel("Page 1");
        label2.setFont(new Font("Railway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal details");
        label3.setFont(new Font("Railway",Font.BOLD,22));
        label3.setBounds(290,100,600,30);
        add(label3);

        JLabel labelname = new JLabel("Name:");
        labelname.setFont(new Font("Railway",Font.BOLD,20));
        labelname.setBounds(100,190,100,30);
        add(labelname);

        textname = new JTextField();
        textname.setFont(new Font("Railway",Font.BOLD,14));
        textname.setBounds(300,190,300,30);
        add(textname);

        JLabel labelfname = new JLabel("Father's Name:");
        labelfname.setFont(new Font("Railway",Font.BOLD,20));
        labelfname.setBounds(100,240,150,30);
        add(labelfname);

        textfname = new JTextField();
        textfname.setFont(new Font("Railway",Font.BOLD,14));
        textfname.setBounds(300,240,300,30);
        add(textfname);

        JLabel DOB = new JLabel("Date of Birth:");
        DOB.setFont(new Font("Railway",Font.BOLD,20));
        DOB.setBounds(100,290,150,30);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,150,105));
        dateChooser.setBounds(300,290,300,30);
        add(dateChooser);

        JLabel lableg=new JLabel("Gender:");
        lableg.setBounds(100,340,200,30);
        lableg.setFont(new Font("Railways",Font.BOLD,20));
        add(lableg);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Railway",Font.BOLD,14));
        r1.setBounds(300,340,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Railway",Font.BOLD,14));
        r2.setBounds(450,340,90,30);
        add(r2);

        ButtonGroup buttonGroup= new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelemail = new JLabel("Email Address:");
        labelemail.setFont(new Font("Railway",Font.BOLD,20));
        labelemail.setBounds(100,390,200,30);
        add(labelemail);

        textemail = new JTextField();
        textemail.setFont(new Font("Railway",Font.BOLD,14));
        textemail.setBounds(300,390,300,30);
        add(textemail);

        JLabel labelems = new JLabel("Marital Status:");
        labelems.setFont(new Font("Railway",Font.BOLD,20));
        labelems.setBounds(100,440,200,30);
        add(labelems);

        m1=new JRadioButton("Married");
        m1.setBounds(300,440,100,30);
        add(m1);

        m2=new JRadioButton("Single");
        m2.setBounds(450,440,100,30);
        add(m2);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(m1);
        buttonGroup2.add(m2);


        JLabel labeleadd = new JLabel("Address:");
        labeleadd.setFont(new Font("Railway",Font.BOLD,20));
        labeleadd.setBounds(100,490,200,30);
        add(labeleadd);

        textadd = new JTextField();
        textadd.setFont(new Font("Railway",Font.BOLD,14));
        textadd.setBounds(300,490,300,30);
        add(textadd);

        JLabel labelecity = new JLabel("City:");
        labelecity.setFont(new Font("Railway",Font.BOLD,20));
        labelecity.setBounds(100,540,200,30);
        add(labelecity);

        textcity = new JTextField();
        textcity.setFont(new Font("Railway",Font.BOLD,14));
        textcity.setBounds(300,540,300,30);
        add(textcity);

        JLabel labelepin = new JLabel("Pin Code:");
        labelepin.setFont(new Font("Railway",Font.BOLD,20));
        labelepin.setBounds(100,590,200,30);
        add(labelepin);

        textpin = new JTextField();
        textpin.setFont(new Font("Railway",Font.BOLD,14));
        textpin.setBounds(300,590,300,30);
        add(textpin);

        JLabel labelestate = new JLabel("State:");
        labelestate.setFont(new Font("Railway",Font.BOLD,20));
        labelestate.setBounds(100,640,200,30);
        add(labelestate);

        textstate = new JTextField();
        textstate.setFont(new Font("Railway",Font.BOLD,14));
        textstate.setBounds(300,640,300,30);
        add(textstate);

        next = new JButton("Next");
        next.setFont(new Font("Railway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(525,690,70,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(91, 168, 50));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
//data base work//
    @Override
    public void actionPerformed(ActionEvent e) {
        String formno= first;
        String name= textname.getText();
        String fname=textfname.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="male";
        }else if (r2.isSelected()){
            gender="female";
        }
        String emale=textemail.getText();
        String marital=null;
        if(m1.isSelected()){
            marital="married";
        }else if (m2.isSelected()){
            marital="single";
        }
        String address=textadd.getText();
        String city=textcity.getText();
        String pin=textpin.getText();
        String state=textstate.getText();

        try{
            if(textname.getText().equals("")){
                JOptionPane.showMessageDialog(null, "fill all the fields");
            }else{
                con con1 = new con();
                String q = "insert into Signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+emale+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new signup2(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args){
        new Signup();
    }
}
