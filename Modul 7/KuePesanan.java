package Praktikum7;

public class KuePesanan extends Kue{
    public double berat;


public KuePesanan (String nama, double harga, double berat){
    super (nama, harga);
    this.berat = berat;
}
public double getBerat(){
    return berat;
}

@Override 
public double hitungHarga(){
    return harga * berat;
}

@Override
public String toString() {
    return String.format(
        "Nama Kue: %s\n" +
        "| Harga Dasar: Rp%,.2f\n" +
        "| Berat: %.2f kg\n",
        nama, harga, berat
    );
}
}
    
