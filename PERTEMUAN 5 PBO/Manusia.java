public abstract class Manusia {

    protected String nama;

    protected int tahunMulaiKerja;

    protected String alamat;

    protected double pendapatan;

    protected static int counterMns = 0;

    // Konstruktor
    public Manusia(String nama,
                   int tahunMulaiKerja,
                   String alamat,
                   double pendapatan) {

        this.nama = nama;

        this.tahunMulaiKerja =
                tahunMulaiKerja;

        this.alamat = alamat;

        this.pendapatan = pendapatan;

        counterMns++;
    }

    // Setter alamat
    public void setAlamat(String alamat) {

        this.alamat = alamat;
    }

    // Counter
    public static int getCounterMns() {

        return counterMns;
    }

    // Abstract method
    public abstract int hitungMasaKerja();

    // Cetak info
    public void cetakInfo() {

        System.out.println(
                "Nama : " + nama);

        System.out.println(
                "Tahun Mulai Kerja : "
                        + tahunMulaiKerja);

        System.out.println(
                "Alamat : " + alamat);

        System.out.println(
                "Pendapatan : "
                        + pendapatan);
    }
}