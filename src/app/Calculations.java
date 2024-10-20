package app;

public class Calculations {

    public void printSquare(long number) {
        System.out.println("Квадрат числа " + number + " дорівнює: " + (number * number));
    }

    public double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public String reverseString(String text) {
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length -i - 1] = temp;
        }
        return new String(charArray);
    }

    public long power(int a, int b) {
        return (long) Math.pow(a, b);
    }

    public void printTextMultipleTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.print(text + "\n");
        }
    }
}