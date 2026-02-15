package maths.digit;

public class Digits {
    public static void main(String[] args) {
        int n = 22423;
        int digit = 0;
        int count = 0;
        while(n > 0){
            digit = n % 10;
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
