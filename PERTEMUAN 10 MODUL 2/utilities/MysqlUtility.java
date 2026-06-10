package utilities;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlUtility {

    private static Connection koneksi;

    public static Connection getConnection() {

        if (koneksi == null) {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");

                koneksi = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/jdbc_mhs",
                        "root",
                        ""
                );

                System.out.println("Koneksi berhasil");

            } catch (Exception e) {

                e.printStackTrace();
            }
        }

        return koneksi;
    }
}