import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        int index = 0;
        long countA = 0;
        int stringLength = s.length();
        for(int i = 0; i < stringLength; i++){
            if(s.charAt(i) == 'a')countA++;
        }
        //System.out.println(countA * n);
        int x = countA * (n % ())

    }
}
