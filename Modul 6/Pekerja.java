package praktikum6;
import java.time.LocalDate;
import java.time.Period;
public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;
    
    public Pekerja(String nama,boolean jenisKelamin,String nik,boolean menikah,double gaji,LocalDate tahunMasuk, int jumlahAnak){
        super (nama,jenisKelamin,nik,menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }
    // Getter & Setter
    public double getGajiPokok() { return gaji; }
    public void setGaji(double gaji) { this.gaji = gaji; }

    public LocalDate getTahunMasuk() { return tahunMasuk; }
    public void setTahunMasuk(LocalDate tahunMasuk) { this.tahunMasuk = tahunMasuk; }

    public int getJumlahAnak() { return jumlahAnak; }
    public void setJumlahAnak(int jumlahAnak) { this.jumlahAnak = jumlahAnak; }

    public double getBonus (){
        int lamaKerja =  Period.between(tahunMasuk,LocalDate.now ()).getYears();

        if (lamaKerja <= 5 )  return 0.05 * gaji;
        else if (lamaKerja <= 10 ) return 0.10 * gaji;
        else return 0.15 * gaji;
    }
    public double getGaji(){
        return gaji + getBonus ();
    }

    @Override
    public double getTunjangan (){
        return super.getTunjangan() + (20 * jumlahAnak);
    }
    @Override
    public double getPendapatan (){
        return getGaji()+ getTunjangan();
    }
    @Override 
    public String toString(){
        return super.toString() + "\n" +
        String.format (
            "tahun masuk    : %d %d\n" +
            "jumlah anak    : %d\n" + 
            "gaji           : %.1f",
            tahunMasuk.getMonthValue(),
            tahunMasuk.getYear(),
            jumlahAnak,
            gaji 
        );
    }
}
