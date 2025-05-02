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

    public HomePage(int userId, String userName, String role) {
        setTitle("HOME PAGE ");
        this.userName = userName;
        this.userId = userId;
        initComponents();
        if (role.equals("user")) {
            addFlightButton.setVisible(false);
            deleteButton.setVisible(false);
        }
        setLocationRelativeTo(null);
        this.setVisible(true);
        this.pack();
        addTableMouseListener();
        loadFlights();
        FlightsTable.getTableHeader().setReorderingAllowed(false);
        FlightsTable.setRowHeight(30);
        FlightsTable.setDefaultEditor(Object.class, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        HomeTabbedPane = new javax.swing.JTabbedPane();
        HomeTap = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TakeOffText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightsTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        viewMyTickets = new javax.swing.JButton();
        addFlightButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        refreshFlightsButton = new javax.swing.JButton();
        ContactUsTap = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AboutTap = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 700));
        setResizable(false);

        HomeTabbedPane.setPreferredSize(new java.awt.Dimension(1300, 700));

        HomeTap.setPreferredSize(new java.awt.Dimension(1300, 700));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/HomePage-plane.png"))); // NOI18N

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

        addFlightButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addFlightButton.setText("Add New Flight");
        addFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteButton.setText("Delete Existing Flight");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        refreshFlightsButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        refreshFlightsButton.setText("Refresh Flights");
        refreshFlightsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshFlightsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TakeOffText, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(viewMyTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(refreshFlightsButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addFlightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(deleteButton)))
                        .addGap(21, 21, 21))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TakeOffText))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addFlightButton)
                            .addComponent(refreshFlightsButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton)
                .addContainerGap(79, Short.MAX_VALUE))
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

        HomeTabbedPane.addTab("Home", HomeTap);

        ContactUsTap.setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact Us");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedinW.png"))); // NOI18N
        jLabel7.setText(" Ebrahim Yousry");

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedinW.png"))); // NOI18N
        jLabel8.setText(" Ashraf Fouad");

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedinW.png"))); // NOI18N
        jLabel9.setText(" Alaa Yakoot");

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedinW.png"))); // NOI18N
        jLabel10.setText("  Kareem Hamdy");

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedinW.png"))); // NOI18N
        jLabel11.setText(" Abdelrahman Safwat");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/contact-us.jpg"))); // NOI18N

        javax.swing.GroupLayout ContactUsTapLayout = new javax.swing.GroupLayout(ContactUsTap);
        ContactUsTap.setLayout(ContactUsTapLayout);
        ContactUsTapLayout.setHorizontalGroup(
            ContactUsTapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactUsTapLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 879, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(ContactUsTapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContactUsTapLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContactUsTapLayout.createSequentialGroup()
                        .addGroup(ContactUsTapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(ContactUsTapLayout.createSequentialGroup()
                        .addGroup(ContactUsTapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        ContactUsTapLayout.setVerticalGroup(
            ContactUsTapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactUsTapLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(62, 62, 62)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HomeTabbedPane.addTab("Contact Us", ContactUsTap);

        AboutTap.setBackground(new java.awt.Color(0, 102, 102));

        jLabel19.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Alaa Yakot 22021945");

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Ashraf Fouad 2202760");

        jLabel21.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Abdelrhman Safwat 2202186");

        jLabel22.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Ebrahim Yousry 2202184");

        jLabel23.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Kareem Hamdy 2202176");

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 3, 38)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("About Us");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<html>We provide safe, reliable, and comfortable flights, ensuring excellent service for all travelers.<br> we are here to make your journey seamless.<br>Thank you for flying with us!</html> ");

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 24)); // NOI18N
        jLabel13.setText("Inspired By ENG.Mohamed Kamal  :)");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/about-us.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");

        javax.swing.GroupLayout AboutTapLayout = new javax.swing.GroupLayout(AboutTap);
        AboutTap.setLayout(AboutTapLayout);
        AboutTapLayout.setHorizontalGroup(
            AboutTapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutTapLayout.createSequentialGroup()
                .addGroup(AboutTapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AboutTapLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel24))
                    .addGroup(AboutTapLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AboutTapLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AboutTapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel22)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 869, Short.MAX_VALUE))
        );
        AboutTapLayout.setVerticalGroup(
            AboutTapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutTapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addGap(79, 79, 79)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HomeTabbedPane.addTab("About", AboutTap);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewMyTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMyTicketsActionPerformed
        UserTickets T = new UserTickets(userId, userName);
    }//GEN-LAST:event_viewMyTicketsActionPerformed

    private void addFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightButtonActionPerformed
        AddFlightForm F = new AddFlightForm();
    }//GEN-LAST:event_addFlightButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DeleteFlightForm F = new DeleteFlightForm();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void refreshFlightsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshFlightsButtonActionPerformed
        loadFlights();
    }//GEN-LAST:event_refreshFlightsButtonActionPerformed

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
            stmt.close();
            con.close();

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
    private javax.swing.JTabbedPane HomeTabbedPane;
    private javax.swing.JPanel HomeTap;
    private javax.swing.JLabel TakeOffText;
    private javax.swing.JButton addFlightButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshFlightsButton;
    private javax.swing.JButton viewMyTickets;
    // End of variables declaration//GEN-END:variables
}
