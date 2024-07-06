/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Rental {
    // Atribut
    private ArrayList<Mobil> daftarMobil;
    private ArrayList<Pelanggan> daftarPelanggan;

    // Constructor
    public Rental() {
        daftarMobil = new ArrayList<>();
        daftarPelanggan = new ArrayList<>();
    }

    // Method untuk menambah mobil ke daftar
    public void tambahMobil(Mobil mobil) {
        daftarMobil.add(mobil);
    }

    // Method untuk menambah pelanggan ke daftar
    public void tambahPelanggan(Pelanggan pelanggan) {
        daftarPelanggan.add(pelanggan);
    }

    // Method untuk mencetak daftar mobil
    public void printDaftarMobil() {
        System.out.println("Daftar Mobil:");
        for (int i = 0; i < daftarMobil.size(); i++) {
            System.out.println("Index: " + i);
            daftarMobil.get(i).printInfo();
            System.out.println("----------------------");
        }
    }

    // Method untuk mencetak daftar pelanggan
    public void printDaftarPelanggan() {
        System.out.println("Daftar Pelanggan:");
        for (int i = 0; i < daftarPelanggan.size(); i++) {
            System.out.println("Index: " + i);
            daftarPelanggan.get(i).printInfo();
            System.out.println("----------------------");
        }
    }

    // Method untuk menyewa mobil
    public void sewaMobil() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Tampilkan daftar mobil
            printDaftarMobil();

            // Pilih mobil
            System.out.print("Pilih mobil (index): ");
            int indexMobil = scanner.nextInt();
            Mobil mobil = daftarMobil.get(indexMobil);

            // Tampilkan daftar pelanggan
            printDaftarPelanggan();

            // Pilih pelanggan
            System.out.print("Pilih pelanggan (index): ");
            int indexPelanggan = scanner.nextInt();
            Pelanggan pelanggan = daftarPelanggan.get(indexPelanggan);

            // Input jumlah hari sewa
            System.out.print("Jumlah hari sewa: ");
            int hari = scanner.nextInt();

            // Hitung total biaya
            double totalBiaya = mobil.getHargaSewaPerHari() * hari;

            // Cetak informasi penyewaan
            System.out.println("Pelanggan: " + pelanggan.getNama());
            System.out.println("Mobil: " + mobil.getMerk() + " " + mobil.getModel());
            System.out.println("Jumlah hari sewa: " + hari);
            System.out.println("Total biaya: " + totalBiaya);
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Silakan coba lagi.");
            scanner.nextLine(); // Menghapus input yang tidak valid
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index tidak valid. Silakan coba lagi.");
        }
    }
}

