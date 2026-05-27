public class MGaris {

    public static void main(String[] args) {

        Titik A = new Titik(0,0);
        Titik B = new Titik(4,4);

        Garis G1 = new Garis(A,B);

        G1.printGaris();

        System.out.println("Panjang Garis : "
                + G1.getPanjang());

        System.out.println("Gradien : "
                + G1.getGradien());
    }
}