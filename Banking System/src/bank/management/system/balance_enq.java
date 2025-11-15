package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balance_enq extends JFrame implements ActionListener {
    JLabel l1,l2;
    JButton b1;
    String pin;
    balance_enq(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        l1 = new JLabel("YOUR CURRENT BALANCE IS:");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(460, 180, 400, 35);
        l1.setForeground(Color.WHITE);
        image.add(l1);


        l2 = new JLabel();
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setBounds(460, 220, 400, 35);
        l2.setForeground(Color.WHITE);
        image.add(l2);


        b1 = new JButton("BACK");
        b1.setBounds(680, 362, 150, 35);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Railway", Font.BOLD, 20));
        b1.setBackground(new Color(65, 200, 128));
        b1.addActionListener(this);
        image.add(b1);

        int balance =0;
        try {
            con c=new con();
            ResultSet resultSet=c.statement.executeQuery("Select * from depo where pin_no = '"+pin+"'");
            while (resultSet.next()){
                if(resultSet.getString("type").equals("Deposite")){
                    balance+= Integer.parseInt(resultSet.getString("amount"));
                }else{
                    balance-=Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        l2.setText(""+balance);


        setLayout(null);
        setSize(1550, 1000);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_Class(pin);

    }

    public static void main(String[] args){
        new balance_enq("");
    }
}
