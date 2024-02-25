//NIM = 13020220007
//Nama = Achmad Zulfikar
//Hari/Tanggal = Minggu 25-02-2024
//Waktu Pengerjaan = 15.00 - 23.00

/* pembagian integer, casting */
public class Kodeprogram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* KAMUS */
		int x = 1; int y = 2; float fx; float fy;
		/* ALGORITMA */
		System.out.print ("x/y (format integer) = "+ x/y); 
		System.out.print ("\nx/y (format float) = "+ x/y);
		/* supaya hasilnya tidak nol */ 
		fx=x;
		fy=y;
		System.out.print ("\nx/y (format integer) = "+ fx/fy); 
		System.out.print ("\nx/y (format float) = "+ fx/fy);
		/* casting */
		System.out.print("\nfloat(x)/float(y) (format integer)= "+ (float)x/(float)y);
		System.out.print("\nfloat(x)/float(y) (format float) = "+ (float)x/(float)y);
		x = 10; y = 3;
		System.out.print ("\nx/y (format integer) = "+ x/y); 
		System.out.print ("\nx/y (format float = "+ x/y);
	}
}