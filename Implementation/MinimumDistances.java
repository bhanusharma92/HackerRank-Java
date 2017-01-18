import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class MinimumDistances{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    if(Math.abs(j - i) < min){
                        min = Math.abs(j - i);
                    }
                }
            }
        }
        if(min == Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(min);
        }
    }
}