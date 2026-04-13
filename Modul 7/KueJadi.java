package Praktikum7;

public class KueJadi extends Kue{
    private double jumlah;

    public KueJadi(String nama,double harga, double jumlah ){
        super (nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah(){
        return jumlah;
    }

    @Override 
    public double hitungHarga(){
        return harga * jumlah * 2;
    }

    @Override
public String toString() {
    return String.format(
        "Nama Kue: %s\n" +
        "| Harga Dasar: Rp%,.2f\n" +
        "| Jumlah: %.0f\n",
        nama, harga, jumlah
    );
}

    
}
