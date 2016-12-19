import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }

        int maxA = a[0], minB = b[0];
        for(int i = 0; i < a.length; i++){
            if(maxA < a[i]){
                maxA = a[i];
            }
        }
        for(int i = 0; i < b.length; i++){
            if(minB > b[i]){
                minB = b[i];
            }
        }
        boolean flag1 = true, flag2 = true;

        for(int i = maxA; i <= minB; i++){
            for(int j = 0; j < a.length; j++){
                if(i % a[j] != 0){
                    flag1 = false;
                    break;
                }
            }

            for(int k = 0; k < b.length; k++){
                if(b[k] % i != 0){
                    flag2 = false;
                    break;
                }
            }

            if(flag1 && flag2){
                count++;
            }

            flag1 = flag2 = true;
        }

        System.out.println(count);

    }
}
