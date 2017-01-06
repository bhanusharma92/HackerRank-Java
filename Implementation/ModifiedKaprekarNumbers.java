import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class ModifiedKaprekarNumbers{
    static boolean isKaprekarNumber(int num){
        int dNum = num;
        long square = (long)num * num;
        long dSquare = square;
        ArrayList<Integer> squareArray = new ArrayList<Integer>();
        ArrayList<Integer> numArray = new ArrayList<Integer>();
        int digits;
        long left = 0;
        long right = 0;

        while(dNum != 0){
            int rem = dNum % 10;
            numArray.add(rem);
            dNum = dNum / 10;
        }
        while(dSquare != 0){
            long rem = dSquare % 10;
            squareArray.add((int)rem);
            dSquare = dSquare / 10;
        }

        Collections.reverse(numArray);
        Collections.reverse(squareArray);

        digits = numArray.size();

        for(int i = squareArray.size() - digits; i < squareArray.size(); i++){
            left = left * 10 + squareArray.get(i);
        }
        for(int i = 0; i < squareArray.size() - digits; i++){
            right = right * 10 + squareArray.get(i);
        }

        if(left + right == num){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i = p; i <= q; i++){
            if(isKaprekarNumber(i)){
                arrayList.add(i);
            }
        }
        if(arrayList.size() == 0){
            System.out.println("INVALID RANGE");
        }else{
            for(int i = 0; i < arrayList.size(); i++){
                System.out.print(arrayList.get(i) + " ");
            }
        }
    }
}