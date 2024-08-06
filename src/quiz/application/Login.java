package quiz.application;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    //constructor
    public Login () {
        // adding image to frame
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("Images/Designer.png"));
        JLabel image = new JLabel(icon);
        add(image);
        setLayout(null);
        image.setBounds(0, 0, 750 , 1000);
        //adding text
        JLabel heading = new JLabel("Login");
        add(heading);
        heading.setBounds(1000 , 100, 100,100);
        // Font Font_Type Font_Size
        heading.setFont(new Font("Verdana", Font.PLAIN, 37));
        // adding color to font
        heading.setForeground(Color.WHITE);

        JLabel Roll_NO = new JLabel("Enter your Roll_NO:");
        add(Roll_NO);
        Roll_NO.setBounds(850 , 25, 500,500);
        // Font Font_Type Font_Size
        Roll_NO.setFont(new Font("Verdana", Font.PLAIN, 30));
        // adding color to font
        Roll_NO.setForeground(Color.WHITE);

        JTextField Roll_No = new JTextField();
        Roll_No.setBounds(1175, 260,75 , 30);
        Roll_No.setFont(new Font("Verdana", Font.PLAIN, 20));
        add(Roll_No);

        JLabel pinLabel = new JLabel("Enter your 6-digit PIN:");
        add(pinLabel);
        pinLabel.setBounds(850, 100, 500, 500);
        pinLabel.setFont(new Font("Verdana", Font.PLAIN, 30));
        pinLabel.setForeground(Color.WHITE);

        JPasswordField pinField = new JPasswordField();
        pinField.setBounds(1200, 338, 100, 30);
        pinField.setFont(new Font("Verdana", Font.PLAIN, 20));
        add(pinField);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(850, 400, 100, 30);
        add(submitButton);

        //setting background color to the frame
        getContentPane().setBackground(Color.decode("#395be7"));
        //sets size of the frame
        setSize(1800, 750);
        //sets location of frame on screen
        setLocation(0, 0);
        // used to create a frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
