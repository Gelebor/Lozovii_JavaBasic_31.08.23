package ua.hillel.lozovii.homeworks.hw4;

public class l4Math {
    public static void main(String[] args) {
        System.out.println(Math.PI);

        System.out.println(Math.abs(10));       //module
        System.out.println(Math.abs(-10.043));  //module

        //write .sout after method !!1

        System.out.println(Math.pow(2, 3));    // ^ -  out as double

        System.out.println(Math.sqrt(8));      // root^2
        System.out.println(Math.sqrt(16));

        System.out.println(Math.round(5.234));  //round == round =) by first .number
        System.out.println(Math.round(5.734));
        System.out.println(Math.round(5.49));   // !

        System.out.println(Math.min(-10, 10));  //min
        System.out.println(Math.max(-10, 10));  //max

        System.out.println(Math.random());      //random. [0.0-1)
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());

        System.out.println((int) (Math.random() * 11));          // [0-10]

        System.out.println((int) (Math.random() * 21) + 15);     // [15-35]
        System.out.println((int) (Math.random() * 21) + 15);
        System.out.println((int) (Math.random() * 21) + 15);
        System.out.println((int) (Math.random() * 21) + 15);
        System.out.println((int) (Math.random() * 21) + 15);

        int min = 15;
        int max = 35;

        System.out.println("--------------Formula--------------");
        System.out.println((int) (Math.random() * (max - min + 1)) + min);
        System.out.println((int) (Math.random() * (max - min + 1)) + min);
        System.out.println((int) (Math.random() * (max - min + 1)) + min);
        System.out.println((int) (Math.random() * (max - min + 1)) + min);
        System.out.println((int) (Math.random() * (max - min + 1)) + min);
        System.out.println((int) (Math.random() * (max - min + 1)) + min);
    }
}
