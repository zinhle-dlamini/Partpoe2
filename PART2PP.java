/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part2pp;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
 import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;



public class PART2PP extends JFrame {
    private JTextField jtuser, TextField1, TextField2, TextField3, jtasknme, jtasknoo, jtaskdess, jtaskdurr, jtaskidd, jtasksttatus;
    private JPasswordField jPassword, TextField4;
    private JButton blogin, bregister, bcancel, blogin1, jButton2;
    private JTable jTable1;
    private JComboBox<String> jComboBox1;
    
    private String registeredUsername;
    private String registeredPassword;

    public PART2PP() {
        initComponents();
    }

    private void initComponents() {
        // Initialize components here...
        setTitle("Kanban Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        // Set bounds for login components
    jtuser.setBounds(100, 50, 150, 30);
    jPassword.setBounds(100, 100, 150, 30);
    blogin.setBounds(100, 150, 80, 30);
    bregister.setBounds(200, 150, 80, 30);
    bcancel.setBounds(300, 150, 80, 30);

    // Set bounds for the table
    JScrollPane jScrollPane1 = new JScrollPane(jTable1);
    jScrollPane1.setBounds(50, 200, 700, 300); // Adjust as necessary

    // Add components to the frame
    add(jtuser);
    add(jPassword);
    add(blogin);
    add(bregister);
    add(bcancel);
    add(jScrollPane1);

    // Set frame size and visibility
    setSize(800, 600);
    setLocationRelativeTo(null);
    setVisible(true);
        
        
        // Login Components
        jtuser = new JTextField(15);
        jPassword = new JPasswordField(15);
        blogin = new JButton("Login");
        bregister = new JButton("Register");
        bcancel = new JButton("Cancel");

        // Task Management Components
        jtasknme = new JTextField(15);
        jtasknoo = new JTextField(15);
        jtaskdess = new JTextField(15);
        jtaskdurr = new JTextField(15);
        jtaskidd = new JTextField(15);
        jtasksttatus = new JTextField(15);
        jComboBox1 = new JComboBox<>(new String[]{"To-do", "Doing", "Done"});
        blogin1 = new JButton("Add Task");
        jButton2 = new JButton("Cancel Task");
        
        // Table for displaying tasks
        jTable1 = new JTable(new DefaultTableModel(new Object[][]{}, new String[]{"Task Name", "Task Number", "Description", "Duration", "ID", "Status"}));
        

        // Layout settings
        // Add all components to the frame, set bounds, and action listeners...

        // Add action listeners
        blogin.addActionListener(e -> loginAction());
        bregister.addActionListener(e -> showRegistration());
        blogin1.addActionListener(e -> addTask());
        bcancel.addActionListener(e -> System.exit(0));
        jButton2.addActionListener(e -> System.exit(0));

        // Add components to the frame
        add(jtuser);
        add(jPassword);
        add(blogin);
        add(bregister);
        add(bcancel);
        add(jScrollPane1);
        // ... add other components

        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    private void loginAction() {
        String user = jtuser.getText().trim();
        String password = new String(jPassword.getPassword());
        
        if (user.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill out username and password");
        } else if (user.equals(registeredUsername) && password.equals(registeredPassword)) {
            JOptionPane.showMessageDialog(this, "LOGIN SUCCESSFUL");
            // Load task management interface
        } else {
            JOptionPane.showMessageDialog(this, "Wrong username or password!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void showRegistration() {
        JFrame registerFrame = new JFrame("Register");
        registerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        registerFrame.setLayout(new BoxLayout(registerFrame.getContentPane(), BoxLayout.Y_AXIS));

        TextField1 = new JTextField(15);
        TextField2 = new JTextField(15);
        TextField3 = new JTextField(15);
        TextField4 = new JPasswordField(15);
        JButton registerButton = new JButton("Register");
        
        registerButton.addActionListener(e -> registerAction());
        
        registerFrame.add(new JLabel("First Name:"));
        registerFrame.add(TextField1);
        registerFrame.add(new JLabel("Last Name:"));
        registerFrame.add(TextField2);
        registerFrame.add(new JLabel("Username:"));
        registerFrame.add(TextField3);
        registerFrame.add(new JLabel("Password:"));
        registerFrame.add(TextField4);
        registerFrame.add(registerButton);

        registerFrame.pack();
        registerFrame.setLocationRelativeTo(this);
        registerFrame.setVisible(true);
    }

    private void registerAction() {
        String username = TextField3.getText().trim();
        String password = new String(TextField4.getPassword());
        
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill out all fields");
        } else {
            registeredUsername = username;
            registeredPassword = password;
            JOptionPane.showMessageDialog(this, "REGISTER SUCCESSFUL");
        }
    }

    private void addTask() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
                jtasknme.getText(),
                jtasknoo.getText(),
                jtaskdess.getText(),
                jtaskdurr.getText(),
                jtaskidd.getText(),
                jComboBox1.getSelectedItem()
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PART2PP().setVisible(true));
        
      
    
}

    }


    

   

   
                                     
        // TODO add your handling code here:
        
                                           


    
