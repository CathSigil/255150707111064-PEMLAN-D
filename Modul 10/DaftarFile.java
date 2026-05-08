package Praktikum10;
import java.io.File;
import java.util.Scanner;

public class DaftarFile {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.print("Masukkan path direktori: ");
        var path = keyboard.nextLine();

        var dir = new File(path);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Direktori tidak ditemukan!");
        } else {
            String[] daftarFile = dir.list();
            System.out.println("\nDaftar file di dalam " + path + ":");
            System.out.println("Total: " + daftarFile.length + " file/folder");
            System.out.println("==================================");
            for (String nama : daftarFile) {
                System.out.println(nama);
            }
        }
    }
}