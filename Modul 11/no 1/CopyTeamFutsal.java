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

public class CopyTeamFutsal {
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

        // Siapkan Tim C dengan ukuran sama seperti Tim B
        ArrayList<Player> timC = new ArrayList<>(Arrays.asList(new Player[timB.size()]));

        // Gunakan Collections.copy()
        Collections.copy(timC, timB);

        System.out.println("=== TIM B (Sumber) ===");
        for (Player p : timB) System.out.println(p);

        System.out.println("\n=== TIM C (Hasil Copy dari Tim B) ===");
        for (Player p : timC) System.out.println(p);
    }
}