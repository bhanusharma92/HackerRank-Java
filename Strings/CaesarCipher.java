import java.io.*;
import java.util.*;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();

        for(int i = 0; i < n; i++){
            if((int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90){
                if ((int)s.charAt(i) + k <= 90) {
                    System.out.print((char)((int)s.charAt(i) + k));
                }else{
                    System.out.print((char)(64 + Math.abs(90 - ((int)s.charAt(i) + k))));
                }
            }else if((int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 122){
                if ((int)s.charAt(i) + k <= 122) {
                    System.out.print((char)((int)s.charAt(i) + k));
                }else{
                    System.out.print((char)(96 + Math.abs(122 - ((int)s.charAt(i) + k))));
                }
            }else{
                System.out.print((char)s.charAt(i));
            }
        }

    }
}