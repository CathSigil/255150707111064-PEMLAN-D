package Praktikum10;
import java.io.File;
import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.print("Masukkan path file: ");
        var path = keyboard.nextLine();

        var file = new File(path);

        if (!file.exists()) {
            System.out.println("File tidak ditemukan!");
        } else {
            long bytes = file.length();
            double kb = bytes / 1024.0;
            double mb = bytes / (1024.0 * 1024.0);

            if (mb < 1) {
                System.out.printf("Ukuran file: %.2f KB%n", kb);
            } else {
                System.out.printf("Ukuran file: %.2f MB%n", mb);
            }
        }
    }
}