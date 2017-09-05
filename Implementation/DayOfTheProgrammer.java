import java.util.Scanner;
class DayOfTheProgrammer{
    // 14 feb -> 32
    // 24 feb -> 42
    // 28 feb -> 46
    // 1 mar -> 47
    // 31 mar -> 77
    // 1 apr -> 78
    // 30 apr -> 107
    // 1 may -> 108
    // 31 may -> 138
    // 1 jun -> 139
    // 30 jun -> 168
    // 1 jul -> 169
    // 31 jul -> 199
    // 1 aug -> 200
    // 31 aug -> 230
    // 1 sept -> 231
    // 26 sept -> 256
    // 27 sept -> 257
    // 28 sept -> 258
    // 29 sept -> 259
    // 30 sept -> 260

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // less than 1918
        if(year < 1918){
            if(year % 4 == 0){
                System.out.println("12.09."+String.valueOf(year));
            }else{
                System.out.println("13.09."+String.valueOf(year));
            }
        }else if(year == 1918){ // equal to 1918
            System.out.println("26.09.1918");
        }else if(year > 1918){ // greater than 1918
            if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
                System.out.println("12.09."+String.valueOf(year));
            }else{
                System.out.println("13.09."+String.valueOf(year));
            }
        }

    }
}