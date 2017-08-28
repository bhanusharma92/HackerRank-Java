import java.util.Scanner;
import java.util.ArrayList;
class Vertex{
	int index;
	String status;
	int distance;
}
class BreadthFirstSearchShortestReach{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for(int query = 0; query < q; query++){
			int n = sc.nextInt();
			int m = sc.nextInt();
			Vertex vertex[] = new Vertex[n];
			int graph[][] = new int[n][n];
			int output[] = new int[n - 1];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					graph[i][j] = 0;
				}
			}
			for(int i = 0; i < m; i++){
				int u = sc.nextInt(); 
				int v = sc.nextInt();
				graph[u-1][v-1] = 1;
				graph[v-1][u-1] = 1;	
			}
			for(int i = 0; i < n; i++){
				vertex[i] = new Vertex();
				vertex[i].index = i;
				vertex[i].status = "unvisited";
				vertex[i].distance = -1;
			}

			/*System.out.println("adajency matrix: ");
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					System.out.print(graph[i][j] + " ");
				}
				System.out.println();
			}*/
			int s = sc.nextInt();
			

			ArrayList<Vertex> queue = new ArrayList<Vertex>();
			queue.add(vertex[s-1]);
			vertex[s-1].distance = 0;
			while(queue.size() != 0){
				Vertex front = queue.get(0);
				front.status = "visited";
				/*System.out.println("while called: \n\t" + "queue size(): " + queue.size() + "\n\t" 
					+ "front element: " + front.index + " " + front.status);	*/
				
				for(int i = 0; i < n; i++){
					if(graph[front.index][i] == 1 && vertex[i].status == "unvisited"){
						// System.out.println("vertex[graph[front.index][i]].status: " + vertex[graph[front.index][i]].status);
						vertex[i].distance = front.distance + 1;
						queue.add(vertex[i]);
					}
				}
				

				// System.out.print("index: " + front.index + " distance: " + front.distance);
				queue.remove(0);

			}

			/*System.out.println("Everyones distance");
			for(int vertex_i = 0; vertex_i < n; vertex_i++){
				System.out.print(vertex[vertex_i].distance + " ");
			}*/
			int j = 0;
			for(int i = 0; i < n; i++){
				if(i != s - 1){
					output[j] = vertex[i].distance;
					j++;
				}
			}

			for(int i = 0; i < n -1; i++){
				if(output[i] != -1)
					System.out.print(output[i] * 6 + " ");
				else
					System.out.print(output[i]  + " ");
			}


			System.out.println();
		}
	}
}