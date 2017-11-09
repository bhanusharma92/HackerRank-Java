import java.util.Scanner;
import java.util.*;


public class Bfs{

    static void bfs(int graph[][], int s) throws Exception{
        int length = graph[0].length;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(s);

        boolean[] isVisited = new boolean[length];
        for (int i = 0; i < length; i++){
            isVisited[i] = false;
        }

        queue.add(s);
        isVisited[s] = true;
        while(!queue.isEmpty()){

            int v = queue.poll();
            System.out.println(v);

            for (int j = 0; j < graph[v].length; j++){
                if(graph[v][j] != 0 && !isVisited[j]){
                    queue.add(j);
                    isVisited[j] = true;
                }
            }
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of nodes : ");
        int n = sc.nextInt();
        int graph[][] = new int[n][n];
        System.out.println("Enter adjacency matrix: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                graph[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter source: ");
        int s = sc.nextInt();
        try{
            bfs(graph, s);
        }catch (Exception exception){
            System.out.println(exception);
        }


    }
}