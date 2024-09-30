/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.partpoe1;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Partpoe1 {

    public static void main(String[] args) {
          //input password
        String password = JOptionPane.showInputDialog("Enter password");
        //check password validity
        if (password.contains("@") && password.length()>=8){
             JOptionPane.showMessageDialog(null, "password successfully captured");
             
           //input username
        String username = JOptionPane.showInputDialog("Enter username");
        //check username validity
        if (username.contains("@") && username.length()<=5){
             JOptionPane.showMessageDialog(null, "username successfully captured");
              //input first and last name
        String firstName = JOptionPane.showInputDialog("Enter first name");
        String lastName = JOptionPane.showInputDialog("Enter last name");
        
        //Display captured details
        JOptionPane.showMessageDialog(null,
         "Username: " + username + "\n" +
        "Password: " + password + "\n" +
        "First Name: " + firstName + "\n" +
        "Last Name: " + lastName      
      );
        //invalid username
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username. It must have 5 characters and include a special character.");
        } 
        //invalid password
        }else{
            JOptionPane.showMessageDialog(null, "Invalid password. It must contain at least 8 characters, including a capital letter and a special character.");
        }
    }
}
