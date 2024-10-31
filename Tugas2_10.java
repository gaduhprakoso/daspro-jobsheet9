import java.util.Scanner;

public class Tugas2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Pesanan: ");
        int jumlahPesanan = sc.nextInt();

        sc.nextLine();
        String[] namaPesanan = new String[jumlahPesanan];
        int[] harga = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukan Nama Pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan Harga " + namaPesanan[i] + " : Rp.");
            harga[i] = sc.nextInt();
            sc.nextLine();
            totalBiaya += harga[i];
        }
        System.out.println("\n===Daftar Pesanan===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " : Rp." + harga[i]);
        }
        System.out.println("\nTotal Biaya: Rp." + totalBiaya);
        sc.close();
    }
}
