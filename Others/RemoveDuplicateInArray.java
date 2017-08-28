import java.util.Scanner;
class RemoveDuplicateInArray{
	static void removeAndShift(int arr[], int index, int arraySize){
		for(int i = index; i < arraySize - 1; i++){
			arr[i] = arr[i + 1];
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		int arraySize = n;
		for(int i = 0; i < arraySize; i++){
			for(int j = i + 1; j < arraySize; j++){
				if(arr[i] == arr[j]){
					removeAndShift(arr, j, arraySize);
					arraySize--;
				}
			}
		}
		System.out.println("output:");
		for(int i = 0; i < arraySize; i++){
			System.out.print(arr[i] + "\t");
		}
	}
}