import java.util.Scanner;

public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukan jumlah mahasiswa : ");
        int mahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[mahasiswa];
        int lulus = 0, tidakLulus = 0;
        double totalLulus = 0, totalTidakLulus = 0;
        double rata2lulus, rata2TidakLulus;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                lulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                tidakLulus++;
            }
        }
        rata2lulus = (lulus > 0) ? totalLulus / lulus : 0;
        rata2TidakLulus = (tidakLulus > 0) ? totalTidakLulus / tidakLulus : 0;
        System.out.println("Rata-rata nilai lulus = " + rata2lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
    }
}
