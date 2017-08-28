import java.util.Scanner;

class GridChallenge{

	static int partition(char grid[][], int row, int lo, int hi){
		int pivot = grid[row][hi];
		int i = lo - 1;
		for(int j = lo; j < hi; j++){
			if(grid[row][j] < pivot){
				i++;
				if(i != j){
						char temp = grid[row][i];
						grid[row][i] = grid[row][j];
						grid[row][j] = temp;
				}
				
			}
		}
		i++;
		char temp = grid[row][i];
		grid[row][i] = grid[row][hi];
		grid[row][hi] = temp;
		return i;
	}
	static void quicksort(char grid[][], int row, int lo, int hi){
		if(lo < hi){
			int p = partition(grid, row, lo, hi);
			quicksort(grid, row, lo, p - 1);
			quicksort(grid, row, p + 1 , hi);
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String ans[] = new String[t];
		for(int testCase = 0; testCase < t; testCase++){
			int n = sc.nextInt();
			boolean flag = true;
			char grid[][] = new char[n][n];
			for(int i = 0; i < n; i++){
				grid[i]=sc.next().toCharArray(); 
			}
			for(int row = 0; row < n; row++){
				quicksort(grid, row, 0, n - 1);
			}
			
			// for(int i = 0; i < n; i++){
			// 	for(int j = 0; j < n; j++){
			// 		System.out.print(grid[i][j]);
			// 	}
			// 	System.out.println();
			// }
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n - 1; j++){
					if(grid[j][i]  > grid[j+1][i]){
						flag = false;
						break;
					}
				}
			}
			if(flag){
				ans[testCase] = "YES";
			}else{
				ans[testCase] = "NO";
			}
		}
		for(int i = 0; i < t; i++){
			System.out.println(ans[i]);
		}
	}
}