
package Praktikum11;
import java.util.*;

class Player {
    String team;
    int no;
    int tinggiBadan;
    int beratBadan;

    public Player(String team, int no, int tinggiBadan, int beratBadan) {
        this.team        = team;
        this.no          = no;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan  = beratBadan;
    }

    public String toString() {
        return "No." + no + " [" + team + "] Tinggi: " + tinggiBadan + " cm, Berat: " + beratBadan + " kg";
    }
}

public class Soal2B_TeamFutsal {
    public static void main(String[] args) {

        ArrayList<Player> timB = new ArrayList<>();
        timB.add(new Player("Tim B", 1,  170, 66));
        timB.add(new Player("Tim B", 2,  167, 60));
        timB.add(new Player("Tim B", 3,  165, 59));
        timB.add(new Player("Tim B", 4,  166, 58));
        timB.add(new Player("Tim B", 5,  168, 58));
        timB.add(new Player("Tim B", 6,  175, 71));
        timB.add(new Player("Tim B", 7,  172, 68));
        timB.add(new Player("Tim B", 8,  171, 68));
        timB.add(new Player("Tim B", 9,  168, 65));
        timB.add(new Player("Tim B", 10, 169, 60));

        System.out.println("=== TIM B ===");
        for (Player p : timB) System.out.println(p);

        ArrayList<Integer> tinggiBadanTimB = new ArrayList<>();
        for (Player p : timB) tinggiBadanTimB.add(p.tinggiBadan);


        Collections.sort(tinggiBadanTimB);

        int result168 = Collections.binarySearch(tinggiBadanTimB, 168);
        int result160 = Collections.binarySearch(tinggiBadanTimB, 160);

        System.out.println("\ntinggi 168 cm : " +
            (result168 >= 0 ? "Ditemukan di index " + result168 : "Tidak ditemukan (" + result168 + ")"));
        System.out.println("tinggi 160 cm : " +
            (result160 >= 0 ? "Ditemukan di index " + result160 : "Tidak ditemukan (" + result160 + ")"));
    }
}