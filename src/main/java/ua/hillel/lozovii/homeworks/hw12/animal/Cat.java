package ua.hillel.lozovii.homeworks.hw12.animal;

public class Cat extends Animal {
    private String color;

    public Cat(String name) {
        super(name, 1);
        System.out.println("from Cat");
    }

    public Cat(String name, int age) {
        super(name, age);
        System.out.println("from Cat");
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    //    public Cat() {
//        super("", 0);
//        System.out.println("from Cat");
//    }

    public void meow() {
        System.out.println("meow meow meow");
    }

//    @Override
//    public void eat() {
//        super.eat();
//        System.out.println("Cat " + name + " eating...");
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        return (color != null ? color.equals(cat.color) : cat.color == null)
                && name.equals(cat.name)
                && age == cat.age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
