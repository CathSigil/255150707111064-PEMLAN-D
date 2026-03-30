public class Jaket {

    public static final int HARGA_A = 100000;
    public static final int HARGA_B = 125000;
    public static final int HARGA_C = 175000;

    public static int hitungA(int jumlah){
        int harga = HARGA_A;
        if(jumlah > 100){
            harga = 95000;
        }
        return jumlah * harga;
    }
    
    public static int hitungB(int jumlah){
        int harga = HARGA_B;
        if(jumlah > 100){
            harga = 120000;
        }
        return jumlah * harga;
    }

    public int hitungC(int jumlah){
        int harga = HARGA_C;
        if(jumlah > 100){
            harga = 160000;
        }
        return jumlah * harga;
    }
}