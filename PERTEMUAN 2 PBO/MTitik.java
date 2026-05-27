public class MTitik {

    public static void main(String[] args) {

        Titik T1 = new Titik();
        Titik T2 = new Titik(3,5);

        System.out.println("Titik T1");
        T1.printTitik();

        System.out.println("Titik T2");
        T2.printTitik();

        T1.setAbsis(10);
        T1.setOrdinat(20);

        System.out.println("T1 setelah diubah");
        T1.printTitik();

        T1.geser(2,3);

        System.out.println("T1 setelah digeser");
        T1.printTitik();

        System.out.println("Jumlah objek titik : "
                + Titik.getCounterTitik());

    }
}