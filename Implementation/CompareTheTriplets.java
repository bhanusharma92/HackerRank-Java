import java.util.Scanner;
class CompareTheTriplets{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int aPoint = 0;
        int bPoint = 0;

        if(a0 > b0){
            aPoint++;
        }else if(a0 < b0){
            bPoint++;
        }

        if(a1 > b1){
            aPoint++;
        }else if(a1 < b1){
            bPoint++;
        }

        if(a2 > b2){
            aPoint++;
        }else if(a2 < b2){
            bPoint++;
        }

        System.out.println(aPoint + " " + bPoint);
    }
}