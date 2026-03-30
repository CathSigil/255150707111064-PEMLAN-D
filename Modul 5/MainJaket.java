import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class MainJaket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Locale indonesia = new Locale("id", "ID");
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(indonesia);

        System.out.println("===== DAFTAR HARGA JAKET CV. LABKOMDAS =====");
        System.out.println("Jaket A : Rp " + Jaket.HARGA_A);
        System.out.println("   > Diskon jika beli >100 : Rp 95.000,00");
        System.out.println("Jaket B : Rp " + Jaket.HARGA_B);
        System.out.println("   > Diskon jika beli >100 : Rp 120.000,00");
        System.out.println("Jaket C : Rp " + Jaket.HARGA_C);
        System.out.println("   > Diskon jika beli >100 : Rp 160.000,00");
        System.out.println("============================================\n");

        System.out.print("Masukkan jumlah Jaket A : ");
        int a = input.nextInt();

        System.out.print("Masukkan jumlah Jaket B : ");
        int b = input.nextInt();

        System.out.print("Masukkan jumlah Jaket C : ");
        int c = input.nextInt();

        int hargaA = (a > 100) ? 95000 : Jaket.HARGA_A;
        int hargaB = (b > 100) ? 120000 : Jaket.HARGA_B;
        int hargaC = (c > 100) ? 160000 : Jaket.HARGA_C;

        int totalA = Jaket.hitungA(a);
        int totalB = Jaket.hitungB(b);

        Jaket jk = new Jaket();
        int totalC = jk.hitungC(c);

        int totalSemua = totalA + totalB + totalC;
        
        System.out.println("\n========== STRUK PEMBELIAN ==========");System.out.println("        CV. LABKOMDAS");
        System.out.println("-------------------------------------");
        System.out.println("Jaket A : " + a + " x " + rupiah.format(hargaA) + " = " + rupiah.format(totalA));
        System.out.println("Jaket B : " + b + " x " + rupiah.format(hargaB) + " = " + rupiah.format(totalB));
        System.out.println("Jaket C : " + c + " x " + rupiah.format(hargaC) + " = " + rupiah.format(totalC));
        System.out.println("-------------------------------------");
        System.out.println("TOTAL BAYAR : " + rupiah.format(totalSemua));
        System.out.println("=====================================");
    }
}