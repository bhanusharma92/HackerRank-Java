import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsExploration {

    static int checkEachSOS(String S, int index){
        int count = 0;
        if(S.charAt(index++) != 'S'){
            count++;

        }
        if(S.charAt(index++) != 'O'){
            count++;

        }
        if(S.charAt(index) != 'S'){
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int changedLetter = 0;
        for(int i = 0; i < S.length(); i += 3){

            changedLetter += checkEachSOS(S, i);

        }
        System.out.println(changedLetter);
    }
}
