/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate("Create table users(name varchar(200) , email varchar(200) , password varchar(20) , security_question varchar(500) , answer varchar(200) , address varchar(200) ,Status varchar(20))");
            st.executeUpdate("Create table Room(RoomNo varchar(10) , roomType varchar(200) , bed varchar(20) , price int , status varchar(20))");
            st.executeUpdate("Create table "
                    + "customer(id int , "
                    + "name varchar(200) , "
                    + "mobileNumber varchar(10) , "
                    + "nationality varchar(200) , "
                    + "gender varchar(50) , "
                    + "email varchar(200) , "
                    + "idProof  varchar(200) , "
                    + "address varchar(500) , "
                    + "checkIn varchar(50) , "
                    + "roomNo varchar(10) , "
                    + "bed varchar(200) ,"
                    + " roomType varchar(200) , "
                    + "pricePerDay int , "
                    + "numberOfDaysStay int , "
                    + "totalAmount varchar(200) , "
                    + "checkout varchar (20))");

            JOptionPane.showMessageDialog(null, "Table Created Successfully");

        } catch (Exception e) {
            System.out.println("Catch block of main method ");
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {
            }
        }
    }

}
