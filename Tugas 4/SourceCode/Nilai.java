package Evaluasi.Mahasiswa;

/**
 * @author stambuk : 13020220007
 * Nama : ACHMAD ZULFIKAR
 * MATERI : MODUL 4, KONSEP PEMROGRAMAN BERBASIS OBJEK
 * WAKTU : RABU , 27-MARET-2024
 */

public class Nilai {
    private int tugas1;
    private int tugas2;
    private int mid;
    private int uas;

    // Constructor
    public Nilai(int tugas1, int tugas2, int mid, int uas) {
        this.tugas1 = tugas1;
        this.tugas2 = tugas2;
        this.mid = mid;
        this.uas = uas;
    }

    // Getter untuk tugas1
    public int getTugas1() {
        return tugas1;
    }

    // Setter untuk tugas1
    public void setTugas1(int tugas1) {
        this.tugas1 = tugas1;
    }

    // Getter untuk tugas2
    public int getTugas2() {
        return tugas2;
    }

    // Setter untuk tugas2
    public void setTugas2(int tugas2) {
        this.tugas2 = tugas2;
    }

    // Getter untuk mid
    public int getMid() {
        return mid;
    }

    // Setter untuk mid
    public void setMid(int mid) {
        this.mid = mid;
    }

    // Getter untuk uas
    public int getUas() {
        return uas;
    }

    // Setter untuk uas
    public void setUas(int uas) {
        this.uas = uas;
    }
}
