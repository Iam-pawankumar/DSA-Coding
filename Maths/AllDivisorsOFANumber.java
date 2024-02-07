package Maths;

public class AllDivisorsOFANumber {

    public static void printAllDivisors(int n){
        for (int i = 1; i*i<=n ; i++) {
            if (n%i==0) {
                System.out.println(i + " ");
                if (i != n / i)
                    System.out.println(n / i);
            }
        }
    }

    public static void printAllDivisorsInOrder(int n){
        int i;
        for (i = 1; i*i<=n ; i++) {
            if (n%i==0) {
                System.out.println(i + " ");
            }
        }
        for ( ; i>=1 ; i--) {
            if (n%i==0) {
                System.out.println(n/i);
            }
        }
    }



    public static void main(String[] args) {
        printAllDivisors(15);
        printAllDivisorsInOrder(15);
    }
}
