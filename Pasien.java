/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_final;

/**
 *
 * @author laure
 */
public abstract class Pasien {
    protected String nama;
    protected int hari;

    public Pasien(String nama, int hari) {
        this.nama = nama;
        this.hari = hari;
    }

    public abstract double hitungBiaya();

    public String getNama() {
        return nama;
    }
}

