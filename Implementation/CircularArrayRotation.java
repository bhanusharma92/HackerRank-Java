import java.util.Scanner;
class CircularArrayRotation{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        int aCopy[] = new int[n];
        int m[] = new int[q];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            aCopy[a_i] = a[a_i];
        }

        for(int a0 = 0; a0 < q; a0++){
             m[a0] = in.nextInt();
        }

        int count = 0, index = k;
        while(count < n){
            if(index >= n){
                index = index % n;
            }
            a[index] = aCopy[count];
            index++;
            count++;
        }
        for(int i= 0; i < q; i++){
            System.out.println(a[m[i]]);
        }


    }
}