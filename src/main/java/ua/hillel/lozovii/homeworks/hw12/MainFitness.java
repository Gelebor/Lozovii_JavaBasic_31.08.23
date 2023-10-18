package ua.hillel.lozovii.homeworks.hw12;

public class MainFitness {
    public static void main(String[] args) {
        FitnessTracker human1 = new FitnessTracker("Boris", "Johnson", 19, 6, 1964, "bj@abc.com", "+5968940940", 92, 120, 5400);
        System.out.println(human1.printAccountInfo());
        FitnessTracker human2 = new FitnessTracker("Mel", "Gibson", 3, 1, 1956, "mg@cab.com", "+396823450", 82, 130, 3400);
        System.out.println(human2.printAccountInfo());
        FitnessTracker human3 = new FitnessTracker("Mads", "Mikkelsen", 22, 11, 1965, "mm@bca.com", "+1968230940", 72, 135, 6500);
        System.out.println(human3.printAccountInfo());
        FitnessTracker human4 = new FitnessTracker("Jeffrey", "Bridges", 4, 12, 1949, "jb@xz.com", "+6968942345", 90, 121, 5600);
        System.out.println(human4.printAccountInfo());
        FitnessTracker human5 = new FitnessTracker("Javier", "Bardem", 1, 3, 1969, "jb@zx.com", "+8768940940", 80, 122, 6700);
        System.out.println(human5.printAccountInfo());

        System.out.println("\nChange info for Mads Mikkelsen:\n(birth date, surname, blood preasure, weight and day step count)");
        human3.setSurName("Arkham");
        human3.setBloodPreasure(150);
        human3.setWeight(75);
        human3.setStepCount(13000);
        System.out.println(human3.printAccountInfo());

        System.out.println("\nChange info for Jeffrey Bridges:\n(birth date, surname, blood preasure, weight and day step count)");
        human4.setSurName("Wayne");
        human4.setBloodPreasure(133);
        human4.setWeight(80);
        human4.setStepCount(25000);
        System.out.println(human4.printAccountInfo());
    }
}
