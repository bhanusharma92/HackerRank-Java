import java.util.Scanner;
class Quicksort{

    static void swap(int[] ar, int l, int r){
        int temp = ar[l];
        ar[l] = ar[r];
        ar[r] = temp;
    }

    static int partition(int ar[], int start, int end){
        int key = ar[end];
        int i = start - 1;
        int j = start;
        while(j < end){
            if(ar[j] < key){
                i++;
                swap(ar, i, j);
            }
            j++;
        }
        i++;
        swap(ar, i, end);
        return i;
    }
    static void quicksort(int[] ar, int start, int end){
        if(start < end){
            int p = partition(ar, start, end);
            quicksort(ar, start, p-1);
            quicksort(ar, p+1, end);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
        }

        System.out.println("Sequence before sorting: ");
        for(int i = 0; i < n; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        quicksort(ar,0, n-1);
        System.out.println("Sequencea after sorting: ");
        for(int i = 0; i < n; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}