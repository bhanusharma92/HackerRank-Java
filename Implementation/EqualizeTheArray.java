import java.util.Scanner;
        import java.util.HashMap;
        import java.util.Map;
        import java.util.Iterator;
        import java.util.Set;
class EqualizeTheArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int maxOccurence = 0;
//        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
//        hmap.put(1,100);
//        hmap.put(2,200);
//
//        Set set = hmap.entrySet();
//        Iterator itr = set.iterator();
//        while(itr.hasNext()){
//            Map.Entry mentry = (Map.Entry)itr.next();
//            System.out.println("Key = " + mentry.getKey() + "Value = " + mentry.getValue());
//        }

        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        if(n > 0){
            hmap.put(arr[0], 1);
            for(int i = 1; i < n; i++){
                if(hmap.containsKey(arr[i])){
                    int tempValue = hmap.get(arr[i]);
                    tempValue++;
                    hmap.put(arr[i], tempValue);
                }else{
                    hmap.put(arr[i], 1);
                }
            }
            Set set = hmap.entrySet();
            Iterator itr = set.iterator();
            while(itr.hasNext()){
                Map.Entry mentry = (Map.Entry)itr.next();
                if(maxOccurence < (Integer)(mentry.getValue())){
                    maxOccurence = (Integer)(mentry.getValue());
                }
            }
            System.out.println(n - maxOccurence);

        }else{
            System.out.println(0);
        }

    }
}