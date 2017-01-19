import java.util.Scanner;
class CavityMap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int copyArr[][] = new int[n][n];
        String str;
        for(int i = 0; i < n; i++){
            str = sc.next();
            for(int j = 0; j < n; j++){
                arr[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                copyArr[i][j] = arr[i][j];
            }
        }

        for(int i = 1; i < n - 1; i++){
            for(int j = 1; j < n - 1; j++){
                if(arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i+1][j] && arr[i][j] > arr[i][j-1]){
                    copyArr[i][j] = -1;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(copyArr[i][j] == -1) {
                    System.out.print("X");
                }else {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }

    }
}