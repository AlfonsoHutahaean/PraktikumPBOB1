public class Mahasiswa {

    private String nim;
    private String nama;
    private String prodi;

    private MataKuliah[] listMatKul;

    private Dosen dosenWali;

    private Kendaraan kendaraan;

    private int jumlahMatKul;

    // Konstruktor default
    public Mahasiswa() {

        nim = "";
        nama = "";
        prodi = "";

        listMatKul = new MataKuliah[50];

        jumlahMatKul = 0;
    }

    // Konstruktor parameter
    public Mahasiswa(String nim,
                     String nama,
                     String prodi) {

        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;

        listMatKul = new MataKuliah[50];

        jumlahMatKul = 0;
    }

    // Setter dosen wali
    public void setDosenWali(Dosen dosenWali) {

        this.dosenWali = dosenWali;
    }

    // Setter kendaraan
    public void setKendaraan(Kendaraan kendaraan) {

        this.kendaraan = kendaraan;
    }

    // Tambah mata kuliah
    public void addMatKul(MataKuliah mk) {

        if (jumlahMatKul < 50) {

            listMatKul[jumlahMatKul] = mk;

            jumlahMatKul++;
        }
    }

    // Jumlah SKS
    public int getJumlahSKS() {

        int total = 0;

        for (int i = 0; i < jumlahMatKul; i++) {

            total += listMatKul[i].getSks();
        }

        return total;
    }

    // Jumlah mata kuliah
    public int getJumlahMatKul() {

        return jumlahMatKul;
    }

    // Print detail mahasiswa
    public void printDetailMhs() {

        System.out.println("===== DATA MAHASISWA =====");

        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);

        System.out.println();

        System.out.println("Dosen Wali : "
                + dosenWali.getNama());

        System.out.println();

        System.out.println("Kendaraan : "
                + kendaraan.getNoPlat()
                + " - "
                + kendaraan.getJenis());

        System.out.println();

        System.out.println("Daftar Mata Kuliah : ");

        for (int i = 0; i < jumlahMatKul; i++) {

            System.out.println(
                    listMatKul[i].getNama()
                    + " ("
                    + listMatKul[i].getSks()
                    + " SKS)");
        }
    }
}