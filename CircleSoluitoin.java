
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleSoluitoin extends JFrame {
    private Container c;
    private Font f;
    private JLabel label1, label2,label3;
    private JTextField fild1,fild2;
    private JButton button1,button2;
    CircleSoluitoin(){
        into();
    }
    void into(){
        //this is container block
       c=this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.pink);
       //this is font block
        f=new Font("Aril",Font.BOLD,16);

        //this is font block
        label1=new JLabel("Circle Calculator");
        label1.setBounds(100,4,200,50);
        label1.setFont(f);
        c.add(label1);

        label2=new JLabel("Enter Value R");
        label2.setBounds(4,60,200,50);
        label2.setFont(f);
        c.add(label2);

        fild1=new JTextField();
        fild1.setBounds(4,110,200,50);
        fild1.setFont(f);
        c.add(fild1);

        label3=new JLabel("Result Value");
        label3.setBounds(4,160,200,50);
        label3.setFont(f);
        c.add(label3);

        fild2=new JTextField();
        fild2.setBounds(4,210,200,50);
        fild2.setFont(f);
        c.add(fild2);

        button1=new JButton("OK");
        button1.setBounds(4,285,100,50);
        button1.setFont(f);
        c.add(button1);

        button2=new JButton("CLEAR");
        button2.setBounds(110,285,100,50);
        button2.setFont(f);
        c.add(button2);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str1=fild1.getText();
                float int1=Integer.parseInt(str1);
                final float pi=3.1416f;
                float result=pi*(int1*int1);
                String restltStr=Float.toString(result);
                fild2.setText(restltStr);

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fild1.setText("");
                fild2.setText("");
            }
        });




    }
    public static void main(String[] args) {
        CircleSoluitoin frame= new CircleSoluitoin();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(4,4,400,400);
        frame.setTitle("Circle");
    }
}
