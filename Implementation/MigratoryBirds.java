import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
class MigratoryBirds{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n = sc.nextInt();
        int ar[] = new int[n];
        int output;
        for(int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
            if(hm.containsKey((Integer)ar[i])){
                int valueOfPreexistingKey = hm.get((Integer)ar[i]);
                hm.put((Integer)ar[i],(Integer)(valueOfPreexistingKey+1));
            }else{
                hm.put((Integer)ar[i],(Integer)1);
            }
        }

        Map.Entry<Integer,Integer> firstEntry = hm.entrySet().iterator().next();
        Integer max = firstEntry.getValue();
        int index = 0;
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            /*if(value > max){
                arrayList.clear();
                arrayList.add(key);
            }else if(value == max){
                arrayList.add(key);
            }*/
            if(value >= max){
                max = value;
            }
            //System.out.println("key " + index + ": " + key);
            //System.out.println("value " + index + ": " + value);
            index++;
        }
        // System.out.println("max: " + max);
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            //System.out.println("-----------------");
            //System.out.println("value: " + value);
            //System.out.println("max: " + max);
            //System.out.println("value == max: " + (value == max));
            //System.out.println("-----------------");
            if(((Integer)value).intValue() == ((Integer)max).intValue()){
                //System.out.println("Add to arraylist");
                arrayList.add((Integer)key);
            }
        }


        Integer min = arrayList.get(0);
        for(int i = 0; i < arrayList.size(); i++){
            //System.out.println(i+": " + arrayList.get(i));
            if( arrayList.get(i) < min){
                min = arrayList.get(i);
            }
        }

        output = min;
        //System.out.println("hm.get((Integer)3): " + hm.get((Integer)3));
        //System.out.println("hm.get((Integer)3): " + hm.get((Integer)4));
        System.out.println(output);

        // testing code start
        /*int index = 0;
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key " + index + ": " + key);
            System.out.println("value " + index + ": " + value);
            index++;
        }*/


    }
}