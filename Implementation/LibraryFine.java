import java.util.Scanner;
class LibraryFine{
     static int calculateFine(int dayActual,int monthActual,int yearActual,int dayExpected,int monthExpected,int yearExpected){
         if(yearActual > yearExpected){
             return 10000;
         }else if(yearActual < yearExpected){
             return 0;
         }else{
             if(monthActual > monthExpected){
                 return 500 * (monthActual - monthExpected);
             }else if(monthActual < monthExpected){
                 return 0;
             }else{
                 if(dayActual > dayExpected){
                     return 15 * (dayActual - dayExpected);
                 }else{
                     return 0;
                 }
             }
         }
    }
    public static void main(String args[]){
        int dayActual, monthActual, yearActual;
        int dayExpected, monthExpected, yearExpected;
        Scanner sc = new Scanner(System.in);
        dayActual = sc.nextInt();
        monthActual = sc.nextInt();
        yearActual = sc.nextInt();
        dayExpected = sc.nextInt();
        monthExpected = sc.nextInt();
        yearExpected = sc.nextInt();

        System.out.println(calculateFine(dayActual, monthActual, yearActual, dayExpected, monthExpected, yearExpected));
    }
}