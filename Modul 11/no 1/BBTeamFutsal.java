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

public class BBTeamFutsal{
    public static void main(String[] args) {

        ArrayList<Player> semua = new ArrayList<>();

        // Tim A
        semua.add(new Player("Tim A", 1,  168, 50));
        semua.add(new Player("Tim A", 2,  170, 60));
        semua.add(new Player("Tim A", 3,  165, 56));
        semua.add(new Player("Tim A", 4,  168, 55));
        semua.add(new Player("Tim A", 5,  172, 60));
        semua.add(new Player("Tim A", 6,  170, 70));
        semua.add(new Player("Tim A", 7,  169, 66));
        semua.add(new Player("Tim A", 8,  165, 56));
        semua.add(new Player("Tim A", 9,  171, 72));
        semua.add(new Player("Tim A", 10, 166, 56));

        // Tim B
        semua.add(new Player("Tim B", 1,  170, 66));
        semua.add(new Player("Tim B", 2,  167, 60));
        semua.add(new Player("Tim B", 3,  165, 59));
        semua.add(new Player("Tim B", 4,  166, 58));
        semua.add(new Player("Tim B", 5,  168, 58));
        semua.add(new Player("Tim B", 6,  175, 71));
        semua.add(new Player("Tim B", 7,  172, 68));
        semua.add(new Player("Tim B", 8,  171, 68));
        semua.add(new Player("Tim B", 9,  168, 65));
        semua.add(new Player("Tim B", 10, 169, 60));

        // Ascending
        Collections.sort(semua, (a, b) -> a.beratBadan - b.beratBadan);
        System.out.println("=== Berat Badan - ASCENDING ===");
        for (Player p : semua) System.out.println(p);

        // Descending
        Collections.sort(semua, (a, b) -> b.beratBadan - a.beratBadan);
        System.out.println("\n=== Berat Badan - DESCENDING ===");
        for (Player p : semua) System.out.println(p);
    }
}