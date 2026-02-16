package maths.digit.gcd_hcf;

public class EuclideanAlgorithm {
    public static int findGcd(int a, int b){
        while(a > 0 && b > 0){

            if(a>b){
                a = b % a;

            }else {
                b = a % b;
            }
        }
        if(a == 0){
            return b;
        }else {
            return a;
        }
    }
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 15;

        int result = findGcd(n1,n2);
        System.out.println(result);
    }
}
