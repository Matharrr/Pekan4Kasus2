package p4.kasus2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Membuat daftar menu makanan
        MenuMakanan[] daftarMenu = new MenuMakanan[10];
        daftarMenu[0] = new MenuMakanan("Nasi Goreng", 10, 15000);
        daftarMenu[1] = new MenuMakanan("Mie Goreng", 15, 12000);
        daftarMenu[2] = new MenuMakanan("Ayam Goreng", 20, 10000);
        daftarMenu[3] = new MenuMakanan("Sate Ayam", 8, 20000);
        daftarMenu[4] = new MenuMakanan("Bakso", 12, 8000);  
        daftarMenu[5] = new MenuMakanan("Soto Ayam",12,10000);
        daftarMenu[6] = new MenuMakanan("Gado-gado",20,12000);
        daftarMenu[7] = new MenuMakanan("Rendang",18,13000);
        daftarMenu[8] = new MenuMakanan("Soto Kambing",17,9000);
        daftarMenu[9] = new MenuMakanan("Nasi Uduk",8,8000);
        // Memesan makanan
        Scanner scanner = new Scanner(System.in);
        int totalBayar = 0;
        boolean memesanLagi = true;
        while (memesanLagi) {
            // Menampilkan daftar menu makanan
            System.out.println("Dafar Menu Makanan");
            System.out.println("=======================================");
            for (int i = 0; i < daftarMenu.length; i++) {
                System.out.println((i+1) + ". " + daftarMenu[i].getNamaProduk() + " (Stok: " + daftarMenu[i].getStok() + ") - Rp " + daftarMenu[i].getHargaProduk());
            }
            System.out.println("=======================================");
            System.out.print("Silakan pilih nomor menu yang ingin dipesan (0 untuk keluar): ");
            int nomorMenu = scanner.nextInt();
            // keluar program jika nomorMenu == 0
            if (nomorMenu == 0) {
                memesanLagi = false;
                continue;
            }
            System.out.print("Silakan masukkan jumlah yang ingin dipesan: ");
            int jumlahPesanan = scanner.nextInt();
            MenuMakanan menuYangDipesan = daftarMenu[nomorMenu-1];
            if (menuYangDipesan.getStok() >= jumlahPesanan) {
                menuYangDipesan.setStok(menuYangDipesan.getStok() - jumlahPesanan);
                Penjualan penjualan = new Penjualan(menuYangDipesan, jumlahPesanan);
                totalBayar += penjualan.getHargaTotal();
                System.out.println("Anda telah memesan " + jumlahPesanan + " " + menuYangDipesan.getNamaProduk() + " dengan harga Rp " + menuYangDipesan.getHargaProduk() + " per item.");
                System.out.println("Total yang harus dibayar: Rp " + totalBayar);
            } else {
                System.out.println("Maaf, stok " + menuYangDipesan.getNamaProduk() + " tidak mencukupi.");
            }
            System.out.print("Apakah anda ingin memesan lagi? (y/n) ");
            String jawaban = scanner.next();
            if (jawaban.equalsIgnoreCase("n")) {
                memesanLagi = false;
            }
        }
        System.out.println("Terima kasih telah berkunjung!");
    }
}
