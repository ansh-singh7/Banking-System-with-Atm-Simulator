package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textpan,textpan2;
    JRadioButton r1,r2,w1,w2;
    JButton next;
    String formno;
    signup2(String formno){
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(100,5,100,100);
        add(image);


        this.formno = formno;

        JLabel l1 = new JLabel("page 2:");
        l1.setFont(new Font("Railway",Font.BOLD,22));
        l1.setBounds(250,30,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional Details:");
        l2.setFont(new Font("Railway",Font.BOLD,22));
        l2.setBounds(250,60,600,40);
        add(l2);

        JLabel l3=new JLabel("Religion:");
        l3.setFont(new Font("Railway",Font.BOLD,18));
        l3.setBounds(110,125,600,30);
        add(l3);

        String religion[]={"Hindu","Muslim","Other"};
        comboBox=new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Railway",Font.BOLD,14));
        comboBox.setBounds(300,125,320,30);
        add(comboBox);

        JLabel l4=new JLabel("Category:");
        l4.setFont(new Font("Railway",Font.BOLD,18));
        l4.setBounds(110,180,600,30);
        add(l4);

        String catogery[]={"GENERAL","OBC","SC","ST"};
        comboBox2=new JComboBox(catogery);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Railway",Font.BOLD,14));
        comboBox2.setBounds(300,180,320,30);
        add(comboBox2);

        JLabel l5=new JLabel("Income:");
        l5.setFont(new Font("Railway",Font.BOLD,18));
        l5.setBounds(110,230,600,30);
        add(l5);

        String income[]={"NULL","<1,50,000","<3,00,00","UPTO 10,00,000"};
        comboBox3=new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Railway",Font.BOLD,14));
        comboBox3.setBounds(300,230,320,30);
        add(comboBox3);

        JLabel l6=new JLabel("Education:");
        l6.setFont(new Font("Railway",Font.BOLD,18));
        l6.setBounds(110,280,600,30);
        add(l6);

        String education[]={"Non Graduate","Graduate","Post Graudate","Other"};
        comboBox4=new JComboBox(education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Railway",Font.BOLD,14));
        comboBox4.setBounds(300,280,320,30);
        add(comboBox4);

        JLabel l7=new JLabel("Occupation:");
        l7.setFont(new Font("Railway",Font.BOLD,18));
        l7.setBounds(110,330,600,30);
        add(l7);

        String occupation[]={"Unemployed","Self Employ","Business","Student"};
        comboBox5=new JComboBox(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Railway",Font.BOLD,14));
        comboBox5.setBounds(300,330,320,30);
        add(comboBox5);

        JLabel l8=new JLabel("PAN Number:");
        l8.setFont(new Font("Railway",Font.BOLD,18));
        l8.setBounds(110,390,600,30);
        add(l8);

        textpan=new JTextField();
        textpan.setBounds(300,390,150,30);
        textpan.setFont(new Font("Railway",Font.BOLD,18));
        add(textpan);

        JLabel l9=new JLabel("Adhar Number:");
        l9.setFont(new Font("Railway",Font.BOLD,18));
        l9.setBounds(110,440,600,30);
        add(l9);

        textpan2=new JTextField();
        textpan2.setBounds(300,440,150,30);
        textpan2.setFont(new Font("Railway",Font.BOLD,18));
        add(textpan2);

        JLabel l10=new JLabel("Senior Citizen:");
        l10.setFont(new Font("Railway",Font.BOLD,18));
        l10.setBounds(110,490,600,30);
        add(l10);

        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Railway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(300,490,100,30);
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("Railway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(450,490,100,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11=new JLabel("Existing Account:");
        l11.setFont(new Font("Railway",Font.BOLD,18));
        l11.setBounds(110,540,600,30);
        add(l11);

        w1=new JRadioButton("Yes");
        w1.setFont(new Font("Railway",Font.BOLD,14));
        w1.setBackground(new Color(252,208,76));
        w1.setBounds(300,540,100,30);
        add(w1);

        w2=new JRadioButton("No");
        w2.setFont(new Font("Railway",Font.BOLD,14));
        w2.setBackground(new Color(252,208,76));
        w2.setBounds(450,540,100,30);
        add(w2);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(w1);
        buttonGroup2.add(w2);

        next =new JButton("Next");
        next.setFont(new Font("Railway",Font.BOLD,20));
        next.setBounds(450,600,100,40);
        next.setForeground(Color.white);
        next.setBackground(Color.black);
        next.addActionListener(this);
        add(next);

        JLabel l12=new JLabel("Form no:");
        l12.setFont(new Font("Railway",Font.BOLD,18));
        l12.setBounds(680,10,150,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Railway",Font.BOLD,14));
        l13.setBounds(770,10,150,30);
        add(l13);





        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc= (String) comboBox3.getSelectedItem();
        String edu= (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan= textpan.getText();
        String addhar = textpan2.getText();

        String scitizen = " ";
        if(r1.isSelected()){
            scitizen = "yes";
        }else if(r2.isSelected()){
            scitizen = "No";
        }

        String eaccount = " ";
        if(r1.isSelected()){
            eaccount = "yes";
        }else if(r2.isSelected()){
            eaccount = "No";
        }
        try{
            if(textpan.getText().equals("")||textpan2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the options");
            }else{
                con c1=new con();
                String q = "insert into Signup2 values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eaccount+"')";
                c1.statement.executeUpdate(q);
                new signup3(formno);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();

        }



    }

    public static void main(String []args){
        new signup2("");
    }
}
