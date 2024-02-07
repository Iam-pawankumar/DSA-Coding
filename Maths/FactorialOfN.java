package Maths;

public class FactorialOfN {

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Factorial of "+ num +" is " + factorial(num));
    }
    public static int factorial(int  num){
        if (num > 0){
            return num * factorial(num-1);
        }
        return 1;
    }
}
