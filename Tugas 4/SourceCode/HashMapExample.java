import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mendapatkan input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Membuat objek HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        
        // Meminta pengguna untuk memasukkan pasangan kunci-nilai
        System.out.println("Masukkan pasangan kunci-nilai (tekan Enter setelah setiap pasangan, ketik 'selesai' untuk selesai):");
        String inputKey;
        while (true) {
            System.out.print("Kunci: ");
            inputKey = scanner.nextLine();
            
            // Jika pengguna memasukkan 'selesai', keluar dari loop
            if (inputKey.equalsIgnoreCase("selesai")) {
                break;
            }
            
            // Meminta pengguna untuk memasukkan nilai yang sesuai dengan kunci
            System.out.print("Nilai: ");
            int inputValue = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline setelah nextInt()
            
            // Menambahkan pasangan kunci-nilai ke dalam HashMap
            hashMap.put(inputKey, inputValue);
        }
        
        // Menampilkan hasil HashMap setelah input selesai
        System.out.println("\nHasil HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Kunci: " + entry.getKey() + ", Nilai: " + entry.getValue());
        }
        
        // Menutup objek Scanner
        scanner.close();
    }
}
