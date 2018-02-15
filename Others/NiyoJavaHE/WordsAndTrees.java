import java.util.*;



class WordsAndTrees{


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, q;
        n = sc.nextInt();
        q = sc.nextInt();

        char[] chars = new char[n];
        for(int i = 0; i < n; i++){
            chars[i] = sc.next().trim().charAt(0);
        }

        // let me see the output
        /*for(int i = 0; i < n; i++){
            System.out.print(chars[i] + " ");
        }
        System.out.println();*/

        ArrayList<HashSet<Integer>> list = new ArrayList<HashSet<Integer>>(n);
        for(int i = 0; i < n; i++){
            list.add(i, new HashSet<Integer>());
        }

        for(int i = 0; i < n - 1; i++){
            int u, v;
            u = sc.nextInt() - 1;
            v = sc.nextInt() - 1;
            list.get(u).add(v);
            list.get(v).add(u);
        }


        for(int i = 0; i < n; i++){
            System.out.println("i: " + i);
            HashSet<Integer> l = list.get(i);
            for(Integer x: l){
                System.out.print(x + " ");
            }
            System.out.println();
        }

        for(int tc = 0; tc < q; tc++){
            int x = sc.nextInt();
            int s = sc.nextLine();

        }


    }
}