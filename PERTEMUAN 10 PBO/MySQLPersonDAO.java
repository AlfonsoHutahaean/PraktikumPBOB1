import java.sql.*;

/**
 * File : MySQLPersonDAO.java
 * Deskripsi : implementasi PersonDAO untuk MySQL
 */

public class MySQLPersonDAO implements PersonDAO {

    public void savePerson(Person person) throws Exception {

        String name = person.getName();

        // koneksi database
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/pbo",
                "root",
                "");

        // query insert
        String query =
                "INSERT INTO person(name) VALUES('" + name + "')";

        Statement s = con.createStatement();

        s.executeUpdate(query);

        System.out.println("Data berhasil disimpan!");

        con.close();
    }
}