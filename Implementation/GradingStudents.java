import java.util.Scanner;
class GradingStudents{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        int out[] = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            int q = ar[i] / 5;
            if(ar[i] < 38){
                out[i] = ar[i];
            }else if(ar[i] % 5 == 0){
                out[i] = ar[i];
            }else if((q+1) * 5 - ar[i] < 3){
                out[i] = (q+1) * 5;
            }else{
                out[i] = ar[i];
            }
        }

        for(int i =0; i < n; i++){
            System.out.println(out[i]);
        }
    }
}