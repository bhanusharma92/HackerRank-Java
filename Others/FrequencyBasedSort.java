import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class FrequencyBasedSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 0;
        int index = 0;
        while(i < arr.length){
            // System.out.println("i = " + i);
            if(i == 0){
                //System.out.println("inside if i == 0");
                arrayList1.add(arr[i]);
                arrayList2.add(1);
            }else {
                if(arr[i] == arr[i -1]){
                    //System.out.println("inside " + "arr[" + i + "]" + "==" + "arr[" + (i - 1) + "]");
                    int temp = arrayList2.get(index);
                    arrayList2.set(index,++temp);
                    // arrayList2.add(index) = arrayList2.get(index) + 1;
                }else{
                    //System.out.println("inside else else");
                    index++;
                    arrayList1.add(arr[i]);
                    arrayList2.add(1);
                }
            }
            i++;
        }




        System.out.println("before");
        //System.out.println("arrayList1 length: " + arrayList1.size());
        for(int j = 0; j < arrayList1.size(); j++){
            System.out.print(arrayList1.get(j) + " ");
        }
        System.out.println();
        //System.out.println("arrayList2 length: " + arrayList2.size());
        for(int j = 0; j < arrayList2.size(); j++){
            System.out.print(arrayList2.get(j) + " ");
        }

        for(int j = 0; j < arrayList1.size(); j++){
            for(int k = 0; k < arrayList1.size() - 1; k++){
                if(arrayList2.get(k) > arrayList2.get(k + 1)){
                    int temp1,temp2;
                    temp1 = arrayList1.get(k);
                    arrayList1.set(k,arrayList1.get(k+1));
                    arrayList1.set(k+1, temp1);

                    temp2 = arrayList2.get(k);
                    arrayList2.set(k,arrayList2.get(k+1));
                    arrayList2.set(k+1, temp2);
                }
            }
        }

        System.out.println("\nafter");
        for(int j = 0; j < arrayList1.size(); j++){
            System.out.print(arrayList1.get(j) + " ");
        }
        System.out.println();
        //System.out.println("arrayList2 length: " + arrayList2.size());
        for(int j = 0; j < arrayList2.size(); j++){
            System.out.print(arrayList2.get(j) + " ");
        }

        System.out.println("\nOutput");
        for(int j = 0; j < arrayList1.size(); j++){
            System.out.print(arrayList1.get(j) + " ");
        }


    }
}