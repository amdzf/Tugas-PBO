//NIM = 13020220007
//Nama = Achmad Zulfikar
//Hari/Tanggal = Minggu 25-02-2024
//Waktu Pengerjaan = 15.00 - 23.00

/* pemakaian beberapa operator terhadap bit */
 public class Kodeprogram12 {

	 public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 /* KAMUS */
		 int n = 10; /* 1010 */
		 int x = 1; /* 1 */
		 int y = 2; /* 10 */

		/* ALGORITMA */
		System.out.println ("n = "+ n);
		System.out.println ("x = "+ x);
		System.out.println ("y = "+ y);
		System.out.println("n & 8 = "+ (n & 8)); /* 1010 AND 1000 */
		System.out.println ("x & ~ 8 = "+ (x & ~8)); /* 1 AND 0111 */
		System.out.println ("y << 2 = "+ (y << 2)); /*10==> 1000 = 8 */
		System.out.println ("y >> 3 = "+ (y >>3)); /*10 ==>0000 = 0 */
 	}
 }
