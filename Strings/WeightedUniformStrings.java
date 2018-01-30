import java.util.*;
class WeightedUniformStrings{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        long weight = 0;

        HashMap<Character, Integer>  charWt = new HashMap<Character, Integer>();
        for(int i = 0; i < 26; i++){
            char ch = (char)(97+i);
            charWt.put(ch, (i+1));
        }

       /* for(Map.Entry<Character, Integer> e : charWt.entrySet()) {
            Character key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key + " " + value);
        }*/

        HashSet<Long> hs = new HashSet<Long>();
        for(int i = 0; i < s.length(); i++){
            Character ch = s.charAt(i);
            if(i > 0 && (s.charAt(i) == s.charAt(i - 1))){
                weight += charWt.get(ch);
                hs.add(weight);
            }else{
                weight = charWt.get(ch);
                hs.add(weight);
            }
        }

        /*System.out.print("hashset: ");
        for(Long l: hs){
            System.out.print(l + " ");
        }
        System.out.println();*/

        for(int i = 0; i < n; i++){
            long l = sc.nextLong();
            if(hs.contains(l)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }
}