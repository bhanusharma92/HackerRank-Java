import java.util.Scanner;
class EvenTree{
	public static int countChild(int graph[][], int root){
		
	}
	public static void createForest(int graph[][], int root){
		
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int graph[][] = new int[n][n];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				graph[i][j] =  0;
			}
		}

		for(int i = 0; i < m; i++){
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			graph[u][v] = 1;
			graph[v][u] = 1;
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
	}
}