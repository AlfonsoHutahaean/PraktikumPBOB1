package program;

import model.Mahasiswa;
import service.MysqlMahasiswaService;

import java.util.List;

public class Program {

    static MysqlMahasiswaService service =
            new MysqlMahasiswaService();

    public static void displayAll() {

        List<Mahasiswa> list =
                service.getAll();

        for (Mahasiswa m : list) {

            System.out.println(m);

        }
    }

    public static void main(String[] args) {

        System.out.println();

        System.out.println("===insert===");

        Mahasiswa mhsAdd =
                new Mahasiswa(5, "Haryo");

        service.add(mhsAdd);

        System.out.println(
                "berhasil insert: "
                        + mhsAdd);

        displayAll();

        System.out.println();

        System.out.println("===update===");

        Mahasiswa mhsUpdate =
                service.getById(5);

        System.out.println(
                "Akan diupdate data lama: "
                        + mhsUpdate);

        mhsUpdate.setNama("Dinaya");

        System.out.println(
                "dengan data baru: "
                        + mhsUpdate);

        service.update(mhsUpdate);

        displayAll();

        System.out.println();

        System.out.println("===delete===");

        System.out.println(
                "akan di delete: "
                        + service.getById(5));

        service.delete(5);

        displayAll();
    }
}