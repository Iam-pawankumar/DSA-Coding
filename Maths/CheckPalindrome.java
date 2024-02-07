package Maths;

public class CheckPalindrome {

    public static boolean isPalindrome(int num){
        int reverse = 0;
        int temp = num;
        while (temp != 0) {
            reverse = reverse * 10 + (temp % 10);
            temp = temp/10;
        }
        return (reverse == num);
    }

    public static void main(String[] args) {
        int num = 7007007;
        if (isPalindrome(num))
            System.out.printf("Yes, %d is a Palindrome", num).println();
        else
            System.out.printf("NO, %d is not a Palindrome", num).println();
    }
}
