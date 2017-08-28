import java.util.Scanner;
class BirthdayCakeCandles{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i = 0; i < ar.length; i++){
			ar[i] = sc.nextInt();
		}
		int max = 0, count = 0;
		if(ar.length != 0){
			max = ar[0];
			count = 1;
		}

		if(ar.length > 1){
			for(int i = 1; i < n; i++){
			if(max < ar[i]){
				max = ar[i];
				count = 1;
			}
			else if(max == ar[i]){
				count++;
			}
		}
		}
		
		System.out.println(count);
	}
}