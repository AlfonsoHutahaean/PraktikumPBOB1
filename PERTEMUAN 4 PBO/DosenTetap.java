import java.time.LocalDate;
import java.time.Period;

public class DosenTetap
        extends Pegawai {

    private String nidn;

    private String fakultas;

    // Konstruktor
    public DosenTetap(String nip,
                      String nidn,
                      String nama,
                      LocalDate tanggalLahir,
                      LocalDate tmt,
                      double gajiPokok,
                      String fakultas) {

        super(
                nip,
                nama,
                tanggalLahir,
                tmt,
                gajiPokok);

        this.nidn = nidn;
        this.fakultas = fakultas;
    }

    // Tunjangan
    public double hitungTunjangan() {

        Period masaKerja =
                hitungMasaKerja();

        return 0.02
                * masaKerja.getYears()
                * gajiPokok;
    }

    // Tanggal pensiun
    public LocalDate hitungPensiun() {

        return tanggalLahir
                .plusYears(65)
                .plusMonths(1);
    }

    // Override print
    @Override
    public void printInfo() {

        super.printInfo();

        Period mk =
                hitungMasaKerja();

        System.out.println(
                "NIDN : " + nidn);

        System.out.println(
                "Jabatan : Dosen Tetap");

        System.out.println(
                "Fakultas : "
                        + fakultas);

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