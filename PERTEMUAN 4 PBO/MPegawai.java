import java.time.LocalDate;

public class MPegawai {

    public static void main(String[] args) {

        DosenTetap dt =
                new DosenTetap(
                        "9545647548",
                        "78647324",
                        "Andi",
                        LocalDate.of(
                                1990,
                                5,
                                5),
                        LocalDate.of(
                                2015,
                                1,
                                1),
                        5000000,
                        "FSM");

        DosenTamu dtt =
                new DosenTamu(
                        "111222333",
                        "998877",
                        "Budi",
                        LocalDate.of(
                                1992,
                                3,
                                10),
                        LocalDate.of(
                                2020,
                                1,
                                1),
                        4000000,
                        "FT",
                        LocalDate.of(
                                2027,
                                12,
                                31));

        Tendik tk =
                new Tendik(
                        "888777666",
                        "Citra",
                        LocalDate.of(
                                1985,
                                8,
                                20),
                        LocalDate.of(
                                2010,
                                5,
                                1),
                        3500000,
                        "Akademik");

        System.out.println(
                "===== DOSEN TETAP =====");

        dt.printInfo();

        System.out.println();

        System.out.println(
                "===== DOSEN TAMU =====");

        dtt.printInfo();

        System.out.println();

        System.out.println(
                "===== TENDIK =====");

        tk.printInfo();
    }
}