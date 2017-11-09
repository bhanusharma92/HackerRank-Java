import java.util.Scanner;
class LarrysArray{

    public static String solve(int n, int ar[]){
        return "yes";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] output = new String[t];
        for(int test_case = 0; test_case < t; test_case++){
            int n = sc.nextInt();
            int ar[] = new int[n];
            output[test_case] = solve(n, ar);
        }

        for(int test_case = 0; test_case < t; test_case++){
            System.out.println(output[test_case]);
        }
    }
}