package bank.managemnet.system;

import com.toedter.calendar.JDateChooser;

import javax.print.event.PrintJobAttributeListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1, r2, m1, m2, m3;
    JButton next;

    JTextField textName, textFName, textEmail, textM, textAdd, textCity, textPin, textState;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000l) + 1000l;
    String first = " " + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO: " + first);
        label1.setBounds(130, 20, 600, 40);
        label1.setFont(new Font("Ralway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details:");
        label3.setFont(new Font("Ralway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("NAME:");
        labelName.setFont(new Font("Ralway", Font.BOLD, 20));
        labelName.setBounds(100, 150, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Ralway", Font.BOLD, 14));
        textName.setBounds(300, 150, 400, 30);
        add(textName);

        JLabel labelFName = new JLabel("Father's NAME:");
        labelFName.setFont(new Font("Ralway", Font.BOLD, 20));
        labelFName.setBounds(100, 200, 200, 30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Ralway", Font.BOLD, 14));
        textFName.setBounds(300, 200, 400, 30);
        add(textFName);

        JLabel DOB = new JLabel("DATE OF BIRTH:");
        DOB.setFont(new Font("Ralway", Font.BOLD, 20));
        DOB.setBounds(100, 300, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(26, 109, 146));
        dateChooser.setBounds(300, 300, 400, 30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender:");
        labelG.setFont(new Font("Ralway", Font.BOLD, 20));
        labelG.setBounds(100, 250, 200, 30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Ralway", Font.BOLD, 14));
        r1.setBackground(new Color(26, 109, 146));
        r1.setBounds(300, 250, 90, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Ralway", Font.BOLD, 14));
        r2.setBackground(new Color(26, 109, 146));
        r2.setBounds(450, 250, 90, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email Address:");
        labelEmail.setFont(new Font("Ralway", Font.BOLD, 20));
        labelEmail.setBounds(100, 350, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Ralway", Font.BOLD, 14));
        textEmail.setBounds(300, 350, 400, 30);
        add(textEmail);

        JLabel labelM = new JLabel("Married Status:");
        labelM.setFont(new Font("Ralway", Font.BOLD, 20));
        labelM.setBounds(100, 400, 200, 30);
        add(labelM);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Ralway", Font.BOLD, 14));
        m1.setBackground(new Color(26, 109, 146));
        m1.setBounds(300, 400, 90, 30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Ralway", Font.BOLD, 14));
        m2.setBackground(new Color(26, 109, 146));
        m2.setBounds(450, 400, 100, 30);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Ralway", Font.BOLD, 14));
        m3.setBackground(new Color(26, 109, 146));
        m3.setBounds(590, 400, 100, 30);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address:");
        labelAdd.setFont(new Font("Ralway", Font.BOLD, 20));
        labelAdd.setBounds(100, 450, 200, 30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Ralway", Font.BOLD, 14));
        textAdd.setBounds(300, 450, 400, 30);
        add(textAdd);

        JLabel labelCity = new JLabel("City:");
        labelCity.setFont(new Font("Ralway", Font.BOLD, 20));
        labelCity.setBounds(100, 500, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Ralway", Font.BOLD, 14));
        textCity.setBounds(300, 500, 400, 30);
        add(textCity);

        JLabel labelPin = new JLabel("Pincode:");
        labelPin.setFont(new Font("Ralway", Font.BOLD, 20));
        labelPin.setBounds(100, 550, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Ralway", Font.BOLD, 14));
        textPin.setBounds(300, 550, 400, 30);
        add(textPin);

        JLabel labelState = new JLabel("State:");
        labelState.setFont(new Font("Ralway", Font.BOLD, 20));
        labelState.setBounds(100, 600, 200, 30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Ralway", Font.BOLD, 14));
        textState.setBounds(300, 600, 400, 30);
        add(textState);

        next = new JButton("NEXT");
        next.setFont(new Font("Ralway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(700, 620, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(26, 109, 146));
        setLayout(null);
        setSize(840, 800);
        setLocation(360, 40);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if (m1.isSelected()) {
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";
        } else if (m3.isSelected()) {
            marital = "other";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try {
            if (textName.getText().equals("") || textFName.getText().equals("") || textAdd.getText().equals("") || textCity.getText().equals("") || textPin.getText().equals("") || textState.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the Fields");
            } else {
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
    public static void main (String[] args){
        new Signup();
    }
}
