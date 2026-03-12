import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        String noRek;
        String password;
        double saldo;

        System.out.println( "Selamat Datang di Bank Sangatta ");

     
        do {
            System.out.print("Nama (min 4 huruf): ");
            nama = input.nextLine();
        } while (nama.length() < 4);

        do {
            System.out.print("No Rekening (min 8 karakter): ");
            noRek = input.nextLine();
        } while (noRek.length() < 8);

        do {
            System.out.print("Password (min 8 karakter & 1 huruf besar): ");
            password = input.nextLine();
        } while (!validPassword(password));

        do {
            System.out.print("Saldo awal: ");
            saldo = input.nextDouble();
        } while (saldo < 0);

        AkunBank rek = new AkunBank(nama, noRek, password, saldo);

        int pilih;

        do {
            System.out.println("\n1. Cek Saldo");
            System.out.println("2. Tarik Uang");
            System.out.println("3. Setor Uang");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            if (pilih >= 1 && pilih <= 3) {
                System.out.print("Masukkan password: ");
                String pass = input.nextLine();

                if (!rek.verifikasipass(pass)) {
                    System.out.println("Password salah!");
                    continue;
                }
            }

            switch (pilih) {
                case 1:
                    rek.ceksaldo();
                    break;

                case 2:
                    System.out.print("Jumlah tarik: ");
                    rek.tarik(input.nextDouble());
                    break;

                case 3:
                    System.out.print("Jumlah setor: ");
                    rek.setor(input.nextDouble());
                    break;
            }

        } while (pilih != 4);
    }

    static boolean validPassword(String password) {
        if (password.length() < 8) return false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}