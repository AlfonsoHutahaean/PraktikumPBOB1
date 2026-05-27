public class Garis {

    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public double getPanjang() {

        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();

        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        return Math.sqrt(
                Math.pow(x2 - x1, 2)
              + Math.pow(y2 - y1, 2)
        );
    }

    public double getGradien() {

        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();

        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        return (y2 - y1) / (x2 - x1);
    }

    public void printGaris() {

        System.out.print("Titik Awal : ");
        titikAwal.printTitik();

        System.out.print("Titik Akhir : ");
        titikAkhir.printTitik();
    }
}