import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.*;
import javax.swing.JOptionPane;


public class StudentData extends JFrame implements ActionListener {

    private Container c;
    private Font f2,f;
    private JLabel studentLabel, fullNameLabel, rollLabel,phoneLabel,gpaLabel ;
    private JTextField fullNameField, rollField,phoneField,gpaField;
    private JButton addButton, updateButton,deleteButton, clearButton;

    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scrollPane;

    private String [] columns={"Full Name","Roll Number","Phone Number","GPA"};
    private String[] rows=new String[4];
    StudentData(){
        initComponent();
    }
    void initComponent(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        //this is font block
        f=new Font("Aril",Font.BOLD,16);
        f2=new Font("Aril",Font.BOLD,20);


        // this is frontend first Layer
        studentLabel=new JLabel("Student Registration");
        studentLabel.setBounds(300,10,300,50);
        studentLabel.setFont(f2);
        c.add(studentLabel);

        //this is frontend second layer
        fullNameLabel=new JLabel("Full Name");
        fullNameLabel.setBounds(30,80,100,50);
        fullNameLabel.setFont(f);
        c.add(fullNameLabel);

        fullNameField=new JTextField();
        fullNameField.setBounds(150,80,250,50);
        fullNameField.setFont(f);
        c.add(fullNameField);

        addButton=new JButton("Add");
        addButton.setBounds(500,80,100,50);
        addButton.setFont(f);
        c.add(addButton);

        //this is frontend third layer
        rollLabel=new JLabel("Roll Number");
        rollLabel.setBounds(30,150,100,50);
        rollLabel.setFont(f);
        c.add(rollLabel);

        rollField=new JTextField();
        rollField.setBounds(150,150,250,50);
        rollField.setFont(f);
        c.add(rollField);

        updateButton=new JButton("Update");
        updateButton.setBounds(500,150,100,50);
        updateButton.setFont(f);
        c.add(updateButton);

        //this is frontend fourth layer
        phoneLabel=new JLabel("Phone");
        phoneLabel.setBounds(30,220,100,50);
        phoneLabel.setFont(f);
        c.add(phoneLabel);

        phoneField=new JTextField();
        phoneField.setBounds(150,220,250,50);
        phoneField.setFont(f);
        c.add(phoneField);

        deleteButton=new JButton("Delete");
        deleteButton.setBounds(500,220,100,50);
        deleteButton.setFont(f);
        c.add(deleteButton);


        //this is frontend fifth layer
        gpaLabel=new JLabel("GPA");
        gpaLabel.setBounds(30,290,100,50);
        gpaLabel.setFont(f);
        c.add(gpaLabel);

        gpaField=new JTextField();
        gpaField.setBounds(150,290,250,50);
        gpaField.setFont(f);
        c.add(gpaField);

        clearButton=new JButton("Clear");
        clearButton.setBounds(500,290,100,50);
        clearButton.setFont(f);
        c.add(clearButton);

        //this is Table block

        table=new JTable();
        model=new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setBackground(Color.WHITE);
        table.setFont(f);
        table.setRowHeight(30);
        table.setSelectionBackground(Color.GREEN);

        scrollPane=new JScrollPane(table);
        scrollPane.setBounds(150,360,750,300);
        c.add(scrollPane);

        addButton.addActionListener(this);
        clearButton.addActionListener(this);
        updateButton.addActionListener(this);
        deleteButton.addActionListener(this);


        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int numberOfRow=table.getSelectedRow();
                String f_name=model.getValueAt(numberOfRow,0).toString();
                String r_number=model.getValueAt(numberOfRow,1).toString();
                String p_number=model.getValueAt(numberOfRow,2).toString();
                String g_point=model.getValueAt(numberOfRow,3).toString();

                fullNameField.setText(f_name);
                rollField.setText(r_number);
                phoneField.setText(p_number);
                gpaField.setText(g_point);

            }
        });




    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==addButton){
            rows[0]=fullNameField.getText();
            rows[1]=rollField.getText();
            rows[2]=phoneField.getText();
            rows[3]=gpaField.getText();
            model.addRow(rows);

        }
        else if(e.getSource()==clearButton){
            fullNameField.setText("");
            rollField.setText("");
            phoneField.setText("");
            gpaField.setText("");

        }
        else if (e.getSource()==updateButton) {
            int numberOfRows=table.getSelectedRow();
            String f_n=fullNameField.getText();
            String r_n=rollField.getText();
            String p_n=phoneField.getText();
            String g_p=gpaField.getText();

            model.setValueAt(f_n,numberOfRows,0);
            model.setValueAt(r_n,numberOfRows,1);
            model.setValueAt(p_n,numberOfRows,2);
            model.setValueAt(g_p,numberOfRows,3);

        }
        else if (e.getSource()==deleteButton) {
            int numberOFrows=table.getSelectedRow();
            if(numberOFrows>=0){
                model.removeRow(numberOFrows);
            } else {
                JOptionPane.showMessageDialog(null,"No row has been selected of no row exits");

            }

        }

    }


    public static void main(String[] args) {
        StudentDataRegistration frame =new StudentDataRegistration();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(4,4,950,800);
        frame.setTitle("Registration");
    }
}

