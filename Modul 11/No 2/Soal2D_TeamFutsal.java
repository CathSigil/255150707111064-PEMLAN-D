package Praktikum11;
import java.util.*;

class Player {
    String team;
    int no;
    int tinggiBadan;
    int beratBadan;

    public Player(String team, int no, int tinggiBadan, int beratBadan) {
        this.team = team;
        this.no = no;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }
}

public class Soal2D_TeamFutsal {
    public static void main(String[] args) {

        ArrayList<Player> timA = new ArrayList<>();
        timA.add(new Player("Tim A", 1, 168, 50));
        timA.add(new Player("Tim A", 2, 170, 60));
        timA.add(new Player("Tim A", 3, 165, 56));
        timA.add(new Player("Tim A", 4, 168, 55));
        timA.add(new Player("Tim A", 5, 172, 60));

        ArrayList<Player> timB = new ArrayList<>();
        timB.add(new Player("Tim B", 1, 170, 66));
        timB.add(new Player("Tim B", 2, 167, 60));
        timB.add(new Player("Tim B", 3, 165, 59));
        timB.add(new Player("Tim B", 4, 166, 58));
        timB.add(new Player("Tim B", 5, 168, 58));

        ArrayList<Integer> tinggiB = new ArrayList<>();
        ArrayList<Integer> beratB = new ArrayList<>();

        for (Player p : timB) {
            tinggiB.add(p.tinggiBadan);
            beratB.add(p.beratBadan);
        }

        Collections.sort(tinggiB);
        Collections.sort(beratB);

        boolean tinggiSama = false;
        boolean beratSama = false;

        for (Player p : timA) {

            int cariTinggi = Collections.binarySearch(tinggiB, p.tinggiBadan);
            if (cariTinggi >= 0) {
                tinggiSama = true;
            }

            int cariBerat = Collections.binarySearch(beratB, p.beratBadan);
            if (cariBerat >= 0) {
                beratSama = true;
            }
        }

        // Hasil
        if (tinggiSama) {
            System.out.println("Ada pemain Tim A dan Tim B yang memiliki tinggi badan sama");
        } else {
            System.out.println("Tidak ada tinggi badan yang sama");
        }

        if (beratSama) {
            System.out.println("Ada pemain Tim A dan Tim B yang memiliki berat badan sama");
        } else {
            System.out.println("Tidak ada berat badan yang sama");
        }
    }
}