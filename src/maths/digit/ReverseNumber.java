package maths.digit;

public class ReverseNumber {
    public static void main(String[] args) {
        int N = 87983;
        int digit = 0;
        int reverseNum = 0;

        System.out.println("Before:"+N);

        while(N>0){
            digit = N % 10; // removing digit from numbers
            reverseNum = reverseNum * 10 + digit; // calcualte and store reverseNumber;
            N = N / 10; //update
        }

        System.out.println("After:"+reverseNum);
    }
}
