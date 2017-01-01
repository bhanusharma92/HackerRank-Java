import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppendAndDelete {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int count = 0;
        int i;
        if(s == t){
            System.out.println("Yes");
        }else{
            // main logic here
            int minLength = s.length() < t.length() ? s.length() : t.length();
            for(i = 0; i < minLength; i++){
                if(s.charAt(i) != t.charAt(i)){
                    break;
                }
            }

            if(i == minLength - 1) {
                count = s.length() - i - 1 + t.length() - i - 1;
            }else{
                count = s.length() - i+ t.length() - i;
            }

            if(count <= k){
                if(k - s.length() > count){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }

            }else{
                System.out.println("No");
            }
        }
    }
}