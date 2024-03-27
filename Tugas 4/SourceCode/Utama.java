package Evaluasii;

/**
 * @author stambuk : 13020220007
 * Nama : ACHMAD ZULFIKAR
 * MATERI : MODUL 4, KONSEP PEMROGRAMAN BERBASIS OBJEK
 * WAKTU : RABU , 27-MARET-2024
 */

import Evaluasi.HitungNilai.HitungNilaiAkhir;
import Evaluasi.Mahasiswa.Identitas;
import Evaluasi.Mahasiswa.Nilai;

import javax.swing.JOptionPane;

public class Utama {
    public static void main(String[] args) {
        // Input nama dan stambuk menggunakan JOptionPane
        String nama = JOptionPane.showInputDialog("Masukkan nama: ");
        String stambuk = JOptionPane.showInputDialog("Masukkan stambuk: ");

        // Input tugas1, tugas2, mid, dan uas menggunakan JOptionPane
        int tugas1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai tugas 1: "));
        int tugas2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai tugas 2: "));
        int mid = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai mid: "));
        int uas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai uas: "));

        // Inisialisasi objek Identitas dan Nilai
        Identitas identitas = new Identitas(nama, stambuk);
        Nilai nilai = new Nilai(tugas1, tugas2, mid, uas);

        // Menghitung nilai tugas dan nilai akhir
        HitungNilaiAkhir hitungNilaiAkhir = new HitungNilaiAkhir();
        double tugas = hitungNilaiAkhir.nilaiTugas(tugas1, tugas2);
        double na = hitungNilaiAkhir.nilaiAkhir(tugas, mid, uas);

        // Menampilkan hasil menggunakan JOptionPane
        JOptionPane.showMessageDialog(null, "Nama: " + identitas.getNama() + "\nStambuk: " + identitas.getStambuk());
        JOptionPane.showMessageDialog(null, "Nilai tugas: " + tugas + "\nNilai akhir: " + na);
    }
}
