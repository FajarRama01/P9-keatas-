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
public class MobilMewah extends Mobil implements KendaraanBermotor{
    private double pajakBarangMewah = 200.0;
    private String asalnegara;

    public MobilMewah(String asalnegara) {
        this.asalnegara = asalnegara;
    }

    public MobilMewah(double Harga, String Merk) {
        super("Merah", 500, 5000000, "Lamborghini");
        this.asalnegara = asalnegara;
    }

    @Override
    public void gass() {
        System.out.println("Pokok e Gasss");
    }

    @Override
    public void Ngeremm() {
        System.out.println("Pokok e Ngeremm");
    }
    
    
    
    
}
