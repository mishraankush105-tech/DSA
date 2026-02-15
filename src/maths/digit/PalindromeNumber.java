package maths.digit;

public class PalindromeNumber {
    //function to check if the given integer is palindrom or not
    public boolean palindrom(int n){
        int digit = 0;//Initialize a  variable to store digit the reverse of the number
        int reverseNumber = 0; //Initailize a vaiable to store reverse number
        int duplicate = n;//create a duplicate variable to store origin number

        while(n > 0){
            digit = n % 10;
            reverseNumber = reverseNumber * 10 + digit;
            n = n/10;
        }
        return duplicate == reverseNumber;
    }
    public static void main(String[] args) {
        int N = 121; // example number
        PalindromeNumber obj = new PalindromeNumber();
        if(obj.palindrom(N)){ // check if number is palindrom or not
            System.out.println(N +" is an Palindrom Number");
        }else {
            System.out.println(N +" is not Palindrom Number");
        }
    }
}
