/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_mobil;

import asset_mobil.Mobil;
import asset_mobil.MobilMewah;

/**
 *
 * @author A-7
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        System.out.println("Merk mobil1 = " + mobil1.getMerk());
        Mobil mobil2 = new Mobil("Hitam", 300, 200000, "Toyota");
        System.out.println("Merk mobil2 = " + mobil2.getMerk());
        Mobil mobil3 = new Mobil("putih", "Avanza");
        System.out.println("Merk mobil3 = " + mobil3.getMerk());
        Mobil mobil4 = new MobilMewah("Italia");
        mobil4.getInfo();
        mobil4.setHarga(7000000);
        mobil4.getInfo();
        
        Mobil mobilMewah2 = new MobilMewah(8000000, "Pick up");
        mobilMewah2.getInfo();
        mobil4.gass();
    }
}
