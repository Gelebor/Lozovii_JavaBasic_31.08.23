package ua.hillel.lozovii.homeworks.hw12.animal;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik", 7, "Black");
        Cat cat2 = new Cat("Barsik", 8, "Black");
        Cat cat3 = new Cat("Barsik", 7, "Black");

//        cat1.eat();

//        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));


//        cat.name = "Barsik";
//        cat.age = 7;
//
//        Dog dog = new Dog();
//        dog.eat();
//        dog.name = "Sharik";
//        dog.age = 5;
//
//
//        cat.meow();
//        dog.gau();

    }
}
