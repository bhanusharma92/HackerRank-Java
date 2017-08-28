import java.util.Scanner;
import java.util.ArrayList;
class ReverseNumber {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		ArrayList<Integer> reverse = new ArrayList<Integer>();
		while(number != 0){
			reverse.add(number%10);
			number /= 10; 
		}
		//System.out.print(reverse.get(0) + " ");
		for(int i = 0; i < reverse.size(); i++){
			System.out.print(reverse.get(i) + " ");
		}
		
	}
}