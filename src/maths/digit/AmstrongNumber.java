package maths.digit;

public class AmstrongNumber {
    public static void main(String[] args) {
        int number = 371;
        int digit =0;
        int sum =0;
        int isequal = number;
        while(number>0){
            digit = number % 10;
            sum += digit * digit * digit;
            number = number / 10;
        }
        if(sum == isequal){
            System.out.println(sum +" is an Amstrong number");
        }else {
            System.out.println(sum +" is not an Amstrong number");
        }
    }
}
