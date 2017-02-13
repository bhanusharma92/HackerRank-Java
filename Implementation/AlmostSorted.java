import java.util.Scanner;
class AlmostSorted{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int copyArr[] = new int[n];
        int swapL, swapR;
        int reverseL, reverseR;
        swapL = swapR = reverseL = reverseR = -1;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            copyArr[i] = arr[i];
        }
        boolean isSorted = true;
        boolean swapSorted = true;
        boolean reverseSorted = true;

        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }

        if(!isSorted){
            int arrow1 = -1, arrow2 = -1;
            for(int i = 0; i < n - 1; i++){
                if(arr[i] > arr[i+1]){
                    arrow1 = i;
                    break;
                }
            }
            int min = Integer.MAX_VALUE;
            for(int i = arrow1 + 1; i < n; i++){
                if(min > arr[i]){
                    min = arr[i];
                    arrow2 = i;
                }
            }
            //System.out.println("arraow1: " + arrow1 + " arrow2: " + arrow2);
            int temp = copyArr[arrow1];
            copyArr[arrow1] = copyArr[arrow2];
            copyArr[arrow2] = temp;

            for(int i = 0; i < n - 1; i++){
                if(copyArr[i] > copyArr[i+1]) {
                    swapSorted = false;
                    break;
                }
            }
//            for(int i = 0; i < n; i++){
//                System.out.print(copyArr[i] + " ");
//            }

            if(swapSorted){
                swapL = arrow1 + 1;
                swapR = arrow2 + 1;
            }

        }


        if(!swapSorted){
            int arrow1 = -1, arrow2 = -1;
            for(int i = 0; i < n - 1; i++){
                if(arr[i] > arr[i+1]){
                    arrow1 = i;
                    break;
                }
            }
            for(int i = arrow1 + 1; i < n - 1; i++){
                 if(arr[i] < arr[i+1]){
                     arrow2 = i;
                     break;
                 }
            }
            for(int i = 0; i < arrow1; i++){
                if(arr[i] > arr[i+1]){
                    reverseSorted = false;
                    break;
                }
            }
            for(int i = arrow1; i < arrow2; i++){
                if(arr[i] < arr[i+1]){
                    reverseSorted = false;
                    break;
                }
            }
            for(int i = arrow2 + 1; i < n -1; i++){
                if(arr[i] > arr[i+1]){
                    reverseSorted = false;
                    break;
                }
            }
            if(arrow2 < n - 1){
                if(arr[arrow1] > arr[arrow2 + 1]){
                    reverseSorted = false;
                }
            }
            if(arrow1 > 0){
                if(arr[arrow2] < arr[arrow1 - 1]){
                    reverseSorted = false;
                }
            }
            if (reverseSorted) {
                reverseL = arrow1 + 1;
                reverseR = arrow2 + 1;
            }
        }

        if(isSorted){
            System.out.println("yes");
        }else if(swapSorted){
            System.out.println("yes");
            System.out.println("swap " + swapL + " " + swapR);
        }else if(reverseSorted){
            System.out.println("yes");
            System.out.println("reverse " + reverseL + " " + reverseR);
        }else{
            System.out.println("no");
        }

    }
}