package Praktikum9_2;

public class Mahasiswa {

    String nama;
    String tanggalLahir;
    String noPendaftaran;
    String noTelp;
    String alamat;
    String email;

    public Mahasiswa(String nama, String tanggalLahir, String noPendaftaran,
                     String noTelp, String alamat, String email) {
        this.nama          = nama;
        this.tanggalLahir  = tanggalLahir;
        this.noPendaftaran = noPendaftaran;
        this.noTelp        = noTelp;
        this.alamat        = alamat;
        this.email         = email;
    }

    public String getNama()           { return nama; }
    public String getTanggalLahir()   { return tanggalLahir; }
    public String getNoPendaftaran()  { return noPendaftaran; }
    public String getNoTelp()         { return noTelp; }
    public String getAlamat()         { return alamat; }
    public String getEmail()          { return email; }
}