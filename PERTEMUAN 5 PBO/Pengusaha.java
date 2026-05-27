public class Pengusaha
        extends Manusia
        implements Pajak {

    private String npwp;

    private static int counterPengusaha = 0;

    // Konstruktor
    public Pengusaha(String nama,
                     int tahunMulaiKerja,
                     String alamat,
                     double pendapatan,
                     String npwp) {

        super(
                nama,
                tahunMulaiKerja,
                alamat,
                pendapatan);

        this.npwp = npwp;

        counterPengusaha++;
    }

    // Counter
    public static int getCounterPengusaha() {

        return counterPengusaha;
    }

    // Masa kerja
    @Override
    public int hitungMasaKerja() {

        return (2026 - tahunMulaiKerja) + 3;
    }

    // Pajak
    @Override
    public double hitungPajak() {

        return 0.15 * pendapatan;
    }

    // Cetak info
    @Override
    public void cetakInfo() {

        super.cetakInfo();

        System.out.println(
                "NPWP : " + npwp);
    }
}