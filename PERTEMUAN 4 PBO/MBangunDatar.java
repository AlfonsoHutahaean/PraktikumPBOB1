public class MBangunDatar {

    public static void main(String[] args) {

        Persegi P1 =
                new Persegi(
                        5,
                        "Merah",
                        "Hitam");

        Lingkaran L1 =
                new Lingkaran(
                        7,
                        "Biru",
                        "Putih");

        System.out.println(
                "===== PERSEGI =====");

        P1.printInfo();

        System.out.println(
                "Luas : "
                        + P1.getLuas());

        System.out.println();

        System.out.println(
                "===== LINGKARAN =====");

        L1.printInfo();

        System.out.println(
                "Luas : "
                        + L1.getLuas());
    }
}