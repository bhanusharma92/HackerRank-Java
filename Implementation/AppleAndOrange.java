import java.util.Scanner;
class AppleAndOrange{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int countApple = 0, countOrange = 0;
        int absDistance = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            //System.out.println("Loop count: " + apple_i);
            apple[apple_i] = in.nextInt();
            absDistance = a + apple[apple_i];
            //System.out.println("\tabsDistance: " + absDistance);
            if(absDistance >= s && absDistance <= t){
                countApple++;
               // System.out.println("\t\tInside if apple: countApple " + countApple);

            }

        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            absDistance = b + orange[orange_i];
            if(absDistance >= s && absDistance <= t){
                countOrange++;
            }
        }
        System.out.println(countApple);
        System.out.println(countOrange);


    }
}

