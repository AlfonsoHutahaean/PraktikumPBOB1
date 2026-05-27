public class Kendaraan {

    private String noPlat;
    private String jenis;

    // Konstruktor default
    public Kendaraan() {

        noPlat = "";
        jenis = "";
    }

    // Konstruktor parameter
    public Kendaraan(String noPlat,
                     String jenis) {

        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Getter
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    // Setter
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}