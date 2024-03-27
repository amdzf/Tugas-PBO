/**
 * @author stambuk : 13020220007
 * Nama : ACHMAD ZULFIKAR
 * MATERI : MODUL 4, KONSEP PEMROGRAMAN BERBASIS OBJEK
 * WAKTU : RABU , 27-MARET-2024
 */


package Evaluasi.HitungNilai;

public class HitungNilaiAkhir {
    public double nilaiTugas(int tugas1, int tugas2){
        return (tugas1 + tugas2) / 2.0;
    }
    
    // method untuk menghitung nilai akhir
    public double nilaiAkhir(double tugas, int mid, int uas) {
        return (tugas * 0.4 ) + (mid * 0.3) + (uas * 0.3);
    }
}