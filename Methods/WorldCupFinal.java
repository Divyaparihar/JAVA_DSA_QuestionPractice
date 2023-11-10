package methodsPractice;

import java.util.Scanner;

public class WorldCupFinal {

    public static String compareTeams(int NzScore, int NzSuperOver, int NzFours, int EngScore, int EngSuperOver, int EngFours) {
        if (NzScore > EngScore) {
            return "New Zealand";
        } else if (NzScore < EngScore) {
            return "England";
        } else if (NzSuperOver > EngSuperOver) {
            return "New Zealand";
        } else if (NzSuperOver < EngSuperOver) {
            return "England";
        } else if (NzFours > EngFours) {
            return "New Zealand";
        } else if (NzFours < EngFours) {
            return "England";
        } else {
            return "Error";
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NzScore = sc.nextInt();
        int NzSuperOver = sc.nextInt();
        int NzFours = sc.nextInt();

        int EngScore = sc.nextInt();
        int EngSuperOver = sc.nextInt();
        int EngFours = sc.nextInt();

        String winner = compareTeams(NzScore, NzSuperOver, NzFours, EngScore, EngSuperOver, EngFours);
        System.out.println(winner);
    }
}
