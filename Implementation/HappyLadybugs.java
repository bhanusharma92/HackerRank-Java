import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HappyLadybugs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        ArrayList<String> arrayList = new ArrayList<String>();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();
            if(b.indexOf('_') > -1){
                HashMap<Character, Integer> hp = new HashMap<Character, Integer>();
                for (int i = 0; i < b.length(); i++){
                    if(b.charAt(i) != '_'){
                        if(hp.containsKey(b.charAt(i))){
                            int value = hp.get(b.charAt(i));
                            hp.put(b.charAt(i), ++value);
                        }else{
                            hp.put(b.charAt(i), 1);
                        }
                    }
                }
                if(hp.containsValue(1)){
                    arrayList.add("NO");
                }else{
                    arrayList.add("YES");
                }
            }else{
                boolean flag = true;
                if (b.length() > 1) {
                    if(b.charAt(0) != b.charAt(1)){
                        flag = false;

                    }
                }else{
                    flag = false;
                }
                if (b.length() > 1) {
                    if(b.charAt(n - 1) != b.charAt(n - 2)){
                        flag = false;
                    }
                }
                for(int i = 1; i < n - 1; i++){
                    if(b.charAt(i) == b.charAt(i - 1) || b.charAt(i) == b.charAt(i+1)){

                    }else{
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    arrayList.add("YES");
                }else{
                    arrayList.add("NO");
                }
            }
        }
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
