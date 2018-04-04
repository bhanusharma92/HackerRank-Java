import java.util.Scanner;

class RichieRich{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, k, changeCount = 0;
        n = sc.nextInt();
        k = sc.nextInt();
        String str = sc.next();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Character.getNumericValue(str.charAt(i));
        }

        for(int i = 0; i < n ; i++){
            System.out.println(arr[i]);
        }

        int half = n / 2;
        for(int i = 0; i < half; i++){
            if(changeCount >= k)break;
            if(arr[i] != arr[n-1-i]){
                int big = arr[i] < arr[n-1-i] ? arr[n-1-i] : arr[i];
                if(big == arr[i]){
                    arr[n-1-i] = arr[i];
                    changeCount++;
                }else{
                    arr[i] = arr[n-1-i];
                    changeCount++;
                }
            }
        }



    }
}