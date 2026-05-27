public class MataKuliah {

    private String idMatKul;
    private String nama;
    private int sks;

    // Konstruktor default
    public MataKuliah() {

        idMatKul = "";
        nama = "";
        sks = 0;
    }

    // Konstruktor parameter
    public MataKuliah(String idMatKul,
                      String nama,
                      int sks) {

        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // Getter
    public String getIdMatKul() {
        return idMatKul;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    // Setter
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}