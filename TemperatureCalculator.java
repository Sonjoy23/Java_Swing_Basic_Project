package swingPac;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class TemperatureCalculator extends JFrame{
    private  String box[]={"C","F","K"};
    private JTextField field1,field2,field3,field4,field5;
    private Font f;
    private Container c;
    private JLabel label1,label2,label3,label4,label5;
    private JComboBox cbox;
    private JButton button1,button2;
    TemperatureCalculator(){
        initComponents();
    }
    void initComponents(){
        c=this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        f=new Font("Arial",Font.BOLD,16);
        label1=new JLabel("Temperature Calculator");
        label1.setBounds(100,4,200,50);
        label1.setFont(f);
        c.add(label1);

        label2=new JLabel("Enter Your Temperature:");
        label2.setBounds(4,60,200,50);
        label2.setFont(f);
        c.add(label2);

        field1=new JTextField();
        field1.setBounds(250,60,100,50);
        field1.setFont(f);
        c.add(field1);
        label2=new JLabel("Enter your Scale:");
        label2.setBounds(50,130,200,50);
        label2.setFont(f);
        c.add(label2);

        cbox=new JComboBox(box);
        cbox.setBounds(250,130,100,50);
        cbox.setFont(f);
        c.add(cbox);
        //this is Celsius block
        label3=new JLabel(" Your Celsius Temperature:");
        label3.setBounds(4,200,250,50);
        label3.setFont(f);
        c.add(label3);
        field3=new JTextField();
        field3.setBounds(4,250,250,50);
        field3.setFont(f);
        c.add(field3);
        // This is Fahrenheit Block
        label4=new JLabel(" Your Fahrenheit Temperature:");
        label4.setBounds(4,300,250,50);
        label4.setFont(f);
        c.add(label4);
        field4=new JTextField();
        field4.setBounds(4,350,250,50);
        field4.setFont(f);
        c.add(field4);
        //this is kelvin block
        label5=new JLabel(" Your kelvin Temperature:");
        label5.setBounds(4,400,250,50);
        label5.setFont(f);
        c.add(label5);
        field5=new JTextField();
        field5.setBounds(4,450,250,50);
        field5.setFont(f);
        c.add(field5);
        //this is Button block
        button1=new JButton("Clear");
        button1.setBounds(30,530,100,50);
        button1.setFont(f);
        c.add(button1);
        button2=new JButton("ok");
        button2.setBounds(150,530,100,50);
        button2.setFont(f);
        c.add(button2);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Field1String=field1.getText();
                int Fidel1Int=Integer.parseInt(Field1String);
                String combo = (String) cbox.getSelectedItem();
                //Celsius to other
                if(combo=="C"){
                    field3.setText(Field1String);
                    float Field4F1=((Fidel1Int)*9/5)+32;
                    String Field4F1String = Float.toString(Field4F1);
                    field4.setText(Field4F1String);
                    float field5K1=(Fidel1Int+273.15F);
                    String field5K1String=Float.toString(field5K1);
                    field5.setText(field5K1String);
                }

                //Fahrenheit to other
                if(combo=="F"){
                    field4.setText(Field1String);
                    float Field3F2=(Fidel1Int-32)*5/9;
                    String Field3F2String = Float.toString(Field3F2);
                    field3.setText(Field3F2String);
                    float field5K2=((Fidel1Int-32)*5/9)+273.15f;
                    String field5K2String=Float.toString(field5K2);
                    field5.setText(field5K2String);
                }
                // Kelvin To other
                else if (combo=="K") {
                    field5.setText(Field1String);
                    float Field3C3=(Fidel1Int-273.15f);
                    String Field3C3String = Float.toString(Field3C3);
                    field3.setText(Field3C3String);
                    float field5F3=((Fidel1Int-273.15f)*9/5)+32;
                    String field5K3String=Float.toString(field5F3);
                    field4.setText(field5K3String);

                }


            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText("");
                field3.setText("");
                field4.setText("");
                field5.setText("");
            }
        });







    }
    public static void main(String[] args) {
        TemperatureCalculator frame=new TemperatureCalculator();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(3,3,400,650);
        frame.setTitle("TampCal");


    }
}
