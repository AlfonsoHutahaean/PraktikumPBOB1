public class MManusia {

    public static void main(String[] args) {

        PNS p1 =
                new PNS(
                        "Satriyo",
                        2006,
                        "Jl. Seroja",
                        15000000,
                        "198302032006041002");

        Pengusaha pe1 =
                new Pengusaha(
                        "Adhy",
                        2000,
                        "Jl. Air",
                        55000000,
                        "000-556-773");

        Petani pt1 =
                new Petani(
                        "Nugraha",
                        1977,
                        "Jl. Bunga",
                        5000000,
                        "Wonogiri");

        PNS p2 =
                new PNS(
                        "Panji",
                        2010,
                        10000000,
                        "198004212010041002");

        p2.setAlamat(
                "Jl. Panorama");

        // Counter
        System.out.println(
                "Jumlah Manusia = "
                        + Manusia.getCounterMns());

        System.out.println(
                "Jumlah PNS = "
                        + PNS.getCounterPNS());

        System.out.println(
                "Jumlah Pengusaha = "
                        + Pengusaha.getCounterPengusaha());

        System.out.println(
                "Jumlah Petani = "
                        + Petani.getCounterPetani());

        System.out.println();

        // Pajak
        System.out.println(
                "Pajak PNS p1 = "
                        + p1.hitungPajak());

        System.out.println(
                "Pajak Pengusaha pe1 = "
                        + pe1.hitungPajak());

        System.out.println(
                "Pajak Petani pt1 = "
                        + pt1.hitungPajak());

        System.out.println();

        // Masa kerja
        System.out.println(
                "Masa Kerja p1 = "
                        + p1.hitungMasaKerja());

        System.out.println(
                "Masa Kerja pe1 = "
                        + pe1.hitungMasaKerja());

        System.out.println(
                "Masa Kerja pt1 = "
                        + pt1.hitungMasaKerja());

        System.out.println();

        // Cetak info
        p1.cetakInfo();

        System.out.println();

        pe1.cetakInfo();

        System.out.println();

        pt1.cetakInfo();
    }
}