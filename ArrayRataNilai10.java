import java.util.Scanner;

public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukan jumlah mahasiswa : ");
        int mahasiswa = sc.nextInt();

        int[] nilaiMhs= new int[mahasiswa];
        int lulus = 0;
        double total = 0;
        double rata2;

        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukan nilai mahasiswa ke-"+ (i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for(int i = 0; i < nilaiMhs.length; i ++){
            total +=nilaiMhs[i];

            if (nilaiMhs[i] > 70){ 
                lulus++;
            }
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Jumlah mahasiswa = "+mahasiswa);
        System.out.println("Rata-rata nilai = "+rata2);
        System.out.println("jumlah mahasiswa yang lulus = "+lulus);
    }
}
