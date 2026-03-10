/*
 * Nama File    : MTitik.java
 * Deskripsi    : Main class untuk menguji class Titik
 * Pembuat      : Alfonso Michael Normando Hutahaean
 * Tanggal      : 10 Maret 2026
 */

public class MTitik {
    public static void main(String[] args) {
        
        // Membuat objek titik
        Titik t1 = new Titik();

        // Mengatur koordinat titik
        t1.setAbsis(3);
        t1.setOrdinat(4);

        // Menampilkan titik awal
        t1.printTitik();

        // Menggeser titik
        t1.geser(2, 1);

        // Menampilkan titik setelah digeser
        t1.printTitik();
    }
}