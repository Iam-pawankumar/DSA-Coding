package Maths;

public class CountDigits {

    public static int countDigits(long num){
        if (num/10 == 0)
            return 1;
        return 1 + countDigits(num/10) ;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(1));
    }
}
