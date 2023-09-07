package ua.hillel.lozovii.homeworks.hw2;

public class l2 {
    public static void main(String[] args) {
//        byte agePerson;
//        agePerson = 15;

        //Alt + Enter = check error on row;

        //primitive type of variable;
        byte agePerson = 22;
        //stack memory - processor caсhe;
        //heap memory - fast cache for string for example;

        byte ageCopy = agePerson;

        short shortVar = 12333;
        int intVar = 23422222;
        long longVar = 22222222222L;
        //+ l or L for long numbers;

        float floatVar = 11.1111111111111111F;
        //+ f or F for big float number;
        //out 6 digits after .;
        double doubleVar = 11.1111111111111111;
        //out 15 digits after .;
        //more accurate variable type;

        char chVar = 'A';
        //can contain only 1 symbol (0-65536);
        char chVar2 = 97; //decimal 'a';
        //by ASCII table (128);
        char chVar3 = '\u005E'; //0040 + 1E = 005E;
        //by Unicode (256);
        char chVar4 = '\u26A1';
        char chVar5 = '\u00b0';

        boolean isVehicle = false;
        boolean isRain = true;

        //reference type of variable;
        String strVar = "Hello World!";
        //heap memory;

        String str1 = "One";
        //create new string in string-pool;
        String str2 = "One";
        //use already created string by address in string-pool;
        String str3 = new String("One");
        //force create new cell for string "One";

        //garbage collector - clear garbage information from cache (automatic);

        String str4 = str1 + ", Two";
        //concatenation;

        byte bNum = 5;
        short shortNum = bNum;
        //automatic convertation variable types;
        //char to num (symbol position in ASCII table);

        int intNum = 55;
        byte byteTemp = (byte) intNum;
        //casting - force convertation;
        //can't casting boolean type
        //  or reference to primitive type
        //  or primitive to reference type;

        int intNum2 = 128;
        byte byteTemp2 = (byte) intNum2;
        //over-range (-128 - 127). Will be -128;
        //if -130 then will be 126;

        System.out.println(floatVar);
        //int by default;
        System.out.println(doubleVar);
        System.out.println(chVar);
        System.out.println(chVar2);
        System.out.println(chVar3);
        System.out.println(chVar4);
        System.out.println(chVar5);

        System.out.println("й");
        //settings, ncodings - win1251 \ UTF8

        System.out.println(isVehicle);
        System.out.println(isRain);
        System.out.println(strVar);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println(str1);
        System.out.println(str4);
    }
}
