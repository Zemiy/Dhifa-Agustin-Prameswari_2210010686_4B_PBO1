/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;
public class Mobil {
    // Atribut
    private String merk;
    private String model;
    private double hargaSewaPerHari;

    // Constructor
    public Mobil(String merk, String model, double hargaSewaPerHari) {
        this.merk = merk;
        this.model = model;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    // Accessor (getter)
    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public double getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }

    // Mutator (setter)
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHargaSewaPerHari(double hargaSewaPerHari) {
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    // Method untuk mencetak detail mobil
    public void printInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Harga Sewa Per Hari: " + hargaSewaPerHari);
    }
}
