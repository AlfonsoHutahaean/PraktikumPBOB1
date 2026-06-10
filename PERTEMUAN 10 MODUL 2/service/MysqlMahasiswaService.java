package service;

import model.Mahasiswa;
import utilities.MysqlUtility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {

    private Connection koneksi;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    public void add(Mahasiswa mhs) {

        try {

            String sql =
                    "INSERT INTO mahasiswa(id,nama) VALUES(?,?)";

            PreparedStatement ps =
                    koneksi.prepareStatement(sql);

            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());

            ps.executeUpdate();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public void update(Mahasiswa mhs) {

        try {

            String sql =
                    "UPDATE mahasiswa SET nama=? WHERE id=?";

            PreparedStatement ps =
                    koneksi.prepareStatement(sql);

            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());

            ps.executeUpdate();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public void delete(int id) {

        try {

            String sql =
                    "DELETE FROM mahasiswa WHERE id=?";

            PreparedStatement ps =
                    koneksi.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public Mahasiswa getById(int id) {

        Mahasiswa mhs = null;

        try {

            String sql =
                    "SELECT * FROM mahasiswa WHERE id=?";

            PreparedStatement ps =
                    koneksi.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                mhs = new Mahasiswa(
                        rs.getInt("id"),
                        rs.getString("nama")
                );
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mhs;
    }

    public List<Mahasiswa> getAll() {

        List<Mahasiswa> list =
                new ArrayList<>();

        try {

            Statement st =
                    koneksi.createStatement();

            ResultSet rs =
                    st.executeQuery(
                            "SELECT * FROM mahasiswa");

            while (rs.next()) {

                list.add(
                        new Mahasiswa(
                                rs.getInt("id"),
                                rs.getString("nama")
                        )
                );
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return list;
    }
}