import java.util.Scanner;
class MergeSort{

    static void merge(int ar[], int start, int q, int end){
        int left[] = new int[q - start + 2];
        int right[] = new int[end - q + 1];
        for(int i=0; i < left.length - 1; i++){
            left[i] = ar[start+i];
        }
        left[q - start + 1] = Integer.MAX_VALUE;
        for(int i = 0; i < right.length - 1; i++){
            right[i] = ar[q+1+i];
        }
        right[end-q] = Integer.MAX_VALUE;
        int l,r;
        l = 0;
        r = 0;
        for(int i = 0; i < (end - start + 1); i++){
            if(left[l] < right[r]){
                ar[start+i] = left[l];
                l++;
            }else{
                ar[start+i] = right[r];
                r++;
            }
        }

    }

    static void mergesort(int ar[], int start, int end){
        if(start < end){
            int q = (start+end)/2;
            mergesort(ar, start, q);
            mergesort(ar, q+1, end);
            merge(ar, start, q, end);
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
        mergesort(ar,0, n-1);
        System.out.println("Sequencea after sorting: ");
        for(int i = 0; i < n; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}