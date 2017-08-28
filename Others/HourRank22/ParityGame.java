import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class MyInt{
    int num;
    MyInt(){

    }
    MyInt(int n){
        num = n;
    }
}

public class ParityGame {
    static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    static int smallestSizeSubsequence(int n, int[] A) {
        // Return the size of the smallest subsequence to remove
        int initialSum = 0;
        ArrayList<MyInt> al = new ArrayList<MyInt>();
        int result, currentSum;
        result = 0;
        
        boolean flag;
        for(int i = 0; i < n; i++){
            initialSum = initialSum + A[i];
        }
        currentSum = initialSum;
        // System.out.println("initialSum: " + initialSum);
        for(int i = 0; i < n; i++){
            if(!isEven(A[i])){

                al.add(new MyInt(i));
            }
        }
        int alInitialSize = al.size();
        /*for(int i = 0; i < al.size(); i++){
            System.out.println("al["+i+"] :" + al.get(i).num);
        }*/
        
        // System.out.println("isEven(currentSum): " + isEven(currentSum));
        while(!isEven(currentSum)){
            // System.out.println("inside while currentSum: " + currentSum);
            if(al.size() == 0){
                result = -1;
                break;
            }

            MyInt index = al.get(0);
            currentSum = currentSum - A[index.num];
            result++;
            al.remove(0);
        }

        if(alInitialSize == n && al.size()  == 0){
            return -1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int A_i = 0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int result = smallestSizeSubsequence(n, A);
        System.out.println(result);
    }
}
