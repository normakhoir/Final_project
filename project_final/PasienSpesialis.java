/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_final;

/**
 *
 * @author laure
 */
public class PasienSpesialis extends Pasien {

    public PasienSpesialis(String nama, int hari) {
        super(nama, hari);
    }

    @Override
    public double hitungBiaya() {
        return 300000 + (hari * 200000);
    }
}
