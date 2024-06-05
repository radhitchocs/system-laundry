
package newpackages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class koneksi {

    private Connection koneksi;

    public static void main(String[] args) {
        Connection conn = new koneksi().Connect();
    }

    public Connection Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Koneksi Driver Berhasil");
        } catch (ClassNotFoundException e) {
            System.out.println("Koneksi Driver Gagal " + e);
        }

        String url = "jdbc:mysql://localhost:3306/laundry_db";
        try {
            koneksi = DriverManager.getConnection(url, "root", "");
            System.out.println("Koneksi database berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi database gagal "+e);
        }

        return koneksi;
    }
}

    
