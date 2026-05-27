public class Lingkaran extends BangunDatar {

    private double jari;

    // Konstruktor default
    public Lingkaran() {

        setJmlSisi(1);
    }

    // Konstruktor parameter
    public Lingkaran(double jari,
                     String warna,
                     String border) {

        this.jari = jari;

        setJmlSisi(1);

        setWarna(warna);

        setBorder(border);
    }

    // Luas
    public double getLuas() {

        return Math.PI * jari * jari;
    }

    // Print info
    @Override
    public void printInfo() {

        super.printInfo();

        System.out.println(
                "Jari-jari : "
                        + jari);
    }
}