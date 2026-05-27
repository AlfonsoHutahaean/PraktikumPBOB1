public class Titik {

    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    public Titik() {
        this(0,0);
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    public void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    public void printTitik() {
        System.out.println("(" + absis + "," + ordinat + ")");
    }

    public static int getCounterTitik() {
        return counterTitik;
    }
}