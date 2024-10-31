import java.util.Scanner;

public class Tugas3_10 {
    public static void main(String[] args) {

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makanan = sc.nextLine();

        boolean tersedia = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makanan)) {
                tersedia = true;
                break;
            }
        }
        if (tersedia == true) {
            System.out.println(makanan + " tersedia di menu");
        } else {
            System.out.println(makanan + " tidak tersedia di menu");
        }
        sc.close();
    }
}
