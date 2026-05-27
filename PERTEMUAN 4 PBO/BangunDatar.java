public class BangunDatar {

    protected int jmlSisi;
    protected String warna;
    protected String border;

    public BangunDatar() {

    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {

        System.out.println("Jumlah sisi : "
                + jmlSisi);

        System.out.println("Warna : "
                + warna);

        System.out.println("Border : "
                + border);
    }
}