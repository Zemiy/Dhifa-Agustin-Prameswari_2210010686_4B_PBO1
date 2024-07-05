package tugasakhir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rental rental = new Rental();

        // Tambah data mobil
        rental.tambahMobil(new Mobil("Toyota", "Avanza", 300000));
        rental.tambahMobil(new Mobil("Honda", "Jazz", 350000));

        // Tambah data pelanggan
        rental.tambahPelanggan(new Pelanggan("Budi", "Jl. Merdeka No. 1", "08123456789"));
        rental.tambahPelanggan(new Pelanggan("Ani", "Jl. Diponegoro No. 2", "08198765432"));

        // Menu utama
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Lihat Daftar Mobil");
            System.out.println("2. Lihat Daftar Pelanggan");
            System.out.println("3. Sewa Mobil");            //0 dan 1
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    rental.printDaftarMobil();
                    break;
                case 2:
                    rental.printDaftarPelanggan();
                    break;
                case 3:
                    rental.sewaMobil();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

