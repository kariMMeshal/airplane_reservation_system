package airplan_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DeleteFlightForm extends javax.swing.JFrame {

    public DeleteFlightForm() {
        initComponents();
        setLocationRelativeTo(null);
        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        flightIdText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        flightIdField = new javax.swing.JTextField();
        deleteFlightButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        flightIdText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        flightIdText.setText("Flight ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Delete Flight");

        flightIdField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        deleteFlightButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        deleteFlightButton.setText("Delete Flight");
        deleteFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFlightButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(deleteFlightButton)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(flightIdText, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(flightIdField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(flightIdText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flightIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(deleteFlightButton)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFlightButtonActionPerformed
        deleteFlight();
    }//GEN-LAST:event_deleteFlightButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteFlightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteFlightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteFlightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteFlightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteFlightForm().setVisible(true);
            }
        });
    }

////--Functions--///////////////////////////////
    public void deleteFlight() {

        String url = "jdbc:sqlserver://localhost:1433;databaseName=airplane_ticket_management;integratedSecurity=true;";

        String checkQuery = "SELECT booking_count FROM flights WHERE flight_id = ?";
        String deleteQuery = "DELETE FROM flights WHERE flight_id = ?";

        try (Connection con = DriverManager.getConnection(url); PreparedStatement pstmtCheck = con.prepareStatement(checkQuery); PreparedStatement pstmtDelete = con.prepareStatement(deleteQuery)) {

            String flightId = flightIdField.getText();
            pstmtCheck.setString(1, flightId);
            ResultSet rs = pstmtCheck.executeQuery();

            if (rs.next()) {
                int bookingCount = rs.getInt("booking_count");

                if (bookingCount > 0) {
                    JOptionPane.showMessageDialog(this, "Cannot delete this flight. There are bookings associated with it.");
                    return;
                } else {
                    pstmtDelete.setString(1, flightId);
                    int rowsDeleted = pstmtDelete.executeUpdate();

                    if (rowsDeleted > 0) {
                        JOptionPane.showMessageDialog(this, "Flight with ID: " + flightId + " has been deleted successfully.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Flight could not be deleted ");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Flight with ID: " + flightId + " does not exist.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error deleting flight: " + ex.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteFlightButton;
    private javax.swing.JTextField flightIdField;
    private javax.swing.JLabel flightIdText;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
