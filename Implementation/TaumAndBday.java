import java.util.Scanner;
        import java.util.ArrayList;
class TaumAndBday{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long b[] = new long[t];
        long w[] = new long[t];
        long x[] = new long[t];
        long y[] = new long[t];
        long z[] = new long[t];

        // System.out.println("t = " + t);

        ArrayList<Long> arrayList = new ArrayList<Long>();

        for(int i = 0; i < t; i++){
            b[i] = sc.nextLong();
            w[i] = sc.nextLong();
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            z[i] = sc.nextLong();
        }

        long minXOrYValue = 0;
        String minXOrY  = "";




        for(int i = 0; i < t; i++){
            long a,bb,c;
            a = b[i] * x[i] + w[i] * y[i];
            bb = b[i] * x[i] + w[i] * (x[i] + z[i]);
            c = b[i] * (y[i] + z[i]) + w[i] * y[i];
            long min = a < bb ? (a < c ? a : c) : (bb < c ? bb : c);
            arrayList.add(min);
        }

        for(int i = 0; i < t; i++){
            System.out.println(arrayList.get(i));
        }
    }
}