import java.util.Scanner;
class Encryption{

    static StringBuilder returnOutputString(StringBuilder str){
        StringBuilder outStr = new StringBuilder(str);
        int i = 0, j = 1;
        int k = outStr.length() - 1;
        while(true){
            if(!((outStr.charAt(k) >= 'a' && outStr.charAt(k) <= 'z') || (outStr.charAt(k) >= 'A' && outStr.charAt(k) <= 'Z'))){
                outStr.deleteCharAt(k);
                k = outStr.length() - 1;
            }else{
                break;
            }
        }
        while(j < outStr.length()){
            if(!((outStr.charAt(i) >= 'a' && outStr.charAt(i) <= 'z') || (outStr.charAt(i) >= 'A' && outStr.charAt(i) <= 'Z'))
                    &&
                    !((outStr.charAt(j) >= 'a' && outStr.charAt(j) <= 'z') || (outStr.charAt(j) >= 'A' && outStr.charAt(j) <= 'Z'))){
                outStr.deleteCharAt(i);
            }else {
                i++;
                j++;
            }
        }

        return outStr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        while(i < str.length()){
            if(str.charAt(i) == ' '){
                str.deleteCharAt(i);
            }else{
                i++;
            }
        }
        int strLength = str.length();
        double sqrtFloor = Math.floor(Math.sqrt(strLength));
        double sqrtCeil = Math.ceil(Math.sqrt(strLength));
        int row = (int)sqrtFloor;
        int column = (int) sqrtCeil;
        if( row * column < strLength){
            row++;
        }
        int arr[][] = new int[row][column];

        int countChar = 0;
        for(i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(countChar < strLength){
                    arr[i][j] = str.charAt(countChar);
                    countChar++;

                }
            }
        }


        countChar = 0;
        StringBuilder outStr = new StringBuilder("");
        for(int j = 0; j < column; j++){
            for(i = 0; i < row; i++){

                if((char) arr[i][j] != ' ') {
                    outStr.append((char) arr[i][j]);
                }



            }
            outStr.append(' ');
        }

        StringBuilder os = returnOutputString(outStr);
        System.out.println(os);

    }
}