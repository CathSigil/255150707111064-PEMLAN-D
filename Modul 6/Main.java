package praktikum6;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // 1. Manusia
        System.out.println(new Manusia("A", true, "111", true));
        System.out.println();
        System.out.println(new Manusia("B", false, "111", true));
        System.out.println();
        System.out.println(new Manusia("C", true, "111", false));

        // 2. Mahasiswa
        System.out.println();
        System.out.println(new MahasiswaFILKOM("B", false, "111", false,
                "165150300111100", 4.0));

        // 3. Pekerja
        System.out.println();
        System.out.println(new Pekerja("C", true, "111", true,
                1000, LocalDate.of(2016, 3, 2), 4));

        // 4. Manager
        System.out.println();
        System.out.println(new Manager("D", true, "111", true,
                1000, LocalDate.of(2017, 1, 2), 3, "HRD"));
    }
}