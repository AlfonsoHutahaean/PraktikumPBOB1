public class Petani
        extends Manusia
        implements Pajak {

    private String asalKota;

    private static int counterPetani = 0;

    // Konstruktor
    public Petani(String nama,
                  int tahunMulaiKerja,
                  String alamat,
                  double pendapatan,
                  String asalKota) {

        super(
                nama,
                tahunMulaiKerja,
                alamat,
                pendapatan);

        this.asalKota = asalKota;

        counterPetani++;
    }

    // Counter
    public static int getCounterPetani() {

        return counterPetani;
    }

    // Masa kerja
    @Override
    public int hitungMasaKerja() {

        return (2026 - tahunMulaiKerja) + 2;
    }

    // Pajak
    @Override
    public double hitungPajak() {

        return 0;
    }

    // Cetak info
    @Override
    public void cetakInfo() {

        super.cetakInfo();

        System.out.println(
                "Asal Kota : "
                        + asalKota);
    }
}