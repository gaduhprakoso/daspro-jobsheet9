import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();
        
        // Deklarasi array
        int[] arrNilai = new int[n];
        
        // Input elemen-elemen array
        System.out.println("Masukkan nilai elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arrNilai[i] = scanner.nextInt();
        }
        
        // Input nilai key yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = scanner.nextInt();
        
        // Mencari nilai dalam array
        int hasil = -1;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        
        // Output hasil pencarian
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu di index ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }
        
        scanner.close();
    }
}
