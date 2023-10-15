package ua.hillel.lozovii.homeworks.hw12.animal;

public class Animal {
    public String name;
    public int age;

//    public Animal() {
//        System.out.println("from Animal");
//    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("from Animal");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void eat() {
        System.out.println("Animal eating...");
    }
}
