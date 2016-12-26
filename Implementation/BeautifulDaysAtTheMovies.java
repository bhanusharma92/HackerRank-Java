import java.util.Scanner;
import java.util.ArrayList;
class BeautifulDaysAtTheMovies{
    static int  reverse(int n){
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        while(n > 0){
            int rem = n % 10;
            arraylist.add(rem);
            n = n / 10;
        }
        int reversed = 0;
        try {
            for (int i = 0; i < arraylist.size(); i++) {
                reversed = (reversed * 10) + arraylist.get(i);
            }
        } catch(Exception e){
            System.out.println(e);
        }
        return reversed;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
         for(int index = i ; index <= j; index++){
            if(Math.abs(index - reverse(index)) % k == 0){
                count++;
            }
         }
         System.out.println(count);
    }
}