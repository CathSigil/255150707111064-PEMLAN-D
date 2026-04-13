package Praktikum7;
public class Main {
    public static void main(String[] args) {

        Kue[] daftarKue = new Kue[20];

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                daftarKue[i] = new KuePesanan("Kue Pesanan " + i, 10000, 0.5 + i);
            } else {
                daftarKue[i] = new KueJadi("Kue Jadi " + i, 15000, i + 1);
            }
        }

        double totalHarga = 0;
        double totalHargaPesanan = 0, totalBerat = 0;
        double totalHargaJadi = 0, totalJumlah = 0;

        Kue kueTermahal = daftarKue[0];

        System.out.println("=== DAFTAR KUE ===\n");

        for (Kue k : daftarKue) {

            if (k instanceof KuePesanan) {
                System.out.println("[KuePesanan]");
            } else {
                System.out.println("[KueJadi]");
            }
            System.out.println(k);

            double hargaAkhir = k.hitungHarga();

            totalHarga += hargaAkhir;

            if (k instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) k;
                totalHargaPesanan += hargaAkhir;
                totalBerat += kp.getBerat();
            } else {
                KueJadi kj = (KueJadi) k;
                totalHargaJadi += hargaAkhir;
                totalJumlah += kj.getJumlah();
            }

            if (hargaAkhir > kueTermahal.hitungHarga()) {
                kueTermahal = k;
            }
        }

        // OUTPUT HASIL
        System.out.println("\n=== HASIL ===");

        System.out.printf("Total Harga Semua Kue : Rp %,.2f\n", totalHarga);

        System.out.println("\n-- KuePesanan --");
        System.out.printf("Total Harga : Rp %,.2f\n", totalHargaPesanan);
        System.out.printf("Total Berat : %.2f kg\n", totalBerat);

        System.out.println("\n-- KueJadi --");
        System.out.printf("Total Harga  : Rp %,.2f\n", totalHargaJadi);
        System.out.printf("Total Jumlah : %.0f\n", totalJumlah);

        System.out.println("\n=== KUE TERMAHAL ===");
        if (kueTermahal instanceof KuePesanan) {
            System.out.println("[KuePesanan]");
        } else {
            System.out.println("[KueJadi]");
        }
        System.out.println(kueTermahal);
        System.out.printf("Harga Akhir: Rp %,.2f\n", kueTermahal.hitungHarga());
    }
}