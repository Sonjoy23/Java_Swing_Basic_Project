
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Multiplication_Table extends JFrame {
    private Container c;
    private JLabel textLabel2, textLabel;
    private JTextArea area;
    private JButton button1;
    private JTextField field1;
    private ImageIcon img;
    Multiplication_Table(){
        initcontains();
    }
    void initcontains(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        Font f=new Font("Aril",Font.BOLD,16);
        Font f2=new Font("Aril",Font.BOLD,22);

        textLabel2=new JLabel("Calculator");
        textLabel2.setBounds(180,4,200,50);
        textLabel2.setFont(f2);
        textLabel2.setOpaque(true);
        textLabel2.setBackground(Color.PINK);
        textLabel2.setForeground(Color.BLUE);
        c.add(textLabel2);


        textLabel=new JLabel("Enter anything:");
        textLabel.setBounds(40,100,200,20);
        textLabel.setBackground(Color.PINK);
        textLabel.setOpaque(true);
        textLabel.setForeground(Color.magenta);
        textLabel.setFont(f);
        c.add(textLabel);

        field1 =new JTextField();
        field1.setBounds(180,100,100,50);
        field1.setFont(f);
        field1.setBackground(Color.YELLOW);
        c.add(field1);

        button1=new JButton("Clear");
        button1.setBounds(300,100,100,50);
        button1.setBackground(Color.ORANGE);
        button1.setOpaque(true);
        button1.setForeground(Color.RED);
        button1.setFont(f);
        c.add(button1);

        area=new JTextArea();
        area.setBounds(40,200,350,350);
        area.setBackground(Color.cyan);
        area.setFont(f);
        c.add(area);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText("");
                area.setText("");
            }
        });
        field1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value=field1.getText();
                if(value.isEmpty()){
                    JOptionPane.showMessageDialog(null,"You did not put any number");
                }
                else{
                    area.setText("");
                    int num=Integer.parseInt(field1.getText());
                    for(int i=1; i<=10; i++){
                        int result=num*i;
                        String r=String.valueOf(result);
                        String n=String.valueOf(num);
                        String j=String.valueOf(i);
                        area.append("   "+n+" * "+j+" = "+r+"\n");

                    }

                }

            }
        });


    }
    public static void main(String[] args) {
        Main frame=new Main();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(4,3,450,600);
        frame.setTitle("Class6");

    }
}
