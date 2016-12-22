import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class SockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int temp;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(c[j] > c[j+1]){
                    temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
//        for(int i = 0; i < n; i++){
//            System.out.print(c[i] + " ");
//        }
        int matchingPair = 0;
        int index1 = 0, index2 = 0;
        while(index2 <= n){
            if(index2 == n){
                matchingPair += (index2-index1)/2;
                index2++;
            }
            else if(c[index1] == c[index2]){
                index2++;
            }else{
                matchingPair += (index2-index1)/2;
                index1 = index2++;
            }
        }

        System.out.println(matchingPair);
    }
}
