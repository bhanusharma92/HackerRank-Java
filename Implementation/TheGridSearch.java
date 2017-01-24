import java.util.Scanner;
class TheGridSearch{
    static String searchGrid(int R, int C, int G[][], int r, int c, int P[][]){
        String output = "YES";
        boolean flag = true;
        firstLoop:
        for(int i = 0; i < R - r + 1; i++){
            for(int j = 0; j < C - c + 1; j++){

                thirdLoop:
                for(int ii = 0; ii < r; ii++){
                    for(int jj = 0; jj < c; jj++){
                        if(G[i + ii][j + jj] != P[ii][jj]){
                            output = "NO";
                            flag = false;
                            break thirdLoop;
                        }
                    }
                }
                if(flag){
                    output = "YES";
                    break firstLoop;
                }
                flag = true;
            }
        }
        return output;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t;

        String str;
        t = sc.nextInt();
        String output[] = new String[t];
        for(int k = 0; k < t; k++){
            int R, C, r, c;
            R = sc.nextInt();
            C  = sc.nextInt();
            int G[][] = new int[R][C];


            for(int i = 0; i < R; i++){
                str = sc.next();
                for(int j = 0; j < C; j++){
                    G[i][j] = Character.getNumericValue(str.charAt(j));
                }
            }
            r = sc.nextInt();
            c= sc.nextInt();
            int P[][] = new int[r][c];
            for(int i = 0; i < r; i++){
                str = sc.next();
                for(int j = 0; j < c; j++){
                    P[i][j] = Character.getNumericValue(str.charAt(j));
                }
            }
            output[k] = searchGrid(R, C, G, r, c, P);
        }
        for(int i = 0; i < t; i++){
            System.out.println(output[i]);
        }
    }
}