import java.util.Scanner;
class BonAppetit{
    public static void main(String args[]){
        int n,k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int c[] = new int[n];
        for(int i = 0; i < n; i++){
            c[i] = sc.nextInt();
        }
        int bCharged = sc.nextInt();

        int costAtK = c[k];
        int totalCost = 0;
        for(int i = 0; i < n; i++){
            totalCost += c[i];
        }
        int bActual = (totalCost - costAtK) / 2;
        if(bActual == bCharged){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(bCharged - bActual);
        }
    }
}