package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdraw extends JFrame implements ActionListener {
    String pin;                      //pin recive//
    TextField t1;
    JButton b1, b2;

    withdraw(String pin) {
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        JLabel l1 = new JLabel("ENTER THE AMOUNT TO WITHDRAW:");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(460, 180, 400, 35);
        l1.setForeground(Color.WHITE);
        image.add(l1);

        t1 = new TextField();
        t1.setBackground(new Color(65, 125, 128));
        t1.setForeground(Color.WHITE);
        t1.setBounds(460, 230, 320, 25);
        t1.setFont(new Font("Railway", Font.BOLD, 22));
        image.add(t1);

        b1 = new JButton("WITHDRAW");
        b1.setBounds(680, 362, 150, 35);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Railway", Font.BOLD, 20));
        b1.setBackground(new Color(65, 200, 128));
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(680, 410, 150, 35);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Railway", Font.BOLD, 20));
        b2.setBackground(new Color(65, 200, 128));
        b2.addActionListener(this);
        image.add(b2);


        setLayout(null);
        setSize(1550, 1000);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            try {
                String amount = t1.getText();
                Date date = new Date();
                if (t1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter the Amount");
                } else {
                    con c = new con();
                    ResultSet resultSet = c.statement.executeQuery("select * from depo where pin_no='" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposite")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficent Balance");
                        return;
                    }
                    c.statement.executeUpdate("insert into depo values('" + pin + "','" + date + "','Withdraw','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "amout Debited succesfully");
                    setVisible(false);
                    new main_Class(pin);
                }

            } catch (Exception E) {
                E.printStackTrace();
            }
    } else if (e.getSource()==b2) {
            setVisible(false);
            new main_Class(pin);

        }

    }

    public static void main(String []args){
        new withdraw("");
    }

}
