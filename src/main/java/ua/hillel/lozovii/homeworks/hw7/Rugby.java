package ua.hillel.lozovii.homeworks.hw7;

//import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {
        int teamSize = 25;
        int ageFrom = 18;
        int ageTo = 40;

        int[] team1 = new int[teamSize];
        int[] team2 = new int[teamSize];
        int tempMidAge1 = 0;
        int tempMidAge2 = 0;

        for (int i = 0; i < teamSize; i++) {
            team1[i] = (int) ((Math.random() * (ageTo - ageFrom + 1) + ageFrom));
            tempMidAge1 += team1[i];
            team2[i] = (int) ((Math.random() * (ageTo - ageFrom + 1) + ageFrom));
            tempMidAge2 += team2[i];
        }

        System.out.print("Team 1 age range: ");
        for (int i = 0; i < teamSize; i++) {
            if (i == teamSize - 1) {
                System.out.print(team1[i] + ".");
            } else {
                System.out.print(team1[i] + ", ");
            }
        }
//        System.out.println(Arrays.toString(team1).substring(1, (Arrays.toString(team1).length()) - 1));
        System.out.println("\nAverage age of first team players = " + (Math.round((double) tempMidAge1 / teamSize * 100) / 100.0));

        System.out.print("\nTeam 2 age range: ");
        for (int i = 0; i < teamSize; i++) {
            if (i == teamSize - 1) {
                System.out.print(team2[i] + ".");
            } else {
                System.out.print(team2[i] + ", ");
            }
        }
//        System.out.println(Arrays.toString(team2).substring(1, (Arrays.toString(team2).length()) - 1));
        System.out.println("\nAverage age of second team players = " + (Math.round((double) tempMidAge2 / teamSize * 100) / 100.0));
    }
}
