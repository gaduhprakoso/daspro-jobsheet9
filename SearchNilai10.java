import java.util.Scanner;

public class SearchNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukan banyak nilai yang akan diinput: ");
        int n = sc.nextInt();

        int[] arrNilai = new int[n];
        
        for (int i = 0; i < arrNilai.length;i++){
            System.out.print("nilai mahasiswa ke-" + (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
            
        }
        System.out.print("masukan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = 0;

        for (int i = 0; i < arrNilai.length;i++){
            if (key == arrNilai[i]){
                hasil = i+1;
                break;
            }
        }
        if (hasil != 0) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }
    }
}