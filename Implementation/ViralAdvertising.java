import java.util.Scanner;
class ViralAdvertising{
    static int iThDay(int m){
        int  half = (m / 2);
        return half * 3 ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 2;
        if(n == 1){
            System.out.println("2");
        }else {
            int m = 5;
            for (int i = 2; i <= n; i++) {
                m = iThDay(m);

                count += m / 2;
            }
            System.out.println(count);
        }
    }
}