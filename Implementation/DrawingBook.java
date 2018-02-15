import java.util.*;

class DrawingBook{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n, p;
        n = sc.nextInt();
        p = sc.nextInt();

        int turnStart = 0, turnEnd = 0, output;
        turnStart = p / 2;

        if(n % 2 == 0){
            if(p % 2 == 0){
                turnEnd = (n - p) / 2;
            }else{
                turnEnd = (n - (p - 1)) / 2;
            }
        }else{
            if(p % 2 == 0){
                turnEnd = (n - (p+1)) / 2;
            }else{
                turnEnd = n - p / 2;
            }
        }
        output = turnStart < turnEnd ? turnStart : turnEnd;
        System.out.println(output);
    }
}