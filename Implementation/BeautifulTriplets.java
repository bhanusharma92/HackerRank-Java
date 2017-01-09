import java.util.Scanner;
class BeautifulTriplets{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[j] - arr[i] == d){
                    for(int k = j + 1; k < n; k++){
                        if(arr[k] - arr[j] == d){
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);

    }
}