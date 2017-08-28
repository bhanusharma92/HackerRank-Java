import java.util.Scanner;
import java.util.Arrays;
class MarcsCakewalk{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		double miles = 0;
		for(int i = 0; i < n; i++){
			ar[i] = sc.nextInt();
		}
		Arrays.sort(ar);
		 /*for (int number : ar) {
   			System.out.println("Number = " + number);
			}*/
		for(int i = n - 1; i >= 0; i--){
			miles = miles + Math.pow(2, n - i - 1) * (double)ar[i];
			// System.out.println("Math.pow(2, i) * (double)ar[i]: " + Math.pow(2, i) * (double)ar[i]);
			// System.out.println("i: "+ i + " miles: " +miles);
		}
		System.out.println(new Double(miles).longValue());
	}
}