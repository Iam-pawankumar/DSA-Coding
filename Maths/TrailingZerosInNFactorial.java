package Maths;

public class TrailingZerosInNFactorial {

    public static int countTrailingZeros(int num) {
        if (num < 0)
            return -1;
        int count = 0;
        for (int i = 5; num/i >= 1; i = i * 5) {
            count += num/i;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Trailing zeros in " + num + "! is : " + countTrailingZeros(num));
    }
}
