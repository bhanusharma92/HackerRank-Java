import java.util.*;

class SeparateTheNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
         for(int testCase = 0; testCase < q; testCase++){
            String s = sc.nextLine();
            int sLength = s.length();
            int si[] = new int[sLength];
            for(int i = 0; i < sLength; i++){
                si[i] = Character.getNumericValue(s.charAt(i));
            }

            for(int i = 0; i < sLength; i++){
                System.out.print(si[i] + " ");
            }
             System.out.println();

            for(int no)
        }

    }
}