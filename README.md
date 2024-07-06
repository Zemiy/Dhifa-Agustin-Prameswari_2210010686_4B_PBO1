# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data rental mobil menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa informasi mobil dan pelanggan, serta mengelola proses penyewaan mobil, dan memberikan output berupa detail penyewaan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class**adalah template atau blueprint dari object. Pada kode ini, Mobil, Pelanggan, Rental, dan Main adalah contoh dari class.

```bash
public class Mobil {
    ...
}

public class Pelanggan {
    ...
}

public class Rental {
    ...
}

public class Main {
    ...
}

```

2. **Object** adalah instance dari class. Pada kode ini, Mobil m1 = new Mobil("Toyota", "Avanza", 300000); adalah contoh pembuatan object.

```bash
        rental.tambahPelanggan(new Pelanggan("Budi", "Jl. Merdeka No. 1", "08123456789"));
        rental.tambahPelanggan(new Pelanggan("Ani", "Jl. Diponegoro No. 2", "08198765432"));
        rental.tambahMobil(new Mobil("Toyota", "Avanza", 300000));
        rental.tambahMobil(new Mobil("Honda", "Jazz", 350000));
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, merk, model, dan hargaSewaPerHari, nama, alamat, noTelp adalah contoh atribut.

```bash
String merk;
 String model;
 double hargaSewaPerHari;
```
```bash
 String nama;
String alamat;
 String noTelp;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class Mobil dan Pelanggan.

```bash
public Mobil(String merk, String model, double hargaSewaPerHari) {
    this.merk = merk;
    this.model = model;
    this.hargaSewaPerHari = hargaSewaPerHari;
}

public Pelanggan(String nama, String alamat, String noTelp) {
    this.nama = nama;
    this.alamat = alamat;
    this.noTelp = noTelp;
}

```

5. **Mutator**atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, setMerk, setModel, dan setHargaSewaPerHari (Mobil) setNama, setAlamat, setNoTelp (Pelanggan) adalah contoh method mutator.

```bash
public void setMerk(String merk) {
    this.merk = merk;
}

public void setModel(String model) {
    this.model = model;
}

public void setHargaSewaPerHari(double hargaSewaPerHari) {
    this.hargaSewaPerHari = hargaSewaPerHari;
}

}
```
```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setAlamat(String alamat) {
    this.alamat = alamat;
}

public void setNoTelp(String noTelp) {
    this.noTelp = noTelp;
}
```


6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. PPada kode ini, getMerk, getModel, dan getHargaSewaPerHari(Mobil) getNama, getAlamat getNoTelp(pelanggan) adalah contoh method accessor.
```bash
public String getMerk() {
    return merk;
}

public String getModel() {
    return model;
}

public double getHargaSewaPerHari() {
    return hargaSewaPerHari;
}

```
```bash
public String getNama() {
    return nama;
}

public String getAlamat() {
    return alamat;
}

public String getNoTelp() {
    return noTelp;
}

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut merk, model, dan hargaSewaPerHari(Mobil),  dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.
```bash
    private String merk;
    private String model;
    private double hargaSewaPerHari;
```
```bash
    private String nama;
    private String alamat;
    private String noTelp;
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Dalam kode ini saya mengimplementasi polymorphism melalui class Mobil dan Pelanggan, meskipun tidak secara langsung diimplementasikan dalam bentuk overriding atau overloading method. Namun, konsep polymorphism dapat terlihat pada penggunaan objek Mobil dan Pelanggan yang berbeda jenisnya namun diatur dalam satu ArrayList yang umum, yaitu daftarMobil dan daftarPelanggan. Hal ini memungkinkan untuk memperlakukan objek Mobil dan Pelanggan dengan cara yang seragam meskipun keduanya adalah tipe yang berbeda

```bash
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

}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Seleksi menggunakan statement switch (pilihan) untuk memilih aksi berdasarkan nilai yang dimasukkan oleh pengguna.
Setiap case pada switch mewakili aksi yang dilakukan ketika pengguna memilih menu tertentu:
case 1: Memanggil rental.printDaftarMobil() untuk mencetak daftar mobil.
case 2: Memanggil rental.printDaftarPelanggan() untuk mencetak daftar pelanggan.
case 3: Memanggil rental.sewaMobil() untuk memulai proses penyewaan mobil.
case 4: Mengakhiri program dengan pesan "Terima kasih telah menggunakan layanan kami."
default: Memberikan pesan bahwa pilihan tidak valid jika pengguna memasukkan angka diluar rentang 1-4.

```bash
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Menu:");
                System.out.println("1. Lihat Daftar Mobil");
                System.out.println("2. Lihat Daftar Pelanggan");
                System.out.println("3. Sewa Mobil");
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
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.nextLine(); // Menghapus input yang tidak valid
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < daftarPelanggan.size(); i++) {
....
}
```
```bash
for (int i = 0; i < daftarMobil.size(); i++) { {
....
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
 Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Menu:");
                System.out.println("1. Lihat Daftar Mobil");
                System.out.println("2. Lihat Daftar Pelanggan");
                System.out.println("3. Sewa Mobil");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu: ");
                int pilihan = scanner.nextInt();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, daftarMobil dan daftarPelanggan adalah objek ArrayList yang digunakan untuk menyimpan objek Mobil dan Pelanggan secara dinamis.


```bash
    private ArrayList<Mobil> daftarMobil;
    private ArrayList<Pelanggan> daftarPelanggan;

    // Constructor
    public Rental() {
        daftarMobil = new ArrayList<>();
        daftarPelanggan = new ArrayList<>();
    }
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `catch` untuk menangani error.

```bash
         catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Silakan coba lagi.");
            scanner.nextLine(); // Menghapus input yang tidak valid
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index tidak valid. Silakan coba lagi.");
        }
    }
```
```bash
               catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.nextLine(); // Menghapus input yang tidak valid
            }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    0    |
|  9  | Polymorphism   |    5    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **90** |

## Pembuat

Nama: Dhifa Agustin
NPM: 2210010686
