import java.util.*;

class Dfs {

    static void dfsIterative(int graph[][], int s){
        int noOfNodes = graph[0].length;
        boolean isVisited[] = new boolean[noOfNodes];

        for(int i = 0 ;i < noOfNodes; i++){
            isVisited[i] = false;
        }

        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(s);
        isVisited[s] = true;

        while(!stack.isEmpty()){
            int v = stack.pop();
            System.out.println(v);
            for(int i = 0; i < noOfNodes; i++){
                if(graph[v][i] != 0 && !isVisited[v]){
                    stack.push(v);
                    isVisited[v] = true;
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no. of nodes: ");
        n = sc.nextInt();
        int graph[][] = new int[n][n];
        System.out.println("Enter adjacency matrix: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                graph[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter source: ");
        int s = sc.nextInt();
        System.out.println("output: ");
        dfsIterative(graph, s);
        

    }
}