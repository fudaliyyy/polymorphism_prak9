/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Zephyrus
 */
public class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    @Override
    public String toString() {
        return "";
    }

    public double gaji(double gaji) {
        return 0;
    }

    
}
