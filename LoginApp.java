package swingPac;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class LoginApp extends JFrame{
    LoginApp(){
        initcontains();
    }
    void initcontains(){
        //this is container Block
        Container c=this.getContentPane();
        c.setLayout(null);
        //this is Font Block
        Font f=new Font("Aril",Font.BOLD,16);
        Font f2=new Font("Aril",Font.BOLD,20);
        //This is Background color block
        c.setBackground(Color.PINK);
        //this is JLabel block
        JLabel lb1=new JLabel();
        lb1.setText("Enter Name:");
        lb1.setFont(f);
        lb1.setBounds(4,3,200,50);
        c.add(lb1);
        JLabel lb2=new JLabel();
        lb2.setText("Enter Password:");
        lb2.setFont(f);
        lb2.setBounds(4,90,200,50);
        c.add(lb2);
        //this is JTextField block
        JTextField tf1=new JTextField();
        tf1.setBounds(150,3,250,50);
        tf1.setFont(f);
        tf1.setBackground(Color.ORANGE);
        c.add(tf1);
        //this is password block
        JPasswordField pass1=new JPasswordField();
        pass1.setBounds(150,90,250,50);
        pass1.setBackground(Color.ORANGE);
        pass1.setFont(f);
        pass1.setEchoChar('#');
        c.add(pass1);
        //This is Button Block
        JButton submit=new JButton("Submit");
        submit.setBounds(150,200,100,50);
        submit.setFont(f);
        submit.setBackground(Color.cyan);
        c.add(submit);
        JButton clear=new JButton("Clear");
        clear.setBounds(300,200,100,50);
        clear.setFont(f);
        clear.setBackground(Color.cyan);
        c.add(clear);

        JLabel label3=new JLabel("Nama:Sonjoy and Password:1234");
        label3.setBounds(4,250,350,50);
        label3.setBackground(Color.PINK);
        label3.setFont(f);
        c.add(label3);
        //this is login block and
        //this is backand block
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                pass1.setText("");
            }
        });
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=tf1.getText();
                String password=pass1.getText();
                if(name.equals("Sonjoy") && password.equals("1234")){
                    JOptionPane.showMessageDialog(null,"Thank you");
                }else{
                    JOptionPane.showMessageDialog(null,"please enter right data");
                }

            }
        });





    }
    public static void main(String[] args) {
        LoginApp frame=new LoginApp();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(5,4,500,400);
        frame.setTitle("Login");
    }
}