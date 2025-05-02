package airplan_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddFlightForm extends javax.swing.JFrame {

    public AddFlightForm() {
        initComponents();
        setLocationRelativeTo(null);
        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addNewFlightText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FlightNumberFiled = new javax.swing.JTextField();
        SourceField = new javax.swing.JTextField();
        DestinationField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FlightDateField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        takeOffTimeField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        arrivalTimeField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        addFlightButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        availableSeatsField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 750));
        setResizable(false);

        addNewFlightText.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        addNewFlightText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addNewFlightText.setText("Add New FLight");
        addNewFlightText.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Flight Number");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Destination");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Source");

        FlightNumberFiled.setToolTipText("F345678");
        FlightNumberFiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightNumberFiledActionPerformed(evt);
            }
        });

        SourceField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SourceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SourceFieldActionPerformed(evt);
            }
        });

        DestinationField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Flight Date");

        FlightDateField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FlightDateField.setToolTipText("yyyy-MM-dd" );
        FlightDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightDateFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Take Off Time");

        takeOffTimeField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Arrival Time");

        arrivalTimeField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        arrivalTimeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrivalTimeFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Price");

        priceField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        addFlightButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        addFlightButton.setText("Add Flight");
        addFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Available Seats");

        availableSeatsField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        availableSeatsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableSeatsFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addNewFlightText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arrivalTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(FlightNumberFiled, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addComponent(SourceField)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(FlightDateField)
                                .addComponent(takeOffTimeField)
                                .addComponent(priceField)
                                .addComponent(DestinationField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addComponent(addFlightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(availableSeatsField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addNewFlightText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FlightNumberFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SourceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DestinationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FlightDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(takeOffTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arrivalTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(availableSeatsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(addFlightButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightButtonActionPerformed
        addFlightToDatabase();
        this.dispose();
    }//GEN-LAST:event_addFlightButtonActionPerformed

    private void FlightNumberFiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightNumberFiledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FlightNumberFiledActionPerformed

    private void SourceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SourceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SourceFieldActionPerformed

    private void FlightDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FlightDateFieldActionPerformed

    private void availableSeatsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableSeatsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableSeatsFieldActionPerformed

    private void arrivalTimeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrivalTimeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arrivalTimeFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AddFlightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFlightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFlightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFlightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFlightForm().setVisible(true);
            }
        });
    }

////--Functions--//////////////////////////
    private void addFlightToDatabase() {

        String url = "jdbc:sqlserver://localhost:1433;databaseName=airplane_ticket_management;integratedSecurity=true;";

        String query = "INSERT INTO flights (flight_number, source, destination, flight_date, TakeOffTime, ArrivalTime,seats_available, price) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            Connection con = DriverManager.getConnection(url);

            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, FlightNumberFiled.getText());
            stmt.setString(2, SourceField.getText());
            stmt.setString(3, DestinationField.getText());
            stmt.setString(4, FlightDateField.getText());
            stmt.setString(5, takeOffTimeField.getText());
            stmt.setString(6, arrivalTimeField.getText());
            stmt.setString(7, availableSeatsField.getText());
            stmt.setString(8, priceField.getText());

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Flight added successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add flight.");
            }

            stmt.close();
            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DestinationField;
    private javax.swing.JTextField FlightDateField;
    private javax.swing.JTextField FlightNumberFiled;
    private javax.swing.JTextField SourceField;
    private javax.swing.JButton addFlightButton;
    private javax.swing.JLabel addNewFlightText;
    private javax.swing.JTextField arrivalTimeField;
    private javax.swing.JTextField availableSeatsField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField takeOffTimeField;
    // End of variables declaration//GEN-END:variables
}
