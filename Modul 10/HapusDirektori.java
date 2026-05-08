package Praktikum10;
import java.io.File;
import java.util.Scanner;

public class HapusDirektori {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.print("Masukkan path direktori: ");
        var path = keyboard.nextLine();

        var dir = new File(path);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Direktori tidak ditemukan!");
        } else {
            File[] daftarFile = dir.listFiles();
            for (File file : daftarFile) {
                file.delete();
                System.out.println("File " + file.getName() + " berhasil dihapus");
            }
            dir.delete();
            System.out.println("Direktori " + dir.getName() + " berhasil dihapus");
        }
    }
}
