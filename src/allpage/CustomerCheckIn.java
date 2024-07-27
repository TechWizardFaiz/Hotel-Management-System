package allpage;


import Project.InsertUpdateDelete;
import Project.Select;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class CustomerCheckIn extends javax.swing.JFrame {

    /**
     * Creates new form CustomerCheckIn
     */
    public CustomerCheckIn() {
        initComponents();
        price_txt.setEditable(false);
        checkInDate_txt.setEditable(false);
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal = Calendar.getInstance();
        checkInDate_txt.setText(myFormat.format(cal.getTime()));
    }
    String bed;
    String roomType;
    String roomNo;
    String price;

    public void roomDetails() {
        roomNumber_combo.removeAllItems();
        price_txt.setText("");
        bed = (String) bed_combo.getSelectedItem();
        roomType = (String) roomType_combo.getSelectedItem();
        try {

            ResultSet rs = Select.getData("Select * from room where bed = '" + bed + "' AND roomType = '" + roomType + "' AND Status = 'Not Booked'");
            while (rs.next()) {
                roomNumber_combo.addItem(rs.getString(1));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        close_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mobileNumber_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        gender_combo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        idProof_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        address_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        checkInDate_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bed_combo = new javax.swing.JComboBox<>();
        roomType_combo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        price_txt = new javax.swing.JTextField();
        roomNumber_combo = new javax.swing.JComboBox<>();
        alloteRoom_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        nationality_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(320, 250));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Customer Registration & Check IN.png"))); // NOI18N
        jLabel1.setText("Customer Check In");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });
        getContentPane().add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 30, 39, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 147, -1, -1));

        name_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 182, 350, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mobile Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 234, -1, -1));

        mobileNumber_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mobileNumber_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileNumber_txtActionPerformed(evt);
            }
        });
        getContentPane().add(mobileNumber_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 269, 350, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        email_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_txtActionPerformed(evt);
            }
        });
        getContentPane().add(email_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 350, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 413, -1, -1));

        gender_combo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gender_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female", "Other" }));
        gender_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender_comboActionPerformed(evt);
            }
        });
        getContentPane().add(gender_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 448, 350, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ID Proof");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 147, -1, -1));

        idProof_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idProof_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProof_txtActionPerformed(evt);
            }
        });
        getContentPane().add(idProof_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 182, 350, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 234, -1, -1));

        address_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(address_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 269, 350, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Check IN Date (Today)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 321, -1, -1));

        checkInDate_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(checkInDate_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 356, 350, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Bed");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 147, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Room Type");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 234, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Room Number");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 321, -1, -1));

        bed_combo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bed_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Triple" }));
        bed_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bed_comboActionPerformed(evt);
            }
        });
        getContentPane().add(bed_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 182, 350, -1));

        roomType_combo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roomType_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC ", "Non-AC" }));
        roomType_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomType_comboActionPerformed(evt);
            }
        });
        getContentPane().add(roomType_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 269, 350, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Price");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 413, -1, -1));

        price_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(price_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 448, 350, -1));

        roomNumber_combo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roomNumber_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNumber_comboActionPerformed(evt);
            }
        });
        getContentPane().add(roomNumber_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 356, 350, -1));

        alloteRoom_btn.setBackground(new java.awt.Color(102, 0, 0));
        alloteRoom_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alloteRoom_btn.setForeground(new java.awt.Color(255, 255, 255));
        alloteRoom_btn.setText("Allote Room");
        alloteRoom_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alloteRoom_btnActionPerformed(evt);
            }
        });
        getContentPane().add(alloteRoom_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 510, -1, -1));

        clear_btn.setBackground(new java.awt.Color(102, 0, 0));
        clear_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        clear_btn.setText("Clear");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });
        getContentPane().add(clear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 553, 117, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Nationality");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 321, -1, -1));

        nationality_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nationality_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationality_txtActionPerformed(evt);
            }
        });
        getContentPane().add(nationality_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 356, 350, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/all pages background.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_close_btnActionPerformed

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_txtActionPerformed

    private void mobileNumber_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileNumber_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileNumber_txtActionPerformed

    private void gender_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gender_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gender_comboActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new CustomerCheckIn().setVisible(true);
    }//GEN-LAST:event_clear_btnActionPerformed

    private void bed_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bed_comboActionPerformed
        // TODO add your handling code here:
        roomDetails();
    }//GEN-LAST:event_bed_comboActionPerformed

    private void idProof_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProof_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProof_txtActionPerformed

    private void nationality_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationality_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationality_txtActionPerformed

    private void roomNumber_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNumber_comboActionPerformed
        // TODO add your handling code here:
        roomNo = (String) roomNumber_combo.getSelectedItem();
        try {
            ResultSet rs = Select.getData("Select * from room where roomNo = '" + roomNo + "'");
            while (rs.next()) {
                price_txt.setText(rs.getString(4));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_roomNumber_comboActionPerformed

    private void roomType_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomType_comboActionPerformed
        // TODO add your handling code here:
        roomDetails();
    }//GEN-LAST:event_roomType_comboActionPerformed

    private void alloteRoom_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alloteRoom_btnActionPerformed
        // TODO add your handling code here:
        int id = 1;
        String name = name_txt.getText();
        String mobileNumber = mobileNumber_txt.getText();
        String nationality = nationality_txt.getText();
        String gender = (String) gender_combo.getSelectedItem();
        String email = email_txt.getText();
        String idProof = idProof_txt.getText();
        String address = address_txt.getText();
        String checkIN = checkInDate_txt.getText();
        String bed = (String) bed_combo.getSelectedItem();
        String roomType = (String) roomType_combo.getSelectedItem();
        String roomNo = (String) roomNumber_combo.getSelectedItem();
        String price = price_txt.getText();

        if (name.equals("") || mobileNumber.equals("") || nationality.equals("") || gender.equals("") || idProof_txt.getText().trim().isEmpty() || address.equals("") || price.equals("")) {
            JOptionPane.showMessageDialog(null, "all field Are Required");
        } else {
            String Query = "Select max(id) from customer";
            try {
                ResultSet rs = Select.getData(Query);
                while (rs.next()) {
                    id = rs.getInt(1);
                    id += 1;
                }
                if (!price.equals("")) {
                    Query = "update room set status = 'Booked' where roomNo='" + roomNo + "'";
                    InsertUpdateDelete.setData(Query, "");
                    Query = "Insert into customer (id,name,mobileNumber,nationality,gender,email,idProof,address,checkIn,roomNo,bed,roomType,pricePerDay) "
                            + "values(" + id + ",'" + name + "','" + mobileNumber + "','" + nationality + "','" + gender + "','" + email + "',"
                            + "'" + idProof + "','" + address + "','" + checkIN + "','" + roomNo + "','" + bed + "','" + roomType + "','" + price + "')";
                    InsertUpdateDelete.setData(Query, "Customer Check IN Successfully");
                    new CustomerCheckIn().setVisible(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_alloteRoom_btnActionPerformed
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_txt;
    private javax.swing.JButton alloteRoom_btn;
    private javax.swing.JComboBox<String> bed_combo;
    private javax.swing.JTextField checkInDate_txt;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton close_btn;
    private javax.swing.JTextField email_txt;
    private javax.swing.JComboBox<String> gender_combo;
    private javax.swing.JTextField idProof_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mobileNumber_txt;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextField nationality_txt;
    private javax.swing.JTextField price_txt;
    private javax.swing.JComboBox<String> roomNumber_combo;
    private javax.swing.JComboBox<String> roomType_combo;
    // End of variables declaration//GEN-END:variables
}
