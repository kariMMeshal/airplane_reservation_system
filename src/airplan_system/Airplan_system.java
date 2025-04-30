package airplan_system;

import java.sql.*;
import javax.swing.*;

public class Airplan_system {

    public static void main(String[] args) {

        Login l = new Login();
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setLocationRelativeTo(null);
        l.setVisible(true);
    }
}
