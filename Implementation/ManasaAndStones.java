import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
// this solution is working, but since it is brute force -> result is timeout for most of the test cases
class Node{
    int item;
    Node left;
    Node right;
    Node(){
        item = 0;
        left = null;
        right = null;
    }

    Node(int i){
        item = i;
        left = null;
        right = null;
    }

}

class ManasaAndStones{
    static void depthFirstSearch(Node root, Map<Integer, Integer> map){

        Node node = root;
        if(node.left != null && node.right != null){
            depthFirstSearch(node.left, map);
            depthFirstSearch(node.right, map);
        }
        if(node.left == null){
            if(!map.containsKey(node.item)){
                map.put(node.item, 0);
            }
        }
        if(node.right == null){
            if(!map.containsKey(node.item)){
                map.put(node.item, 0);
            }
        }


    }
    static void preorderTraversal(Node root){
        if(root != null){
            System.out.print(root.item + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }
    static void inorderTraversal(Node root){
        if(root != null){
            inorderTraversal(root.left);
            System.out.print(root.item + " ");
            inorderTraversal(root.right);
        }
    }
    static void postorderTraversal(Node root){
        if(root != null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.item + " ");
        }
    }

    static void insertAtLeaf(Node root, int a, int b){
        Node node = root;
        Node newNode1 = new Node();
        Node newNode2 = new Node();

        if(node.left != null && node.right != null){
            insertAtLeaf(node.left, a, b);
            insertAtLeaf(node.right, a, b);
        }
        if(node.left == null){
            newNode1.item = node.item + a;
            node.left = newNode1;
        }
        if(node.right == null){
            newNode2.item = node.item + b;
            node.right = newNode2;
        }
    }
    static void createTree(int t, int n[], int a[], int b[]){
        Node root = new Node();
        for(int i = 0; i < n[t] - 1; i++){
            insertAtLeaf(root, a[t], b[t]);
        }
//        System.out.println("Preorder traversal");
//        preorderTraversal(root);
//        System.out.println("\nInorder traversal");
//        inorderTraversal(root);
//        System.out.println("\nPostorder traversal");
//        postorderTraversal(root);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        depthFirstSearch(root,map);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            arrayList.add(entry.getKey());
        }
        Collections.sort(arrayList);
        for(int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n[] = new int[t];
        int a[] = new int[t];
        int b[] = new int[t];
        for(int i = 0; i < t; i++){
            n[i] = sc.nextInt();
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for(int i_t = 0; i_t < t; i_t++) {
            createTree(i_t, n, a, b);
            System.out.println();
        }
    }
}