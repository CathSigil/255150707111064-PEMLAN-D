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

public class Soal2C_TeamFutsal {
    public static void main(String[] args) {

        ArrayList<Player> timA = new ArrayList<>();
        timA.add(new Player("Tim A", 1,  168, 50));
        timA.add(new Player("Tim A", 2,  170, 60));
        timA.add(new Player("Tim A", 3,  165, 56));
        timA.add(new Player("Tim A", 4,  168, 55));
        timA.add(new Player("Tim A", 5,  172, 60));
        timA.add(new Player("Tim A", 6,  170, 70));
        timA.add(new Player("Tim A", 7,  169, 66));
        timA.add(new Player("Tim A", 8,  165, 56));
        timA.add(new Player("Tim A", 9,  171, 72));
        timA.add(new Player("Tim A", 10, 166, 56));

        System.out.println("=== TIM A ===");
        for (Player p : timA) System.out.println(p);

        ArrayList<Integer> beratBadanTimA = new ArrayList<>();
        for (Player p : timA) beratBadanTimA.add(p.beratBadan);

        Collections.sort(beratBadanTimA);

        int result56 = Collections.binarySearch(beratBadanTimA, 56);
        int result53 = Collections.binarySearch(beratBadanTimA, 53);

        System.out.println("\nberat 56 kg : " +
            (result56 >= 0 ? "Ditemukan di index " + result56 : "Tidak ditemukan (" + result56 + ")"));
        System.out.println("berat 53 kg : " +
            (result53 >= 0 ? "Ditemukan di index " + result53 : "Tidak ditemukan (" + result53 + ")"));
    }
}