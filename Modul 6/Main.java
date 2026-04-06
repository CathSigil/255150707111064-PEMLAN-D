package praktikum6;
import java.time.LocalDate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // 1. MANUSIA
        System.out.println("=== MANUSIA ===");

        Manusia m1 = new Manusia("A", true, "111", true);
        System.out.println(m1);
        System.out.println();

        Manusia m2 = new Manusia("B", false, "222", true);
        System.out.println(m2);
        System.out.println();

        Manusia m3 = new Manusia("C", true, "333", false);
        System.out.println(m3);
        System.out.println();

        // 2. MAHASISWA FILKOM
        System.out.println("=== MAHASISWA ===");

        MahasiswaFILKOM s1 = new MahasiswaFILKOM(
                "D", true, "444", false,
                "225150200111001", 2.8
        );
        System.out.println(s1);
        System.out.println();

        MahasiswaFILKOM s2 = new MahasiswaFILKOM(
                "E", false, "555", false,
                "225150400111002", 3.2
        );
        System.out.println(s2);
        System.out.println();

        MahasiswaFILKOM s3 = new MahasiswaFILKOM(
                "F", false, "666", false,
                "225150700111003", 3.8
        );
        System.out.println(s3);
        System.out.println();


        // 3. PEKERJA
        System.out.println("=== PEKERJA ===");

        Pekerja p1 = new Pekerja(
                "G", true, "777", true,
                3000,
                LocalDate.now().minusYears(2),
                2
        );
        System.out.println(p1);
        System.out.println();

        Pekerja p2 = new Pekerja(
                "H", true, "888", true,
                4000,
                LocalDate.now().minusYears(9),
                0
        );
        System.out.println(p2);
        System.out.println();

        Pekerja p3 = new Pekerja(
                "I", true, "999", true,
                5000,
                LocalDate.now().minusYears(20),
                10
        );
        System.out.println(p3);
        System.out.println();


        // 4. MANAGER
        System.out.println("=== MANAGER ===");

        Manager mgr = new Manager(
                "J", true, "1010", true,
                7500,
                LocalDate.now().minusYears(15),
                3,
                "HRD"
        );
        System.out.println(mgr);
    }
}