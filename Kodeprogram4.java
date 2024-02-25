//Nama = Achmad Zulfikar
//Nim = 13020220007
//Hari/Tanggal = Minggu-25-2024
//Waktu Pengerjaan = 15.00-23.00

import java.util.Scanner;

/* contoh membaca integer menggunakan Class Scanner*/
public class Kodeprogram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Kamus */
		int a;
		Scanner masukan;
		/* Program */
		System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
		masukan = new Scanner(System.in);
		a = masukan.nextInt();
		/* coba ketik : masukan.nextInt(); 
		Apa akibatnya ?*/
		System.out.print ("Nilai yang dibaca : "+ a);
	}
}
