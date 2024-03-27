package Evaluasi.Mahasiswa;

/**
 * @author stambuk : 13020220007
 * Nama : ACHMAD ZULFIKAR
 * MATERI : MODUL 4, KONSEP PEMROGRAMAN BERBASIS OBJEK
 * WAKTU : RABU , 27-MARET-2024
 */

public class Identitas {
    private String nama;
    private String stambuk;

    // Constructor
    public Identitas(String nama, String stambuk) {
        this.nama = nama;
        this.stambuk = stambuk;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk stambuk
    public String getStambuk() {
        return stambuk;
    }

    // Setter untuk stambuk
    public void setStambuk(String stambuk) {
        this.stambuk = stambuk;
    }
}
