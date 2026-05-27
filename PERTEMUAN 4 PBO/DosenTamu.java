import java.time.LocalDate;

public class DosenTamu
        extends Pegawai {

    private String nidk;

    private String fakultas;

    private LocalDate akhirKontrak;

    // Konstruktor
    public DosenTamu(String nip,
                     String nidk,
                     String nama,
                     LocalDate tanggalLahir,
                     LocalDate tmt,
                     double gajiPokok,
                     String fakultas,
                     LocalDate akhirKontrak) {

        super(
                nip,
                nama,
                tanggalLahir,
                tmt,
                gajiPokok);

        this.nidk = nidk;

        this.fakultas = fakultas;

        this.akhirKontrak =
                akhirKontrak;
    }

    // Tunjangan
    public double hitungTunjangan() {

        return 0.025 * gajiPokok;
    }

    // Override print
    @Override
    public void printInfo() {

        super.printInfo();

        System.out.println(
                "NIDK : " + nidk);

        System.out.println(
                "Jabatan : Dosen Tamu");

        System.out.println(
                "Fakultas : "
                        + fakultas);

        System.out.println(
                "Akhir Kontrak : "
                        + akhirKontrak);

        System.out.println(
                "Tunjangan : Rp "
                        + hitungTunjangan());
    }
}