import java.util.Scanner;
import java.math.BigInteger;
class ExtraLongFactorials{
    static BigInteger factorial(int n){
        BigInteger bg = new BigInteger("1");
       // return bg;

        for(int i = 2 ; i <= n; i++){
            bg = bg.multiply(BigInteger.valueOf(i));
        }
        return bg;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}