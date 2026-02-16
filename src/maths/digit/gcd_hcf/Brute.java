package maths.digit.gcd_hcf;




import static java.lang.Math.min;

public class Brute {
    public static void main(String[] args) {
        int n1 = 9;
        int n2 = 12;

        int gcd =0;
        for(int i=1;i<min(n1,n2);i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
