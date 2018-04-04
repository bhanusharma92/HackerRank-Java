public class Pattern {
    public static void main(String[] args) {
        int n = 3;
        int x = n;
        for(int i = 1; i <= 2*n; i++){
            int numToPrint = (i > n)? x-- : i;
            for(int j = 1; j <= (numToPrint*2 - 1); j++){
                if(j % 2 == 0){
                    System.out.print("*");
                }else{
                    System.out.print(numToPrint);
                }

            }
            System.out.println();
        }
    }
}