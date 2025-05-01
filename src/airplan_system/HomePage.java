package airplan_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HomePage extends javax.swing.JFrame {

    String userName;
    int userId;

    public HomePage(int userId, String userName) {
        setTitle("HOME PAGE ");
        this.userName = userName;
        this.userId = userId;
        initComponents();
        setLocationRelativeTo(null);
        this.setVisible(true);
        this.pack();
        addTableMouseListener();
        loadFlights();
        FlightsTable.getTableHeader().setReorderingAllowed(false);
        FlightsTable.getTableHeader().setResizingAllowed(false);
        FlightsTable.setRowHeight(30);
        FlightsTable.setDefaultEditor(Object.class, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        HomeTap = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TakeOffText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightsTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        viewMyTickets = new javax.swing.JButton();
        ContactUsTap = new javax.swing.JPanel();
        AboutTap = new javax.swing.JPanel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/4759005-removebg-preview.png"))); // NOI18N

        TakeOffText.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        TakeOffText.setForeground(new java.awt.Color(255, 255, 255));
        TakeOffText.setText("Ready To Take ofF!");

        FlightsTable.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        FlightsTable.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        FlightsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Source", "Destination", "Take Off", "Arrive", "Seats Available", "Price", "Date", "flight_id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FlightsTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(FlightsTable);
        FlightsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (FlightsTable.getColumnModel().getColumnCount() > 0) {
            FlightsTable.getColumnModel().getColumn(0).setResizable(false);
            FlightsTable.getColumnModel().getColumn(1).setResizable(false);
            FlightsTable.getColumnModel().getColumn(2).setResizable(false);
            FlightsTable.getColumnModel().getColumn(3).setResizable(false);
            FlightsTable.getColumnModel().getColumn(4).setResizable(false);
            FlightsTable.getColumnModel().getColumn(5).setResizable(false);
            FlightsTable.getColumnModel().getColumn(6).setResizable(false);
            FlightsTable.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Click on the flight you want to reserve your tickect");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome " + this.userName + " (ID: " + this.userId + ")");

        viewMyTickets.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        viewMyTickets.setText("View My Tickets");
        viewMyTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMyTicketsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TakeOffText, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(viewMyTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(viewMyTickets))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TakeOffText)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HomeTapLayout = new javax.swing.GroupLayout(HomeTap);
        HomeTap.setLayout(HomeTapLayout);
        HomeTapLayout.setHorizontalGroup(
            HomeTapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeTapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        HomeTapLayout.setVerticalGroup(
            HomeTapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Home", HomeTap);

        javax.swing.GroupLayout ContactUsTapLayout = new javax.swing.GroupLayout(ContactUsTap);
        ContactUsTap.setLayout(ContactUsTapLayout);
        ContactUsTapLayout.setHorizontalGroup(
            ContactUsTapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1211, Short.MAX_VALUE)
        );
        ContactUsTapLayout.setVerticalGroup(
            ContactUsTapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Contact Us", ContactUsTap);

        javax.swing.GroupLayout AboutTapLayout = new javax.swing.GroupLayout(AboutTap);
        AboutTap.setLayout(AboutTapLayout);
        AboutTapLayout.setHorizontalGroup(
            AboutTapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1211, Short.MAX_VALUE)
        );
        AboutTapLayout.setVerticalGroup(
            AboutTapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("About", AboutTap);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewMyTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMyTicketsActionPerformed
        UserTickets T = new UserTickets(userId, userName);
    }//GEN-LAST:event_viewMyTicketsActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //  new HomePage().setVisible(true);

            }
        });
    }

    private void loadFlights() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=airplane_ticket_management;integratedSecurity=true;";
        String query = "SELECT * FROM flights";

        try (Connection con = DriverManager.getConnection(url); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            // Create a table model matching the table columns
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Source");
            model.addColumn("Destination");
            model.addColumn("Take Off");
            model.addColumn("Arrive");
            model.addColumn("Seats Available");
            model.addColumn("Price");
            model.addColumn("Date");
            model.addColumn("flight_id");

            // Fill the model with data from the database
            while (rs.next()) {
                String source = rs.getString("source");
                String destination = rs.getString("destination");
                String takeOff = rs.getString("TakeOffTime").substring(0, 5);
                String arrive = rs.getString("ArrivalTime").substring(0, 5);
                int seats = rs.getInt("seats_available");
                double price = rs.getDouble("price");
                String date = rs.getString("flight_date");
                int flightId = rs.getInt("flight_id");

                model.addRow(new Object[]{source, destination, takeOff, arrive, seats, price, date, flightId});
            }

            // Apply the model to the JTable
            FlightsTable.setModel(model);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error fetching flights: " + ex.getMessage());
        }
    }

    private void addTableMouseListener() {
        FlightsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {

                if (evt.getClickCount() == 2 && FlightsTable.getSelectedRow() != -1) {
                    int row = FlightsTable.getSelectedRow();

                    String source = FlightsTable.getValueAt(row, 0).toString();
                    String destination = FlightsTable.getValueAt(row, 1).toString();
                    String price = FlightsTable.getValueAt(row, 5).toString();
                    String date = FlightsTable.getValueAt(row, 6).toString();
                    int flightId = (int) FlightsTable.getValueAt(row, 7);
                    TicketReservation T = new TicketReservation(flightId, userName, userId);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AboutTap;
    private javax.swing.JPanel ContactUsTap;
    private javax.swing.JTable FlightsTable;
    private javax.swing.JPanel HomeTap;
    private javax.swing.JLabel TakeOffText;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton viewMyTickets;
    // End of variables declaration//GEN-END:variables
}
