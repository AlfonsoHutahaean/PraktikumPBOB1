public class Persegi extends BangunDatar {

    private double sisi;

    public Persegi() {

        setJmlSisi(4);
    }

    public Persegi(double sisi,
                   String warna,
                   String border) {

        this.sisi = sisi;

        setJmlSisi(4);

        setWarna(warna);

        setBorder(border);
    }

    public double getLuas() {

        return sisi * sisi;
    }

    @Override
    public void printInfo() {

        super.printInfo();

        System.out.println("Sisi : " + sisi);
    }
}