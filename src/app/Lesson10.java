package app;

import java.util.Random;
import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {

        Calculations calc = new Calculations();
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введіть ціле число: ");
        long digit = scan.nextLong();
        calc.printSquare(digit);

        System.out.println("Введіть радіус: ");
        double radius = scan.nextDouble();
        System.out.println("Введіть висоту: ");
        double height = scan.nextDouble();
        double volume = calc.calculateCylinderVolume(radius, height);
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює "
                + volume);

        System.out.println("Введіть довжину масиву від 0 до 127: ");
        byte range = scan.nextByte();
        int[] array = new int[range];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt();
        }
        long sum = calc.sumArray(array);
        System.out.println("Сума всіх елементів масиву дорівнює " + sum);

        System.out.println("Введіть рядок: ");
        scan.nextLine();
        String sentence = scan.nextLine();
        String reverse = calc.reverseString(sentence);
        System.out.println("Рядок в зворотньому порядку: " + reverse);

        System.out.println("Введіть ціле число а: ");
        int a = scan.nextInt();
        System.out.println("Введіть ціле число b: ");
        int b = scan.nextInt();
        long pow = calc.power(a, b);
        System.out.println("Результат " + a + "^" + b + " дорівнює: " + pow + ".");

        System.out.println("Введіть ціле число а: ");
        int views = scan.nextInt();
        scan.nextLine();
        System.out.print("Введіть рядок: ");
        String line = scan.nextLine();
        scan.close();
        calc.printTextMultipleTimes(views, line);

    }
}
