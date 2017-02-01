import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FairRations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for (int B_i = 0; B_i < N; B_i++) {
            B[B_i] = in.nextInt();
        }

        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = B[i];
        }
        int i = 0;
        int count = 0;
        while(i < arr.length - 1){
            if(arr[i] % 2 == 0){
                i++;
            }else{
                arr[i]++;
                count++;
                arr[i+1]++;
                count++;
                i++;
            }
        }
        if(arr[arr.length - 1] % 2 == 0){
            System.out.println(count);
        }else{
            System.out.println("NO");
        }
    }
}