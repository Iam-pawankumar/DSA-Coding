package Maths;

import java.util.Scanner;

public class isPrimeNumber {

    public static boolean isPrimeNumberOrNot(int num){

        if (num <= 0)
            return false;
        if (num == 2 || num == 3)
            return true;
        if (num%2 == 0 || num%3 == 0)
            return false;
        for (int i=2; i*i<num; i+=5)
            if (num%i == 0) {
                return false;
            }
        return true;
    }

    public static boolean isPrimeNumberOrNot1(int num){

        if (num <= 0)
            return false;
        if (num == 2 || num == 3)
            return true;
        if (num%2 == 0 || num%3 == 0)
            return false;
        for (int i=2; i*i<num; i+=6)
            if (num%i == 0 || num%(i+2) == 0) {
                return false;
            }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        if(isPrimeNumberOrNot(num))
            System.out.printf("Yes, %d is a Prime number", num).println();
        else {
            System.out.printf("No, %d is not a Prime number", num).println();
        }
    }
}
