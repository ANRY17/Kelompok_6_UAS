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
public class NilaiMataPelajaranTurunan extends NilaiMataPelajaran {
    
    public NilaiMataPelajaranTurunan(double bahasaIndonesia, double matematika, double ipa, double ips, double bahasaInggris, double pkn, double penjaskes, double seniBudaya, double pendidikanAgama) {
       this.bahasaIndonesia = bahasaIndonesia;
       this.matematika = matematika;
       this.ipa = ipa;
       this.ips = ips;
       this.pkn = pkn;
       this.bahasaInggris = bahasaInggris;
       this.pendidikanAgama = pendidikanAgama;
       this.seniBudaya = seniBudaya;
       this.penjaskes = penjaskes;
    }

    public double getBahasaInggris() {
        return bahasaInggris;
    }

    public void setBahasaInggris(double bahasaInggris) {
        this.bahasaInggris = bahasaInggris;
    }

    public double getPendidikanAgama() {
        return pendidikanAgama;
    }

    public void setPendidikanAgama(double pendidikanAgama) {
        this.pendidikanAgama = pendidikanAgama;
    }

    public double getPkn() {
        return pkn;
    }

    public void setPkn(double pkn) {
        this.pkn = pkn;
    }

    public double getIps() {
        return ips;
    }

    public void setIps(double ips) {
        this.ips = ips;
    }

    public double getSeniBudaya() {
        return seniBudaya;
    }

    public void setSeniBudaya(double seniBudaya) {
        this.seniBudaya = seniBudaya;
    }

    public double getPenjaskes() {
        return penjaskes;
    }

    public void setPenjaskes(double penjaskes) {
        this.penjaskes = penjaskes;
    }

    public double getBahasaIndonesia() {
        return bahasaIndonesia;
    }

    public void setBahasaIndonesia(double bahasaIndonesia) {
        this.bahasaIndonesia = bahasaIndonesia;
    }

    public double getMatematika() {
        return matematika;
    }

    public void setMatematika(double matematika) {
        this.matematika = matematika;
    }

    public double getIpa() {
        return ipa;
    }

    public void setIpa(double ipa) {
        this.ipa = ipa;
    }

    @Override
    public double hitungRataRata() {
        return (getBahasaIndonesia() + getMatematika() + getIpa()) / 3;
    }
    
    public String NilaiMataPelajaranTurunan(String namaMataPelajaran) {
        switch (namaMataPelajaran) {
            case "Bahasa Indonesia" -> {
                if (bahasaIndonesia < 80) {
                    return "Tidak Lulus";
                }
            }
            case "Matematika" -> {
                if (matematika < 70) {
                    return "Tidak Lulus";
                }
            }
            case "IPA" -> {
                if (ipa < 75) {
                    return "Tidak Lulus";
                }
            }
            case "IPS" -> {
                if (ips < 80) {
                    return "Tidak Lulus";
                }
            }
            case "PENJASKES" -> {
                if (penjaskes < 78) {
                    return "Tidak Lulus";
                }
            }
            case "Pendidikan Agama" -> {
                if (pendidikanAgama <80 ) {
                    return "Tidak Lulus";
                }
            }
            case "Bahasa Inggris" -> {
                if (bahasaInggris < 75) {
                    return "Tidak Lulus";
                }
            }
            case "Seni Budaya" -> {
                if (seniBudaya < 77) {
                    return "Tidak Lulus";
                }
            }
            case "PKN" -> {
                if (pkn < 82) {
                    return "Tidak Lulus";
                }
            }
        }
        return "Lulus";
    }
    
    @Override
    public String toString() {
        return "Bahasa Indonesia: " + bahasaIndonesia + "\nMatematika: " + matematika + "\nIPA: " + ipa +"\nRata-rata: " + hitungRataRata()+"\nlulus/tidak: " + NilaiMataPelajaranTurunan("Matematika");
      }
}

