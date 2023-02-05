/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS;

import Praktikum07.*;

/**
 *
 * @author Asfin Rizaldy
 */
public class Siswa {
    private String nama;
    private String kelas;
    private String nomorAbsen;
    private String tahunAjaran;

    public Siswa(String nama, String kelas, String nomorAbsen, String tahunAjaran) {
       this.nama = nama;
       this.kelas = kelas;
       this.nomorAbsen = nomorAbsen;
       this.tahunAjaran = tahunAjaran;
    }

    public String getNama() {
       return nama;
    }

    public void setNama(String nama) {
       this.nama = nama;
    }

    public String getKelas() {
       return kelas;
    }

    public void setKelas(String kelas) {
       this.kelas = kelas;
    }

    public String getNomorAbsen() {
       return nomorAbsen;
    }

    public void setNomorAbsen(String nomorAbsen) {
       this.nomorAbsen = nomorAbsen;
    }
    
    public String getTahunAjaran() {
       return tahunAjaran;
    }

    public void setTahunAjaran(String tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }
    
    @Override
    public String toString() {
        return "Nama\t : " + nama + "\tKelas\t: " + kelas + "\nNomor Absen\t : " + nomorAbsen + "\t\tTahun Ajaran : " +tahunAjaran;
    }

}

