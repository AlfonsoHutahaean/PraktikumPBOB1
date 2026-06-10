import java.util.HashMap;
import java.util.Map;

/**
 * File : LambdaMap.java
 * Deskripsi : Menampilkan key dan value Map menggunakan lambda
 */

public class LambdaMap {

    public static void main(String[] args) {

        Map<String, String> mahasiswa =
                new HashMap<>();

        mahasiswa.put("230001", "Normando");
        mahasiswa.put("230002", "Andi");
        mahasiswa.put("230003", "Budi");
        mahasiswa.put("230004", "Citra");

        mahasiswa.forEach(
                (nim, nama) ->
                        System.out.println(
                                "NIM  : " + nim
                                        + " | Nama : " + nama
                        )
        );
    }
}