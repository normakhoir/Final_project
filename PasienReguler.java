/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_final;

/**
 *
 * @author laure
 */
public class PasienReguler extends Pasien {

    public PasienReguler(String nama, int hari) {
        super(nama, hari);
    }

    @Override
    public double hitungBiaya() {
        return hari * 800000;
    }
}

