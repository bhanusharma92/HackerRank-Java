import java.util.Scanner;
class BreakingTheRecords{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i = 0; i < n; i++){
			ar[i] = sc.nextInt();
		}
		int max = -1, min = -1;
		int countL = 0, countH = 0;
		if(ar.length > 0){
			max = min = ar[0];
		}
		for(int i = 0; i < n; i++){
			if(ar[i] > max){
				max = ar[i];
				countH++;
			}
			else if(ar[i] < min){
				min = ar[i];
				countL++;
			}
		}

		System.out.println(countH + " " + countL);
	}
}