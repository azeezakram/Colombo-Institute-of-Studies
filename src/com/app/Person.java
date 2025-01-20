
package com.app;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Person extends Department{
    private String firstName;
    private String lastName;
    private String email;
    

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastname(String lastName) {
        this.lastName = lastName;
    }
  
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    } 
}


class Employee extends Person{
    
    private String epfNo;
    
    public String getEpfNo() {
        return epfNo;
    }
    
    public void setEpfNo(String epfNo) {
        this.epfNo = epfNo;
    }  
}


class SystemUser extends Person{
    private String username;
    private char[] passwordContain;
    private String password;
    private char[] confirmPasswordContain;
    private String confirmPassword;
    private String fileName;
    private final static int USERNAME_INDEX;
    private final static int PASSWORD_INDEX;
    
    
    static {
        USERNAME_INDEX = -2;
        PASSWORD_INDEX = -1;
    }
    

    public static boolean authenticate(String username, String password, String fileName) {

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split("  ");
                if (matchesCredentials(columns, username, password)) {
                    return true;
                }
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null,
                    "An error occurred!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    private static boolean matchesCredentials(String[] columns, String username, String password) {
        int usernameIndex = getUsernameIndex();
        int passwordIndex = getPasswordIndex();

        return columns.length >= Math.abs(usernameIndex) && columns.length >= Math.abs(passwordIndex)
                && columns[columns.length + usernameIndex].trim().equals(username)
                && columns[columns.length + passwordIndex].trim().equals(password);
    }
    
        
    public String getUsername() {
            return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
  
    public char[] getPasswordContain() {
        return passwordContain;
    }
    
    public void setPasswordContain(char[] passwordContain) {
        this.passwordContain = passwordContain;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public char[] getConfirmPasswordContain() {
        return confirmPasswordContain;
    }
    
    public void setConfirmPasswordContain(char[] confirmPasswordContain) {
        this.confirmPasswordContain = confirmPasswordContain;
    }
    
    public String getConfirmPassword() {
        return confirmPassword;
    }
    
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
    public static int getUsernameIndex() {
        return USERNAME_INDEX;
    }    
    
    public static int getPasswordIndex() {
        return PASSWORD_INDEX;
    }
    
}