/*
 * Nama File : MMahasiswa.java
 * Deskripsi : Main Class Mahasiswa
 * Pembuat   : Alfonso
 */

public class MMahasiswa {

    public static void main(String[] args) {

        // Mata Kuliah
        MataKuliah PBO =
                new MataKuliah(
                        "PBO",
                        "Pemrograman Berorientasi Objek",
                        3);

        MataKuliah MBD =
                new MataKuliah(
                        "MBD",
                        "Manajemen Basis Data",
                        3);

        MataKuliah AI =
                new MataKuliah(
                        "OAK",
                        "Organisasi Arsitektur dan Komputer",
                        2);

        // Dosen
        Dosen D1 =
                new Dosen(
                        "123",
                        "Andi",
                        "Informatika");

        // Kendaraan
        Kendaraan K1 =
                new Kendaraan(
                        "H1234AB",
                        "Motor");

        // Mahasiswa
        Mahasiswa M1 =
                new Mahasiswa(
                        "24060123140156",
                        "Alfonso",
                        "Informatika");

        // Relasi objek
        M1.setDosenWali(D1);

        M1.setKendaraan(K1);

        M1.addMatKul(PBO);

        M1.addMatKul(MBD);

        M1.addMatKul(AI);

        // Output
        M1.printDetailMhs();

        System.out.println();

        System.out.println(
                "Jumlah Mata Kuliah : "
                        + M1.getJumlahMatKul());

        System.out.println(
                "Jumlah SKS : "
                        + M1.getJumlahSKS());
    }
}