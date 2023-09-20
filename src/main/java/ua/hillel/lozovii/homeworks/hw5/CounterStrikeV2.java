package ua.hillel.lozovii.homeworks.hw5;

import java.util.Scanner;

public class CounterStrikeV2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String errMsg1 = "Warning! Please, enter the integer.";
        String errMsg2 = "Warning! 2 teams have the same names.";

        int team1Pl1 = 0;
        int team1Pl2 = 0;
        int team1Pl3 = 0;
        int team1Pl4 = 0;
        int team1Pl5 = 0;

        System.out.print("Enter first team name: ");
        String team1Name = sc.nextLine();
        System.out.println("Enter the kill count for each team " + team1Name + " player.");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Player " + i + " from team " + team1Name + ": ");
            if (sc.hasNextInt()) {
                switch (i) {
                    case 1: {
                        team1Pl1 = sc.nextInt();
                        break;
                    }
                    case 2: {
                        team1Pl2 = sc.nextInt();
                        break;
                    }
                    case 3: {
                        team1Pl3 = sc.nextInt();
                        break;
                    }
                    case 4: {
                        team1Pl4 = sc.nextInt();
                        break;
                    }
                    case 5: {
                        team1Pl5 = sc.nextInt();
                        break;
                    }
                }
            } else {
                System.out.println(errMsg1);
                System.exit(0);
            }
        }

        double team1KillCount = (double) (team1Pl1 + team1Pl2 + team1Pl3 + team1Pl4 + team1Pl5) / 5;
        System.out.println("Average kill count by team " + team1Name + ": " + team1KillCount);

//        ============================================================================

        int team2Pl1 = 0;
        int team2Pl2 = 0;
        int team2Pl3 = 0;
        int team2Pl4 = 0;
        int team2Pl5 = 0;

        sc.nextLine();
        System.out.print("\nEnter second team name: ");
        String team2Name = sc.nextLine();
        if (team1Name.equals(team2Name)) {
            System.out.println(errMsg2);
            System.exit(0);
        }
        System.out.println("Enter the kill count for each team " + team2Name + " player.");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Player " + i + " from team" + team2Name + ": ");
            if (sc.hasNextInt()) {
                switch (i) {
                    case 1: {
                        team2Pl1 = sc.nextInt();
                        break;
                    }
                    case 2: {
                        team2Pl2 = sc.nextInt();
                        break;
                    }
                    case 3: {
                        team2Pl3 = sc.nextInt();
                        break;
                    }
                    case 4: {
                        team2Pl4 = sc.nextInt();
                        break;
                    }
                    case 5: {
                        team2Pl5 = sc.nextInt();
                        break;
                    }
                }
            } else {
                System.out.println(errMsg1);
                System.exit(0);
            }
        }

        double team2KillCount = (double) (team2Pl1 + team2Pl2 + team2Pl3 + team2Pl4 + team2Pl5) / 5;
        System.out.println("Average kill count by team " + team2Name + ": " + team2KillCount);

//        ============================================================================

        System.out.println("\nThe negative count means it is a friendly-fire.");
        System.out.println(team1Name + ": " + team1KillCount + "\n" + team2Name + ": " + team2KillCount);
        if (team1KillCount > team2KillCount) {
//            System.out.println("Team " + team1Name + " won! Point difference in favor of team " + team1Name + " is " + Math.abs((double) Math.round((team1KillCount - team2KillCount) * 100) / 100));
            System.out.println("Перемогла команда " + team1Name + ", набрала " + (double) (Math.round(team1KillCount * 100) / 100) + " очків");
        } else if (team1KillCount < team2KillCount) {
//            System.out.println("Team " + team2Name + " won! Point difference in favor of team " + team2Name + " is " + Math.abs((double) Math.round((team2KillCount - team1KillCount) * 100) / 100));
            System.out.println("Перемогла команда " + team2Name + ", набрала " + (double) (Math.round(team2KillCount * 100) / 100) + " очків");
        } else if (team1KillCount == team2KillCount) {
            System.out.println("The teams have equal points. It's a draw!");
        }
    }
}
