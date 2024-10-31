import java.util.Scanner;

public class Tugas1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai mahasiswa yang akan diinput: ");
        int banyakMahasiswa = sc.nextInt();

        int[] nilai = new int[banyakMahasiswa];
        int totalNilai = 0;

        for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            totalNilai += nilai[i];
        }

        double rerata = (double) totalNilai / banyakMahasiswa;

        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];

        for (int i = 1; i < banyakMahasiswa; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }
        System.out.println("\n====Nilai Mahasiswa====");
        for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
        System.out.println("\nRerata: " + rerata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        sc.close();
    }
}
