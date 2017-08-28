import java.util.Scanner;

class MinimumAbsoluteDifferenceInAnArray {
	public static partition(){
		
	}
	public static quickSort(){

	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i = 0; i < n; i++){
			ar[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
			for(int j = i; j < n; j++){
				if(i != j){
					int diff =  Math.abs(ar[i] - ar[j]);
					if(diff < min){
						min = diff;
					}
				}
			}
		}
		System.out.println(min);
	}
}