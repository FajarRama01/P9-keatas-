/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asset_mobil;

/**
 *
 * @author A-7
 */
public class Mobil implements KendaraanBermotor{
    private String warna;
    private int kecepatan; 
    private double Harga;
    private String Merk;
    
    public Mobil(){
        System.out.println("Constructor");
        this.warna = "Merah";
        this.kecepatan = 250;
        this.Harga = 300000000.00;
        this.Merk = "Honda";
    }

    public Mobil(String warna, int kecepatan, double Harga, String Merk) {
        this.warna = warna;
        this.kecepatan = kecepatan;
        this.Harga = Harga;
        this.Merk = Merk;
    }

    public Mobil(String warna, String Merk) {
        this.warna = warna;
        this.Merk = Merk;
    }
    
    
    
    public String getMerk() {
        return Merk;
    }
 
    public double getHarga() {
        return Harga;
    }

    public void setHarga(double Harga) {
        this.Harga = Harga;
    }

    public void getInfo(){
        System.out.println("Merek = "+ getMerk());
        System.out.println("Merek = "+ getHarga());
        System.out.println("Merek = "+ this.kecepatan);
        System.out.println("Merek = "+ this.warna);
    }

    @Override
    public void gass() {
        System.out.println("Gasss");
    }

    @Override
    public void Ngeremm() {
        System.out.println("Ngeremm");
    }
}
