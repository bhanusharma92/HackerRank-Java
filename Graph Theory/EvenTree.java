import java.util.*;
class EvenTree{

	@SuppressWarnings("unchecked")
	static int bfs(Map hm, int root, int otherNode){
		int count = 0;
		try {
			LinkedList<Integer> queue = new LinkedList<Integer>();
			ArrayList<Integer> al = new ArrayList<Integer>();
			count = 0;
			queue.offer(root);

			while (!queue.isEmpty()) {
                Integer head = queue.poll();
                al.add(head);
                count++;
                LinkedHashSet<Integer> set = (LinkedHashSet<Integer>) hm.get(head);
                if(set!=null){
                    for (Integer i : set) {
                        if (!al.contains(i) && (i != otherNode)) {
                            queue.offer(i);
                        }
                    }
                }
            }
		} catch (java.lang.Exception exception) {
			exception.printStackTrace();
		}

		return count;
    }

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		Map<Integer, LinkedHashSet<Integer>> hm = new HashMap<Integer, LinkedHashSet<Integer>>();
		for(int i = 0; i < m; i++){
			int u = sc.nextInt();
			int v = sc.nextInt();

			if(hm.containsKey(u)){
                LinkedHashSet<Integer> list = hm.get(u);
			    list.add(v);
            }else{
                LinkedHashSet<Integer> list = new LinkedHashSet<Integer>();
			    list.add(v);
			    hm.put(u, list);
            }


            if(hm.containsKey(v)){
                LinkedHashSet<Integer> list = hm.get(v);
                list.add(u);
            }else{
                LinkedHashSet<Integer> list = new LinkedHashSet<Integer>();
                list.add(u);
                hm.put(v, list);
            }
		}

		// int root = sc.nextInt();
		// int otherNode = sc.nextInt();
		// int noOfNodes = bfs(hm, root, otherNode);
        // System.out.println("noOfNodes: " + noOfNodes);
        int count = 0;
        for(Integer i: hm.keySet()){
            System.out.println("Key: "+ i + "\n");
            HashSet<Integer> hs = hm.get(i);
            for(Integer j : hs){
                System.out.print("\t"+j + " ");
            }

        }
        System.out.println();
        for(Integer i: hm.keySet()){
            // System.out.println("Key: "+ i);
            HashSet<Integer> hs = hm.get(i);
            for(Integer j : hs){
                // System.out.print("\t"+j + " ");
                if(bfs(hm, i, j) % 2 == 0){
                    count++;
                }
                hm.get(j).remove(i);
            }

        }
        System.out.println(count);



	}
}