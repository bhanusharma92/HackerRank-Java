import java.util.Scanner;
class RepeatedString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long n = sc.nextLong();
        int sLength = s.length();
        int numOfA = 0;
        for(int i = 0; i < sLength; i++){
            if(s.charAt(i) == 'a'){
                numOfA++;
            }
        }
        // System.out.println("numOfA = " + numOfA);
        double numOfOccurenceOfSMin = Math.floor(((double)(n)) / ((double)sLength));
        double numOfOccurenceOfSMax = Math.ceil(((double)(n)) / ((double)sLength));
        // System.out.println("numOfOccurenceOfSMin = " + numOfOccurenceOfSMin);
        // System.out.println("numOfOccurenceOfSMax = " + numOfOccurenceOfSMax);
        long count = ((long)numOfOccurenceOfSMin) * numOfA;
        // System.out.println("count = " + count);
        long x = ((long)(numOfOccurenceOfSMin)) * sLength;
        // System.out.println("x = " + x);
        // System.out.println("n - x = " + (n - x));
        for(int i = 0; i < (n - x) ; i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}