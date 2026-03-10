/*
 * Nama File    : Titik.java
 * Deskripsi    : Class Titik dengan atribut absis dan ordinat
 * Pembuat      : Alfonso Michael Normando Hutahaean
 * Tanggal      : 10 Maret 2026
 */

public class Titik {
    double absis;
    double ordinat;

    // Konstruktor
    Titik() {
        absis = 0.0;
        ordinat = 0.0;
    }

    // Mengambil nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengambil nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengeset nilai absis
    void setAbsis(double x) {
        absis = x;
    }

    // Mengeset nilai ordinat
    void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser titik
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Menampilkan koordinat titik
    void printTitik() {
        System.out.println("(" + absis + "," + ordinat + ")");
    }
}