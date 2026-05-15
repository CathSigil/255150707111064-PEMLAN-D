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

public class ArraylistTeamFutsal {
    public static void main(String[] args) {

        // ArrayList Tim A
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

        // ArrayList Tim B
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

        // Tampilkan Data Tim A
        System.out.println("=== TIM A ===");
        for (Player p : timA) System.out.println(p);

        // Tampilkan Data Tim B
        System.out.println("\n=== TIM B ===");
        for (Player p : timB) System.out.println(p);
    }
}