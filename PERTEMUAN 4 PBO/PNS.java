public class PNS
        extends Manusia
        implements Pajak {

    private String nip;

    private static int counterPNS = 0;

    // Konstruktor
    public PNS(String nama,
               int tahunMulaiKerja,
               String alamat,
               double pendapatan,
               String nip) {

        super(
                nama,
                tahunMulaiKerja,
                alamat,
                pendapatan);

        this.nip = nip;

        counterPNS++;
    }

    // Konstruktor tanpa alamat
    public PNS(String nama,
               int tahunMulaiKerja,
               double pendapatan,
               String nip) {

        super(
                nama,
                tahunMulaiKerja,
                "",
                pendapatan);

        this.nip = nip;

        counterPNS++;
    }

    // Counter
    public static int getCounterPNS() {

        return counterPNS;
    }

    // Masa kerja
    @Override
    public int hitungMasaKerja() {

        return (2026 - tahunMulaiKerja) + 4;
    }

    // Pajak
    @Override
    public double hitungPajak() {

        return 0.1 * pendapatan;
    }

    // Cetak info
    @Override
    public void cetakInfo() {

        super.cetakInfo();

        System.out.println(
                "NIP : " + nip);
    }
}