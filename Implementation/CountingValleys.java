import java.util.Scanner;
class CountingValleys{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        int numberOfValley = 0;
        int pos = 0;
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == 'U'){
                pos++;
            }else if(str.charAt(i) == 'D'){
                pos--;
            }

            if(pos==0 && str.charAt(i) == 'U'){
                numberOfValley++;
            }
        }
        System.out.println(numberOfValley);

    }

}