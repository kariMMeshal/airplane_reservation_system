package airplan_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicketReservation extends javax.swing.JFrame {

    String userName;
    int userId;
    int flightId;

    String source;
    String destination;
    String takeOffTime;
    String arriveTime;
    int seatsLeft;
    double price;
    String flightDate;
// Initializer Block ( runs even before Constructor to prevent null errors 
// if fields are accessed before constructor logic )

    {
        source = "";
        destination = "";
        takeOffTime = "";
        arriveTime = "";
        flightDate = "";
        seatsLeft = 0;
        price = 0;

    }

    public TicketReservation(int flightId, String userName, int userId) {
        setTitle("TicketReservation PAGE ");
        this.userName = userName;
        this.userId = userId;
        this.flightId = flightId;
        loadFlightDetails(flightId);
        initComponents();
        setLocationRelativeTo(null);
        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FlightDetailsText = new javax.swing.JLabel();
        sourceText = new javax.swing.JLabel();
        destinationText = new javax.swing.JLabel();
        priceText = new javax.swing.JLabel();
        seatsText = new javax.swing.JLabel();
        bookNowButton = new javax.swing.JButton();
        takeOffTimeText = new javax.swing.JLabel();
        arriveTimeText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 161, 195));
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(6, 100, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/time-to-travel.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Let's Get Your Ticket ");

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText(this.userName + " (ID: " + this.userId + ")");

        FlightDetailsText.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        FlightDetailsText.setForeground(new java.awt.Color(255, 255, 255));
        FlightDetailsText.setText("Flight Details :");

        sourceText.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        sourceText.setForeground(new java.awt.Color(255, 255, 255));
        sourceText.setText("From : "+source+"  on : "+flightDate );

        destinationText.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        destinationText.setForeground(new java.awt.Color(255, 255, 255));
        destinationText.setText("To : "+destination);

        priceText.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        priceText.setForeground(new java.awt.Color(51, 204, 0));
        priceText.setText("Price : "+price+" $" );

        seatsText.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        seatsText.setForeground(new java.awt.Color(255, 255, 255));
        seatsText.setText("Seats Left : "+seatsLeft);

        bookNowButton.setBackground(new java.awt.Color(0, 204, 204));
        bookNowButton.setFont(new java.awt.Font("Segoe UI Black", 2, 28)); // NOI18N
        bookNowButton.setText("Book Now");
        bookNowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNowButtonActionPerformed(evt);
            }
        });

        takeOffTimeText.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        takeOffTimeText.setForeground(new java.awt.Color(255, 255, 255));
        takeOffTimeText.setText(" at : "+takeOffTime);

        arriveTimeText.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        arriveTimeText.setForeground(new java.awt.Color(255, 255, 255));
        arriveTimeText.setText("  at : "+arriveTime);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(destinationText, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(priceText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(seatsText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(takeOffTimeText)
                                            .addComponent(arriveTimeText))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(sourceText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FlightDetailsText, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bookNowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(FlightDetailsText)
                .addGap(18, 18, 18)
                .addComponent(sourceText)
                .addGap(4, 4, 4)
                .addComponent(takeOffTimeText)
                .addGap(18, 18, 18)
                .addComponent(destinationText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arriveTimeText)
                .addGap(24, 24, 24)
                .addComponent(seatsText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(priceText)
                .addGap(38, 38, 38)
                .addComponent(bookNowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookNowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNowButtonActionPerformed
        bookTicket();
    }//GEN-LAST:event_bookNowButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicketReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new TicketReservation().setVisible(true);
            }
        });
    }

//////////--functions--//////////////////////
    public void loadFlightDetails(int flightId) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=airplane_ticket_management;integratedSecurity=true;";
        String query = "SELECT * FROM flights WHERE flight_id=?";

        try (Connection con = DriverManager.getConnection(url); PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setInt(1, flightId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                // ملء المتغيرات بالقيم من قاعدة البيانات
                source = rs.getString("source");
                destination = rs.getString("destination");
                takeOffTime = rs.getString("TakeOffTime").substring(0, 5);
                arriveTime = rs.getString("ArrivalTime").substring(0, 5);
                seatsLeft = rs.getInt("seats_available");
                price = rs.getDouble("price");
                flightDate = rs.getString("flight_date");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error fetching flights: " + ex.getMessage());
        }
    }

    public void bookTicket() {
        if (seatsLeft <= 0) {
            JOptionPane.showMessageDialog(this, "No seats available for this flight  :( ");
            return;
        }

        String seatNumber = "A" + (int) (Math.random() * 30 + 1);
        java.sql.Timestamp bookingDate = new java.sql.Timestamp(System.currentTimeMillis());

        // Insert the booking into the tickets table
        String url = "jdbc:sqlserver://localhost:1433;databaseName=airplane_ticket_management;integratedSecurity=true;";
        String query = "INSERT INTO tickets (flight_id, user_id, booking_date, seat_number) VALUES (?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url); PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setInt(1, flightId);
            pstmt.setInt(2, userId);
            pstmt.setTimestamp(3, bookingDate);
            pstmt.setString(4, seatNumber);

            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Flight : " + flightId + "\n" + "Seat No : " + seatNumber + "\n" + "this ticket was booked at : " + bookingDate + "\n",
                        "Ticket booked successfully!", JOptionPane.INFORMATION_MESSAGE);
                updateSeatsLeft();
                updateBookingCount();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error booking ticket: " + ex.getMessage());
        }
    }

    public void updateSeatsLeft() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=airplane_ticket_management;integratedSecurity=true;";
        String query = "UPDATE flights SET seats_available = seats_available - 1 WHERE flight_id = ?";

        try (Connection con = DriverManager.getConnection(url); PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setInt(1, flightId);
            pstmt.executeUpdate();
            seatsLeft--;
            seatsText.setText("Seats Left: " + seatsLeft);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error updating seats left: " + ex.getMessage());
        }
    }

    public void updateBookingCount() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=airplane_ticket_management;integratedSecurity=true;";
        String query = "UPDATE flights SET booking_count = booking_count + 1 WHERE flight_id = ?";

        try (Connection con = DriverManager.getConnection(url); PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setInt(1, flightId);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error updating booking count: " + ex.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FlightDetailsText;
    private javax.swing.JLabel arriveTimeText;
    private javax.swing.JButton bookNowButton;
    private javax.swing.JLabel destinationText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel priceText;
    private javax.swing.JLabel seatsText;
    private javax.swing.JLabel sourceText;
    private javax.swing.JLabel takeOffTimeText;
    // End of variables declaration//GEN-END:variables
}
