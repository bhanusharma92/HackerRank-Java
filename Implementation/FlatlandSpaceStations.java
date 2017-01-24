import java.util.Scanner;
import java.util.Arrays;
class FlatlandSpaceStations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mArr[] = new int[m];
        boolean flag = false;
        for (int i = 0; i < m; i++) {
            mArr[i] = sc.nextInt();
        }
        Arrays.sort(mArr);
        int max = 1;
        for (int i = 0; i < m - 1; i++) {
            if (mArr[i + 1] - mArr[i] > max) {
                max = mArr[i + 1] - mArr[i];
            }
        }

        int maxDuplicate = ((int)Math.floor(max / 2));
        // System.out.println("before maxduplicate: " + maxDuplicate);
        if (mArr[0] - 0 > maxDuplicate) {
            maxDuplicate = mArr[0] - 0;
            flag = true;
        }
        if ((n - 1) - mArr[m - 1] > maxDuplicate) {
            maxDuplicate = (n - 1) - mArr[m - 1];
            flag = true;
        }
        // System.out.println("after maxduplicate: " + maxDuplicate);
        if (flag) {
            System.out.println(maxDuplicate);
        } else {
            System.out.println((int) Math.floor(max / 2));
        }

//        System.out.println();
//        for(int i =0; i < m; i++){
//            System.out.print(mArr[i] + " ");
//        }
    }
}