import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {

    private String bidang;

    // Konstruktor
    public Tendik(String nip,
                  String nama,
                  LocalDate tanggalLahir,
                  LocalDate tmt,
                  double gajiPokok,
                  String bidang) {

        super(
                nip,
                nama,
                tanggalLahir,
                tmt,
                gajiPokok);

        this.bidang = bidang;
    }

    // Hitung tunjangan
    public double hitungTunjangan() {

        Period mk =
                hitungMasaKerja();

        return 0.01
                * mk.getYears()
                * gajiPokok;
    }

    // Hitung pensiun
    public LocalDate hitungPensiun() {

        return tanggalLahir
                .plusYears(55)
                .plusMonths(1);
    }

    // Override print
    @Override
    public void printInfo() {

        super.printInfo();

        Period mk =
                hitungMasaKerja();

        System.out.println(
                "Jabatan : Tendik");

        System.out.println(
                "Bidang : "
                        + bidang);

        System.out.println(
                "Masa Kerja : "
                        + mk.getYears()
                        + " tahun "
                        + mk.getMonths()
                        + " bulan");

        System.out.println(
                "Tanggal Pensiun : "
                        + hitungPensiun());

        System.out.println(
                "Tunjangan : Rp "
                        + hitungTunjangan());
    }
}