import java.util.Scanner;

public class ArrayNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukan Nilai Akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for(int i = 0; i<nilaiAkhir.length;i++){
            if (nilaiAkhir[i] > 70)
                System.out.println("Nilai Akhir ke-"+i+" lulus ");
            else{
                 System.out.println("Nilai Akhir ke-"+i+" Tidak lulus ");
            }
        }
    }
}
