import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AbsolutePermutation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int arr[] = new int[n];
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for(int i = 0; i < n; i++){
                arr[i] = (i + 1);
                arrayList.add((i + 1));
            }
            ArrayList<Integer> outputList = new ArrayList<Integer>();
            for(int i = 0; i < n; i++){
                for(int j = 0; j < arrayList.size(); j++) {
                    if (Math.abs(arr[i] - arrayList.get(j)) == k) {
                        outputList.add(arrayList.get(j));
                        arrayList.remove(new Integer(arrayList.get(j)));
                    }
                }
            }
            if(arrayList.size() == 0){
                for(int i = 0; i < outputList.size(); i++){
                    System.out.print(outputList.get(i) + " ");
                }
                System.out.println();
            }else{
                System.out.println("-1");
            }

        }
    }
}