
class AkunBank{
    String nama;
    String noRek;
    String password;
    double saldo;

     AkunBank(String nama, String noRek, String password, double saldo) {
        this.nama = nama;
        this.noRek = noRek;
        this.password = password;
        this.saldo = saldo;
     }
     void ceksaldo(){
        System.out.println("Saldo anda " + saldo);

     }

     boolean verifikasipass(String pass){
        return password.equals(pass);

     }
     void setor (double jumlah){
        saldo += jumlah;
        System.out.println("Setor berhasil. saldo sekarang: " + saldo);

     }
     void tarik(double jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup!");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo sekarang: " + saldo);
        }
     }
    

}